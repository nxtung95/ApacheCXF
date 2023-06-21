package timewriter.main;

import timewriter.object.*;
import timewriter.soap.api.*;

import java.net.URL;

public class TimeWriterClient
{
  private static LoginServicePort loginServicePort;
  private static GetBookingsServicePort getBookingsServicePort;
  private static UpdateBookingServicePort updateBookingServicePort;
  private static HelloWorldServicePort helloWorldServicePort;

  private static String token;

  public static void main( String[] args )
  {
    try {
      System.out.println( "=============== START SOAP Client ============= ");
      URL url = new URL("http://localhost:8080/wsdl/timewriterapi.wsdl");
    	loginServicePort = new LoginService(url).getLoginServicePort();

      LoginResult result = loginServicePort.login( "123", "123", "test" );

      if ( result.isError() )
      {
        System.err.println( result.getErrorMessage() );
        return;
      }

      token = result.getSecurityToken();

      System.out.println( "Received securityToken: " + token );

	  getBookingsServicePort = new GetBookingsService(url).getGetBookingsServicePort();
      GetBookingsResult bookings = getBookingsServicePort.getBookings( token, null, null, null );
      System.out.println( "Number of bookings: " + bookings.getBookingList().getBooking().size() );

      updateBookingServicePort = new UpdateBookingService(url).getUpdateBookingServicePort();
      Booking booking = new Booking();
      updateBookingServicePort.updateBooking( token, booking, false );

      bookings = getBookingsServicePort.getBookings( token, null, null, null );
      System.out.println( "Number of bookings: " + bookings.getBookingList().getBooking().size() );

      helloWorldServicePort = new HelloWorldService(url).getHelloWorldServicePort();
      HelloWorldRequest rq = new HelloWorldRequest();
      rq.setRequest("Rinse");
      HelloWorldResponse res = helloWorldServicePort.helloWorld(rq);
      System.out.println(res.getResponse());
      System.out.println( "=============== End SOAP Client ============= ");

      System.out.println( "=============== START Rest Client ============= ");
      System.out.println( "=============== End Rest Client ============= ");
    }
    catch ( Exception e )
    {
      e.printStackTrace();
    }

  }
}
