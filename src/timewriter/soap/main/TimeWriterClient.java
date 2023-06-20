package timewriter.soap.main;

import timewriter.object.Booking;
import timewriter.object.GetBookingsResult;
import timewriter.object.LoginResult;
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
    	loginServicePort = new LoginService( new URL( "http://localhost/wsdl/timewriterapi.wsdl" ) ).getLoginServicePort();

      LoginResult result = loginServicePort.login( "123", "123", "test" );

      if ( result.isError() )
      {
        System.err.println( result.getErrorMessage() );
        return;
      }

      token = result.getSecurityToken();

      System.out.println( "Received securityToken: " + token );

	  getBookingsServicePort = new GetBookingsService(new URL( "http://localhost/wsdl/timewriterapi.wsdl" ) ).getGetBookingsServicePort();
      GetBookingsResult bookings = getBookingsServicePort.getBookings( token, null, null, null );
      System.out.println( "Number of bookings: " + bookings.getBookingList().getBooking().size() );

      updateBookingServicePort = new UpdateBookingService(new URL( "http://localhost/wsdl/timewriterapi.wsdl" )).getUpdateBookingServicePort();
      Booking booking = new Booking();
      updateBookingServicePort.updateBooking( token, booking, false );

      bookings = getBookingsServicePort.getBookings( token, null, null, null );
      System.out.println( "Number of bookings: " + bookings.getBookingList().getBooking().size() );

      helloWorldServicePort = new HelloWorldService(new URL("http://localhost/wsdl/timewriterapi.wsdl")).getHelloWorldServicePort();
      String helloRes = helloWorldServicePort.helloWorld("Rinse");
      System.out.println(helloRes);
    }
    catch ( Exception e )
    {
      e.printStackTrace();
    }

  }
}
