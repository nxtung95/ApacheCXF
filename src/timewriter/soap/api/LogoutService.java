
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
@WebServiceClient(name = "LogoutService", targetNamespace = "api.timewriter.soap.nl", wsdlLocation = "http://localhost/wsdl/timewriterapi.wsdl")
public class LogoutService
    extends Service
{

    private final static URL LOGOUTSERVICE_WSDL_LOCATION;
    private final static WebServiceException LOGOUTSERVICE_EXCEPTION;
    private final static QName LOGOUTSERVICE_QNAME = new QName("api.timewriter.soap.nl", "LogoutService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/wsdl/timewriterapi.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LOGOUTSERVICE_WSDL_LOCATION = url;
        LOGOUTSERVICE_EXCEPTION = e;
    }

    public LogoutService() {
        super(__getWsdlLocation(), LOGOUTSERVICE_QNAME);
    }

    public LogoutService(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOGOUTSERVICE_QNAME, features);
    }

    public LogoutService(URL wsdlLocation) {
        super(wsdlLocation, LOGOUTSERVICE_QNAME);
    }

    public LogoutService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOGOUTSERVICE_QNAME, features);
    }

    public LogoutService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LogoutService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LogoutServicePort
     */
    @WebEndpoint(name = "LogoutServicePort")
    public LogoutServicePort getLogoutServicePort() {
        return super.getPort(new QName("api.timewriter.soap.nl", "LogoutServicePort"), LogoutServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LogoutServicePort
     */
    @WebEndpoint(name = "LogoutServicePort")
    public LogoutServicePort getLogoutServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("api.timewriter.soap.nl", "LogoutServicePort"), LogoutServicePort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOGOUTSERVICE_EXCEPTION!= null) {
            throw LOGOUTSERVICE_EXCEPTION;
        }
        return LOGOUTSERVICE_WSDL_LOCATION;
    }

}
