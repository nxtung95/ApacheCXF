package timewriter.soap.api.soap;

import timewriter.object.*;
import timewriter.soap.api.TimeWriterServicePort;

import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;

@WebService( name = "TimeWriterService", targetNamespace = "nl.timewriter.api", endpointInterface = "timewriter.soap.api.TimeWriterServicePort" )
public class TimeWriterApi implements TimeWriterServicePort
{
  private static ArrayList<Booking> _bookings;

  @Override
  public LoginResult login( String apiKey, String userKey, String softwareDesc )
  {
    LoginResult result = new LoginResult();
    if ( apiKey.equals( "123" ) && userKey.equals( "123" ) )
      result.setSecurityToken( "123" );
    else
    {
      result.setError( true );
      result.setErrorMessage( "Invalid login: apiKey and userKey must be 123" );
    }
    return result;
  }

  @Override
  public GetBookingsResult getBookings( String securityToken, XMLGregorianCalendar startDate, XMLGregorianCalendar endDate, Filters filters )
  {
    GetBookingsResult result = new GetBookingsResult();
    if ( checkSecurityToken( securityToken, result ) )
    {
      result.setBookingList( new BookingList() );
      result.getBookingList().getBooking().addAll( getBookings() );
    }
    return result;
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

  @Override
  public UpdateBookingResult updateBooking( String securityToken, Booking booking, boolean roundTimes )
  {
    UpdateBookingResult result = new UpdateBookingResult();
    if ( checkSecurityToken( securityToken, result ) )
    {
      // in real a booking with an ID will be updated.. otherwise it will be added to the database
      _bookings.add( booking );
    }
    return result;
  }

  @Override
  public void logout( String securityToken )
  {
  }

  @Override
  public GetAspectsResult getAspects( String securityToken, String aspectType, Filters filters )
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public UpdateAspectResult updateAspect( String securityToken, Aspect aspect )
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public DeleteAspectResult deleteAspect( String securityToken, long id )
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public GetRelationsResult getRelations( String securityToken, long id1, long id2, String relationType, Filters filters )
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public UpdateRelationResult updateRelation( String securityToken, Relation relation )
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public DeleteRelationResult deleteRelation( String securityToken, long id1, long id2, String relationType )
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public DeleteBookingResult deleteBooking( String securityToken, long id )
  {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String helloWorld(String request) {
    return "Hello: " + request;
  }

}
