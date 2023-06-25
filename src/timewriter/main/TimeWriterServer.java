package timewriter.main;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;
import org.apache.cxf.jaxrs.openapi.OpenApiFeature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import timewriter.rest.controller.AspectController;
import timewriter.rest.controller.BookingController;
import timewriter.rest.controller.LoginController;
import timewriter.rest.controller.RelationController;
import timewriter.soap.api.soap.*;

import javax.xml.ws.Endpoint;
import java.util.HashSet;
import java.util.Set;

public class TimeWriterServer {
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
            factoryBean.setServiceBean(new HelloWorldApi());

            OpenApiFeature openApiFeature = new OpenApiFeature();
            openApiFeature.setPrettyPrint(true);
            Set<String> resourcePackages = new HashSet<>();
            resourcePackages.add("timewriter.rest");
            openApiFeature.setResourcePackages(resourcePackages);

            factoryBean.getFeatures().add(openApiFeature);
            factoryBean.setAddress("http://localhost:8080/");
            factoryBean.setProvider(new JacksonJsonProvider());
            factoryBean.create();

            Endpoint endpoint = Endpoint.publish("http://localhost:8080/soap/api/login", new LoginApi());
            Endpoint.publish("http://localhost:8080/soap/api/hello", new HelloWorldApi());
            Endpoint.publish("http://localhost:8080/soap/api/logout", new LogoutApi());

            Endpoint.publish("http://localhost:8080/soap/api/getBookings", new GetBookingsApi());
            Endpoint.publish("http://localhost:8080/soap/api/updateBooking", new UpdateBookingsApi());
            Endpoint.publish("http://localhost:8080/soap/api/deleteBooking", new DeleteBookingsApi());

            Endpoint.publish("http://localhost:8080/soap/api/getRelation", new GetRelationApi());
            Endpoint.publish("http://localhost:8080/soap/api/updateRelation", new UpdateRelationsApi());
            Endpoint.publish("http://localhost:8080/soap/api/deleteRelation", new DeleteRelationApi());

            Endpoint.publish("http://localhost:8080/soap/api/getAspect", new GetAspectApi());
            Endpoint.publish("http://localhost:8080/soap/api/updateAspect", new UpdateAspectApi());
            Endpoint.publish("http://localhost:8080/soap/api/deleteAspect", new DeleteAspectApi());

            JaxWsServerFactoryBean wsServerFactoryBean = ((EndpointImpl) endpoint).getServerFactory();
            wsServerFactoryBean.create();

            System.out.println("Server started!! ");
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}
