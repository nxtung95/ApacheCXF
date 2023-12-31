
package timewriter.soap.api;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GetRelationsService", targetNamespace = "api.timewriter.soap.nl", wsdlLocation = "http://localhost:8080/wsdl/timewriterapi.wsdl")
public class GetRelationsService
    extends Service
{

    private final static URL GETRELATIONSSERVICE_WSDL_LOCATION;
    private final static WebServiceException GETRELATIONSSERVICE_EXCEPTION;
    private final static QName GETRELATIONSSERVICE_QNAME = new QName("api.timewriter.soap.nl", "GetRelationsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/wsdl/timewriterapi.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GETRELATIONSSERVICE_WSDL_LOCATION = url;
        GETRELATIONSSERVICE_EXCEPTION = e;
    }

    public GetRelationsService() {
        super(__getWsdlLocation(), GETRELATIONSSERVICE_QNAME);
    }

    public GetRelationsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETRELATIONSSERVICE_QNAME, features);
    }

    public GetRelationsService(URL wsdlLocation) {
        super(wsdlLocation, GETRELATIONSSERVICE_QNAME);
    }

    public GetRelationsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETRELATIONSSERVICE_QNAME, features);
    }

    public GetRelationsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetRelationsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetRelationsServicePort
     */
    @WebEndpoint(name = "GetRelationsServicePort")
    public GetRelationsServicePort getGetRelationsServicePort() {
        return super.getPort(new QName("api.timewriter.soap.nl", "GetRelationsServicePort"), GetRelationsServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetRelationsServicePort
     */
    @WebEndpoint(name = "GetRelationsServicePort")
    public GetRelationsServicePort getGetRelationsServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("api.timewriter.soap.nl", "GetRelationsServicePort"), GetRelationsServicePort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETRELATIONSSERVICE_EXCEPTION!= null) {
            throw GETRELATIONSSERVICE_EXCEPTION;
        }
        return GETRELATIONSSERVICE_WSDL_LOCATION;
    }

}
