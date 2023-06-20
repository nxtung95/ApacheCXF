package timewriter.soap.main;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpServer;
import com.sun.xml.internal.ws.api.BindingID;
import com.sun.xml.internal.ws.transport.http.server.EndpointImpl;
import org.eclipse.jetty.http.spi.JettyHttpServer;
import org.eclipse.jetty.http.spi.JettyHttpServerProvider;
import org.eclipse.jetty.server.*;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
//import timewriter.soap.api.soap.TimeWriterApi;
import timewriter.soap.api.soap.*;
import timewriter.soap.api.wsdl.TimeWriterWsdlServlet;

public class TimeWriterServer
{
  public static void main( String[] args )
  {
    Server server = new Server();
    try
    {
      System.setProperty( "com.sun.net.httpserver.HttpServerProvider", JettyHttpServerProvider.class.getName() ); //$NON-NLS-1$
      JettyHttpServerProvider.setServer( server );

      ServletContextHandler contextHandler = new ServletContextHandler( ServletContextHandler.SESSIONS | ServletContextHandler.SECURITY );
      //contextHandler.setInitParameter( "org.eclipse.jetty.servlet.Default.dirAllowed", "false" ); //$NON-NLS-1$ //$NON-NLS-2$

      ContextHandlerCollection contexts = new ContextHandlerCollection();

      contextHandler.addServlet( new ServletHolder( new TimeWriterWsdlServlet() ), "/wsdl/timewriterapi.wsdl" ); //$NON-NLS-1$

      contexts.setHandlers( new Handler[] { contextHandler } );
      server.setHandler( contexts );

      HttpConfiguration http_config = new HttpConfiguration();
      ServerConnector http = new ServerConnector( server, new HttpConnectionFactory( http_config ) );
      http.setPort( 80 );
      server.addConnector( http );

      LoginApi loginApi = new LoginApi();
      EndpointImpl loginApiEndpoint = new EndpointImpl( BindingID.parse( loginApi.getClass() ), loginApi );

      LogoutApi logoutApi = new LogoutApi();
      EndpointImpl logoutApiEndpoint = new EndpointImpl( BindingID.parse( logoutApi.getClass() ), logoutApi );

      HelloWorldApi helloWorldApi = new HelloWorldApi();
      EndpointImpl helloWorldApiEndpoint = new EndpointImpl( BindingID.parse( helloWorldApi.getClass() ), helloWorldApi );

      GetBookingsApi getBookingsApi = new GetBookingsApi();
      EndpointImpl getBookingsApiEndpoint = new EndpointImpl( BindingID.parse( getBookingsApi.getClass() ), getBookingsApi );

      UpdateBookingsApi updateBookingsApi = new UpdateBookingsApi();
      EndpointImpl updateBookingsApiEndpoint = new EndpointImpl( BindingID.parse( updateBookingsApi.getClass() ), updateBookingsApi );

      HttpServer jettyHttpServer = new JettyHttpServer( server, true );
      HttpContext loginContext = jettyHttpServer.createContext( "/api" );
      HttpContext logoutContext = jettyHttpServer.createContext( "/api" );
      HttpContext helloWorldContext = jettyHttpServer.createContext( "/api" );
      HttpContext getBookingsContext = jettyHttpServer.createContext( "/api" );
      HttpContext updateBookingsContext = jettyHttpServer.createContext( "/api" );

      loginApiEndpoint.publish(loginContext);//$NON-NLS-1$
      logoutApiEndpoint.publish(logoutContext);//$NON-NLS-1$
      helloWorldApiEndpoint.publish(helloWorldContext);//$NON-NLS-1$
      getBookingsApiEndpoint.publish(getBookingsContext);//$NON-NLS-1$
      updateBookingsApiEndpoint.publish(updateBookingsContext);//$NON-NLS-1$

      server.start();
    }
    catch ( Exception e )
    {
      e.printStackTrace();
    }
  }
}
