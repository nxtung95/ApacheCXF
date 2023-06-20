package timewriter.soap.main;

import com.sun.xml.internal.ws.api.BindingID;
import com.sun.xml.internal.ws.transport.http.server.EndpointImpl;
import org.eclipse.jetty.http.spi.JettyHttpServer;
import org.eclipse.jetty.http.spi.JettyHttpServerProvider;
import org.eclipse.jetty.server.*;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
//import timewriter.soap.api.soap.TimeWriterApi;
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

//      TimeWriterApi implementor = new TimeWriterApi();
//      EndpointImpl twApiEndpoint = new EndpointImpl( BindingID.parse( implementor.getClass() ), implementor );

//      twApiEndpoint.publish( new JettyHttpServer( server, true ).createContext( "/api" ) );//$NON-NLS-1$

      server.start();
    }
    catch ( Exception e )
    {
      e.printStackTrace();
    }
  }
}
