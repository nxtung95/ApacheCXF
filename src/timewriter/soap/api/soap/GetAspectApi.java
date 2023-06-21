package timewriter.soap.api.soap;

import timewriter.object.*;
import timewriter.soap.api.GetAspectsServicePort;
import timewriter.soap.api.GetBookingsServicePort;

import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;

@WebService( name = "GetAspectsService", targetNamespace = "nl.timewriter.api", endpointInterface = "timewriter.soap.api.GetAspectsServicePort" )
public class GetAspectApi implements GetAspectsServicePort
{

  @Override
  public GetAspectsResult getAspects(String securityToken, String aspectType, Filters filters) {
    return null;
  }
}
