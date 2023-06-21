package timewriter.soap.api.wsdl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class TimeWriterWsdlServlet extends HttpServlet
{

  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException
  {
    System.out.println("Do get timewriterapi.wsdl");
    String wsdl = loadTextFile( "timewriterapi.wsdl" );

    // our server must run on different domains, but the wsdl must contain the right domain.. replace the "#SOAP_URL#"
    wsdl = wsdl.replace( "#SOAP_URL#", getRequestUrl( req ) + "/soap/api/" );

    sendXML( wsdl, resp );
  }

  public static String getRequestUrl( HttpServletRequest request )
  {
    String servername = request.getServerName();
    return request.getScheme() + "://" + servername + ":8080"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
  }

  protected void sendXML( String xmlContent, HttpServletResponse response ) throws IOException
  {
    response.setStatus( HttpServletResponse.SC_OK );
    response.setContentType( "text/xml;charset=UTF-8" );

    PrintWriter pw = response.getWriter();
    try
    {
      pw.println( xmlContent );
      pw.flush();
    }
    finally
    {
      pw.close();
    }
  }

  private synchronized static String loadTextFile( String fileName )
  {
    InputStream is = null;
    BufferedReader br = null;
    String line;
    StringBuffer list = new StringBuffer();

    try
    {
      is = TimeWriterWsdlServlet.class.getResourceAsStream( fileName );
      br = new BufferedReader( new InputStreamReader( is ) );
      while ( null != ( line = br.readLine() ) )
      {
        list.append( line );
      }
    }
    catch ( Exception e )
    {
      throw new RuntimeException( "error reading file from jar", e ); //$NON-NLS-1$
    }
    finally
    {
      try
      {
        if ( br != null )
          br.close();
        if ( is != null )
          is.close();
      }
      catch ( IOException e )
      {
        throw new RuntimeException( "error reading file from jar", e ); //$NON-NLS-1$
      }
    }
    return list.toString();
  }
}
