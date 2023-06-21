package timewriter.soap.api.soap;

import timewriter.object.*;
import timewriter.soap.api.UpdateBookingServicePort;
import timewriter.soap.api.UpdateRelationServicePort;

import javax.jws.WebService;

@WebService( name = "UpdateRelationService", targetNamespace = "nl.timewriter.api", endpointInterface = "timewriter.soap.api.UpdateRelationServicePort" )
public class UpdateRelationsApi implements UpdateRelationServicePort
{
    @Override
    public UpdateRelationResult updateRelation(String securityToken, Relation relation) {
        return null;
    }
}
