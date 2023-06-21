package timewriter.soap.api.soap;

import timewriter.object.Booking;
import timewriter.object.LoginResult;
import timewriter.object.RequestResult;
import timewriter.object.UpdateBookingResult;
import timewriter.soap.api.LoginServicePort;
import timewriter.soap.api.UpdateBookingServicePort;

import javax.jws.WebService;

@WebService( name = "UpdateBookingService", targetNamespace = "nl.timewriter.api", endpointInterface = "timewriter.soap.api.UpdateBookingServicePort" )
public class UpdateBookingsApi implements UpdateBookingServicePort
{

  @Override
  public UpdateBookingResult updateBooking(String securityToken, Booking booking, boolean roundTimes) {
      UpdateBookingResult result = new UpdateBookingResult();
      if (checkSecurityToken( securityToken, result ) )
      {
        // in real a booking with an ID will be updated.. otherwise it will be added to the database
        GetBookingsApi._bookings.add( booking );
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
}
