package timewriter.soap.api.soap;

import timewriter.object.*;
import timewriter.soap.api.GetBookingsServicePort;

import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;

@WebService( name = "GetBookingsService", targetNamespace = "nl.timewriter.api", endpointInterface = "timewriter.soap.api.GetBookingsServicePort" )
public class GetBookingsApi implements GetBookingsServicePort
{
  public static ArrayList<Booking> _bookings;

  @Override
  public GetBookingsResult getBookings(String securityToken, XMLGregorianCalendar startDate, XMLGregorianCalendar endDate, Filters filters) {
      GetBookingsResult result = new GetBookingsResult();
      if ( checkSecurityToken( securityToken, result ) )
      {
        result.setBookingList( new BookingList() );
        result.getBookingList().getBooking().addAll( getBookings() );
      }
      return result;
  }

  private boolean checkSecurityToken( String securityToken, RequestResult result )
  {
    if ( !securityToken.equals( "123" ) )
    {
      result.setError( true );
      result.setErrorMessage( "Invalid securityToken" );
      return false;
    }
    return true;
  }

  private static synchronized ArrayList<Booking> getBookings()
  {
    if ( _bookings == null )
    {
      _bookings = new ArrayList<Booking>();
      _bookings.add( createBooking( 1 ) );
      _bookings.add( createBooking( 2 ) );
      _bookings.add( createBooking( 3 ) );
    }
    return _bookings;
  }

  private static Booking createBooking( long i )
  {
    Booking b = new Booking();
    b.setId( i );
    b.setIdITMED( new Long( 123 ) );
    return b;
  }

}
