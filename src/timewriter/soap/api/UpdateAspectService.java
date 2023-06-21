
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
@WebServiceClient(name = "UpdateAspectService", targetNamespace = "api.timewriter.soap.nl", wsdlLocation = "http://localhost:8080/wsdl/timewriterapi.wsdl")
public class UpdateAspectService
    extends Service
{

    private final static URL UPDATEASPECTSERVICE_WSDL_LOCATION;
    private final static WebServiceException UPDATEASPECTSERVICE_EXCEPTION;
    private final static QName UPDATEASPECTSERVICE_QNAME = new QName("api.timewriter.soap.nl", "UpdateAspectService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/wsdl/timewriterapi.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UPDATEASPECTSERVICE_WSDL_LOCATION = url;
        UPDATEASPECTSERVICE_EXCEPTION = e;
    }

    public UpdateAspectService() {
        super(__getWsdlLocation(), UPDATEASPECTSERVICE_QNAME);
    }

    public UpdateAspectService(WebServiceFeature... features) {
        super(__getWsdlLocation(), UPDATEASPECTSERVICE_QNAME, features);
    }

    public UpdateAspectService(URL wsdlLocation) {
        super(wsdlLocation, UPDATEASPECTSERVICE_QNAME);
    }

    public UpdateAspectService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UPDATEASPECTSERVICE_QNAME, features);
    }

    public UpdateAspectService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UpdateAspectService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UpdateAspectServicePort
     */
    @WebEndpoint(name = "UpdateAspectServicePort")
    public UpdateAspectServicePort getUpdateAspectServicePort() {
        return super.getPort(new QName("api.timewriter.soap.nl", "UpdateAspectServicePort"), UpdateAspectServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UpdateAspectServicePort
     */
    @WebEndpoint(name = "UpdateAspectServicePort")
    public UpdateAspectServicePort getUpdateAspectServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("api.timewriter.soap.nl", "UpdateAspectServicePort"), UpdateAspectServicePort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UPDATEASPECTSERVICE_EXCEPTION!= null) {
            throw UPDATEASPECTSERVICE_EXCEPTION;
        }
        return UPDATEASPECTSERVICE_WSDL_LOCATION;
    }

}
