package timewriter.soap.api.soap;

import timewriter.object.DeleteBookingResult;
import timewriter.object.DeleteRelationResult;
import timewriter.soap.api.DeleteBookingServicePort;
import timewriter.soap.api.DeleteRelationServicePort;

import javax.jws.WebService;

@WebService( name = "DeleteRelationService", targetNamespace = "nl.timewriter.api", endpointInterface = "timewriter.soap.api.DeleteRelationServicePort" )
public class DeleteRelationApi implements DeleteRelationServicePort
{
  @Override
  public DeleteRelationResult deleteRelation(String securityToken, long id1, long id2, String relationType) {
    return null;
  }
}
