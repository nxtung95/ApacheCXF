package timewriter.soap.api.soap;

import timewriter.soap.api.HelloWorldServicePort;
import timewriter.soap.api.LogoutServicePort;

import javax.jws.WebService;

@WebService( name = "HelloWorldService", targetNamespace = "nl.timewriter.api", endpointInterface = "timewriter.soap.api.HelloWorldServicePort" )
public class HelloWorldApi implements HelloWorldServicePort
{

  @Override
  public String helloWorld(String request) {
    return "Hello: " + request;
  }
}
