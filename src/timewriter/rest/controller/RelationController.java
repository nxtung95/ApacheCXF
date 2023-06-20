package timewriter.rest.controller;

import timewriter.object.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/api/relation")
public class RelationController extends BaseController {
    @Path("")
    @GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public GetRelationsResponse getRelations(@HeaderParam("securityToken") String securityToken,
										   @QueryParam("id1") long id1,
										   @QueryParam("id2")long id2,
										   @QueryParam("relationType")String relationType, Filters filters )
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Path("")
    @PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public UpdateRelationResponse updateRelation(@HeaderParam("securityToken") String securityToken, Relation relation )
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Path("/{relationId}")
    @DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public DeleteRelationResponse deleteRelation(@HeaderParam("securityToken") String securityToken,
											   @QueryParam("id1") long id1,
											   @QueryParam("id2")long id2,
											   @QueryParam("relationType") String relationType )
    {
        // TODO Auto-generated method stub
        return null;
    }
}
