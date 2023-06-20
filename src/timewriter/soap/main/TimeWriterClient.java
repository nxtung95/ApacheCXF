package timewriter.soap.main;

import timewriter.object.Booking;
import timewriter.object.GetBookingsResult;
import timewriter.object.LoginResult;
import timewriter.soap.api.*;

import java.net.URL;

public class TimeWriterClient
{
  private static TimeWriterServicePort port;
  private static String token;

  public static void main( String[] args )
  {
    try
    {
      port = new TimeWriterService( new URL( "http://localhost/wsdl/timewriterapi.wsdl" ) ).getTimeWriterServicePort();

      LoginResult result = port.login( "123", "123", "test" );

      if ( result.isError() )
      {
        System.err.println( result.getErrorMessage() );
        return;
      }

      token = result.getSecurityToken();

      System.out.println( "Received securityToken: " + token );

      GetBookingsResult bookings = port.getBookings( token, null, null, null );
      System.out.println( "Number of bookings: " + bookings.getBookingList().getBooking().size() );

      Booking booking = new Booking();
      port.updateBooking( token, booking, false );

      bookings = port.getBookings( token, null, null, null );
      System.out.println( "Number of bookings: " + bookings.getBookingList().getBooking().size() );

      String helloRes = port.helloWorld("Rinse");
      System.out.println(helloRes);
    }
    catch ( Exception e )
    {
      e.printStackTrace();
    }

  }
}
