package timewriter.rest.controller;

import timewriter.object.*;

import javax.servlet.http.HttpServlet;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/rest/api")
public class LoginController extends HttpServlet {

    @POST
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public LoginResponse login(Login loginRequest) {
        LoginResponse response = new LoginResponse();
        LoginResult result = new LoginResult();
        if (loginRequest == null) {
            result.setError(true);
            result.setErrorMessage( "Invalid login: must pass login info" );
            response.setResult(result);
            return response;
        }
        if ("123".equals(loginRequest.getApiKey()) && "123".equals(loginRequest.getUserKey()) )
            result.setSecurityToken("123");
        else {
            result.setError(true);
            result.setErrorMessage("Invalid login: apiKey and userKey must be 123");
            response.setResult(result);
            return response;
        }
        response.setResult(result);
        return response;
    }

    @Path("/logout")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void logout(Logout logoutRequest) {

    }

    @Path("/hello")
    @GET
    public String helloWorld(@QueryParam("request") String request) {
        return "Hello: " + request;
    }
}
