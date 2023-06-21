package timewriter.main;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpServer;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;
import org.apache.cxf.jaxrs.openapi.OpenApiFeature;
import org.eclipse.jetty.http.spi.JettyHttpServer;
import org.eclipse.jetty.http.spi.JettyHttpServerProvider;
import org.eclipse.jetty.server.*;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import timewriter.rest.controller.AspectController;
import timewriter.rest.controller.BookingController;
import timewriter.rest.controller.LoginController;
import timewriter.rest.controller.RelationController;
import timewriter.soap.api.soap.*;
import timewriter.soap.api.wsdl.TimeWriterWsdlServlet;

import javax.xml.ws.Endpoint;
import java.util.HashSet;
import java.util.Set;

public class TimeWriterServer
{
  public static void main( String[] args )
  {
    Server server = new Server();
    try
    {
      System.setProperty( "com.sun.net.httpserver.HttpServerProvider", JettyHttpServerProvider.class.getName() ); //$NON-NLS-1$
      JettyHttpServerProvider.setServer( server );

      // ==================== Start SOAP Config Server ====================
      HttpConfiguration http_config = new HttpConfiguration();
      ServerConnector http = new ServerConnector( server, new HttpConnectionFactory( http_config ) );
      http.setPort( 8080 );
      server.addConnector( http );

      ServletContextHandler soapContextHandler = new ServletContextHandler( ServletContextHandler.SESSIONS | ServletContextHandler.SECURITY );
      soapContextHandler.addServlet( new ServletHolder( new TimeWriterWsdlServlet() ), "/wsdl/timewriterapi.wsdl" );

      ContextHandlerCollection contexts = new ContextHandlerCollection();
      contexts.setHandlers( new Handler[] { soapContextHandler } );
      server.setHandler(contexts);

      Endpoint loginEndpoint = Endpoint.create(new LoginApi());
      Endpoint logoutEndpoint = Endpoint.create(new LogoutApi());
      Endpoint helloWorldEndpoint = Endpoint.create(new HelloWorldApi());

      Endpoint getBookingsEndpoint = Endpoint.create(new GetBookingsApi());
      Endpoint updateBookingsEndpoint = Endpoint.create(new UpdateBookingsApi());
      Endpoint deleteBookingEndpoint = Endpoint.create(new DeleteBookingsApi());

      Endpoint getAspectEndpoint = Endpoint.create(new GetAspectApi());
      Endpoint updateAspectEndpoint = Endpoint.create(new UpdateAspectApi());
      Endpoint deleteAspectEndpoint = Endpoint.create(new DeleteAspectApi());

      Endpoint getRelationEndpoint = Endpoint.create(new GetRelationApi());
      Endpoint updateRelationEndpoint = Endpoint.create(new UpdateRelationsApi());
      Endpoint deleteRelationEndpoint = Endpoint.create(new DeleteRelationApi());


      HttpServer jettyHttpServer = new JettyHttpServer(server, true);
      HttpContext loginServerContext = jettyHttpServer.createContext("/soap/api/login");
      HttpContext logoutServerContext = jettyHttpServer.createContext("/soap/api/logout");
      HttpContext helloServerContext = jettyHttpServer.createContext("/soap/api/helloWorld");

      HttpContext getBookingServerContext = jettyHttpServer.createContext("/soap/api/getBookings");
      HttpContext updateBookingServerContext = jettyHttpServer.createContext("/soap/api/updateBooking");
      HttpContext deleteBookingServerContext = jettyHttpServer.createContext("/soap/api/deleteBooking");

      HttpContext getAspectServerContext = jettyHttpServer.createContext("/soap/api/getAspects");
      HttpContext updateAspectServerContext = jettyHttpServer.createContext("/soap/api/updateAspect");
      HttpContext deleteAspectServerContext = jettyHttpServer.createContext("/soap/api/deleteAspect");

      HttpContext getRelationsServerContext = jettyHttpServer.createContext("/soap/api/getRelations");
      HttpContext updateRelationServerContext = jettyHttpServer.createContext("/soap/api/updateRelation");
      HttpContext deleteRelationServerContext = jettyHttpServer.createContext("/soap/api/deleteRelation");

      loginEndpoint.publish(loginServerContext);
      logoutEndpoint.publish(logoutServerContext);
      helloWorldEndpoint.publish(helloServerContext);

      getBookingsEndpoint.publish(getBookingServerContext);
      updateBookingsEndpoint.publish(updateBookingServerContext);
      deleteBookingEndpoint.publish(deleteBookingServerContext);

      getAspectEndpoint.publish(getAspectServerContext);
      updateAspectEndpoint.publish(updateAspectServerContext);
      deleteAspectEndpoint.publish(deleteAspectServerContext);

      getRelationEndpoint.publish(getRelationsServerContext);
      updateRelationEndpoint.publish(updateRelationServerContext);
      deleteRelationEndpoint.publish(deleteRelationServerContext);

      // ==================== End SOAP Config Server ====================

    // ==================== Start Rest Config Server ====================
      HttpConfiguration restHttpConfig = new HttpConfiguration();
      ServerConnector restHttp = new ServerConnector(server, new HttpConnectionFactory(restHttpConfig));
      restHttp.setPort(8081);
      server.addConnector(restHttp);

//      ServletContextHandler restContextHandler = new ServletContextHandler( ServletContextHandler.SESSIONS | ServletContextHandler.SECURITY );
//      ServletHolder restServlet = restContextHandler.addServlet(ServletContainer.class, "/rest/api/");
//      restServlet.setInitOrder(0);
//      restServlet.setInitParameter("jersey.config.server.provider.classnames", LoginController.class.getCanonicalName());

    // ==================== End Rest Config Server ====================

      server.start();
      System.out.println("Server started!! " + server.isStarted());
    }
    catch ( Exception e )
    {
      e.printStackTrace();
    }
  }
}
