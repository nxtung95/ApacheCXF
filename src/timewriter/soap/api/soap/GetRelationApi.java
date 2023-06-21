package timewriter.soap.api.soap;

import timewriter.object.Filters;
import timewriter.object.GetAspectsResult;
import timewriter.object.GetRelationsResult;
import timewriter.soap.api.GetAspectsServicePort;
import timewriter.soap.api.GetRelationsServicePort;

import javax.jws.WebService;

@WebService( name = "GetRelationsService", targetNamespace = "nl.timewriter.api", endpointInterface = "timewriter.soap.api.GetRelationsServicePort" )
public class GetRelationApi implements GetRelationsServicePort
{
  @Override
  public GetRelationsResult getRelations(String securityToken, long id1, long id2, String relationType, Filters filters) {
    return null;
  }
}
