package timewriter.soap.api.soap;

import timewriter.object.DeleteAspectResult;
import timewriter.object.DeleteBookingResult;
import timewriter.soap.api.DeleteAspectServicePort;
import timewriter.soap.api.DeleteBookingServicePort;

import javax.jws.WebService;

@WebService( name = "DeleteAspectService", targetNamespace = "nl.timewriter.api", endpointInterface = "timewriter.soap.api.DeleteAspectServicePort" )
public class DeleteAspectApi implements DeleteAspectServicePort
{
  @Override
  public DeleteAspectResult deleteAspect(String securityToken, long id) {
    return null;
  }
}
