package timewriter.soap.api.soap;

import timewriter.soap.api.LogoutServicePort;

import javax.jws.WebService;

@WebService( name = "LogoutService", targetNamespace = "nl.timewriter.api", endpointInterface = "timewriter.soap.api.LogoutServicePort" )
public class LogoutApi implements LogoutServicePort
{
  @Override
  public void logout(String securityToken) {

  }
}
