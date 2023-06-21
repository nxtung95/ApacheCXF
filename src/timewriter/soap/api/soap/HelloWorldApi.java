package timewriter.soap.api.soap;

import timewriter.object.HelloWorldRequest;
import timewriter.object.HelloWorldResponse;
import timewriter.soap.api.HelloWorldServicePort;

import javax.jws.WebService;

@WebService( name = "HelloWorldService", targetNamespace = "nl.timewriter.api", endpointInterface = "timewriter.soap.api.HelloWorldServicePort" )
public class HelloWorldApi implements HelloWorldServicePort
{
  @Override
  public HelloWorldResponse helloWorld(HelloWorldRequest request) {
    HelloWorldResponse response = new HelloWorldResponse();
    response.setResponse("Hello: " + request.getRequest());
    return response;
  }
}
