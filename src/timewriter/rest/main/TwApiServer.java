package timewriter.rest.main;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;
import org.apache.cxf.jaxrs.openapi.OpenApiFeature;
import timewriter.rest.controller.AspectController;
import timewriter.rest.controller.BookingController;
import timewriter.rest.controller.LoginController;
import timewriter.rest.controller.RelationController;

import java.util.HashSet;
import java.util.Set;

public class TwApiServer {
    public static void main(String[] args) {
        try {
            JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
            factoryBean.setResourceProvider(
                    new SingletonResourceProvider(new LoginController()));
            factoryBean.setResourceProvider(
                    new SingletonResourceProvider(new BookingController()));
            factoryBean.setResourceProvider(
                    new SingletonResourceProvider(new AspectController()));
            factoryBean.setResourceProvider(
                    new SingletonResourceProvider(new RelationController()));

            OpenApiFeature openApiFeature = new OpenApiFeature();
            openApiFeature.setPrettyPrint(true);
            Set<String> resourcePackages = new HashSet<>();
            resourcePackages.add("timewriter.rest");
            openApiFeature.setResourcePackages(resourcePackages);

            factoryBean.getFeatures().add(openApiFeature);
            factoryBean.setAddress("http://localhost:8080/");
            factoryBean.setProvider(new JacksonJsonProvider());
            Server server = factoryBean.create();
            System.out.println("Server started!! " + server.isStarted());
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}
