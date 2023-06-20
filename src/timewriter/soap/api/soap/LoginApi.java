package timewriter.soap.api.soap;

import timewriter.object.LoginResult;
import timewriter.soap.api.LoginServicePort;

import javax.jws.WebService;

@WebService( name = "LoginService", targetNamespace = "nl.timewriter.api", endpointInterface = "timewriter.soap.api.LoginServicePort" )
public class LoginApi implements LoginServicePort
{
  @Override
  public LoginResult login( String apiKey, String userKey, String softwareDesc )
  {
    LoginResult result = new LoginResult();
    if ( apiKey.equals( "123" ) && userKey.equals( "123" ) )
      result.setSecurityToken( "123" );
    else
    {
      result.setError( true );
      result.setErrorMessage( "Invalid login: apiKey and userKey must be 123" );
    }
    return result;
  }
}
