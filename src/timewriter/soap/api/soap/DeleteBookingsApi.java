package timewriter.soap.api.soap;

import timewriter.object.*;
import timewriter.soap.api.DeleteBookingServicePort;
import timewriter.soap.api.GetBookingsServicePort;

import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;

@WebService( name = "DeleteBookingService", targetNamespace = "nl.timewriter.api", endpointInterface = "timewriter.soap.api.DeleteBookingServicePort" )
public class DeleteBookingsApi implements DeleteBookingServicePort
{
  @Override
  public DeleteBookingResult deleteBooking(String securityToken, long id) {
    return null;
  }
}
