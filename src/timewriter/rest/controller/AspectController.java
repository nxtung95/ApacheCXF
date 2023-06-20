package timewriter.rest.controller;

import timewriter.object.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/api/aspect")
public class AspectController extends BaseController {
    @Path("")
    @GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public GetAspectsResponse getAspects(@HeaderParam("securityToken") String securityToken, @QueryParam("securityToken") String aspectType, Filters filters )
    {
        // TODO Auto-generated method stub
        return null;
    }
    @Path("")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public UpdateAspectResponse updateAspect(@HeaderParam("securityToken") String securityToken, Aspect aspect )
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Path("/{aspectId}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public DeleteAspectResponse deleteAspect(@HeaderParam("securityToken") String securityToken, @PathParam("aspectId") long id )
    {
        // TODO Auto-generated method stub
        return null;
    }
}
