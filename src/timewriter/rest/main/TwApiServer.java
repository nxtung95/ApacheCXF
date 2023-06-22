package timewriter.rest.main;

import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import timewriter.rest.controller.LoginController;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class TwApiServer {
    public static void main(String[] args) {
        try {
            URI baseUri = UriBuilder.fromUri("http://localhost/").port(8080).build();
            ResourceConfig config = new ResourceConfig(LoginController.class);
            Server server = JettyHttpContainerFactory.createServer(baseUri, config);

//            JaxWsServerFactoryBean soapServerBean = new JaxWsServerFactoryBean();
//            soapServerBean.setWsdlLocation("/timewriter/soap/api/wsdl/timewriterapi.wsdl");

//            HelloWorldServicePort helloWorldService = new HelloWorldApi();
//            soapServerBean.setServiceClass(HelloWorldApi.class);
//            soapServerBean.setServiceBean(helloWorldService);
//            soapServerBean.setAddress("http://localhost:8080/soap/api/helloWorld");
//
//            Server server = soapServerBean.create();
//            System.out.println("Server started!! " + server.isStarted());

//            JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
//            factoryBean.setResourceProvider(
//                    new SingletonResourceProvider(new LoginController()));
//            factoryBean.setResourceProvider(
//                    new SingletonResourceProvider(new BookingController()));
//            factoryBean.setResourceProvider(
//                    new SingletonResourceProvider(new AspectController()));
//            factoryBean.setResourceProvider(
//                    new SingletonResourceProvider(new RelationController()));
//
//            OpenApiFeature openApiFeature = new OpenApiFeature();
//            openApiFeature.setPrettyPrint(true);
//            Set<String> resourcePackages = new HashSet<>();
//            resourcePackages.add("timewriter.rest");
//            openApiFeature.setResourcePackages(resourcePackages);
//
//            factoryBean.getFeatures().add(openApiFeature);
//            factoryBean.setAddress("http://localhost:8080/");
//            factoryBean.setProvider(new JacksonJsonProvider());
//            Server server = factoryBean.create();
//            System.out.println("Server started!! " + server.isStarted());
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}
