package timewriter.soap.api.soap;

import timewriter.object.Aspect;
import timewriter.object.UpdateAspectResult;
import timewriter.soap.api.UpdateAspectServicePort;

import javax.jws.WebService;

@WebService( name = "UpdateAspectService", targetNamespace = "nl.timewriter.api", endpointInterface = "timewriter.soap.api.UpdateAspectServicePort" )
public class UpdateAspectApi implements UpdateAspectServicePort
{
    @Override
    public UpdateAspectResult updateAspect(String securityToken, Aspect aspect) {
        return null;
    }
}
