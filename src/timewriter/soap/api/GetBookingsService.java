
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
@WebServiceClient(name = "GetBookingsService", targetNamespace = "api.timewriter.soap.nl", wsdlLocation = "http://localhost/wsdl/timewriterapi.wsdl")
public class GetBookingsService
    extends Service
{

    private final static URL GETBOOKINGSSERVICE_WSDL_LOCATION;
    private final static WebServiceException GETBOOKINGSSERVICE_EXCEPTION;
    private final static QName GETBOOKINGSSERVICE_QNAME = new QName("api.timewriter.soap.nl", "GetBookingsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost/wsdl/timewriterapi.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GETBOOKINGSSERVICE_WSDL_LOCATION = url;
        GETBOOKINGSSERVICE_EXCEPTION = e;
    }

    public GetBookingsService() {
        super(__getWsdlLocation(), GETBOOKINGSSERVICE_QNAME);
    }

    public GetBookingsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETBOOKINGSSERVICE_QNAME, features);
    }

    public GetBookingsService(URL wsdlLocation) {
        super(wsdlLocation, GETBOOKINGSSERVICE_QNAME);
    }

    public GetBookingsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETBOOKINGSSERVICE_QNAME, features);
    }

    public GetBookingsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetBookingsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetBookingsServicePort
     */
    @WebEndpoint(name = "GetBookingsServicePort")
    public GetBookingsServicePort getGetBookingsServicePort() {
        return super.getPort(new QName("api.timewriter.soap.nl", "GetBookingsServicePort"), GetBookingsServicePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetBookingsServicePort
     */
    @WebEndpoint(name = "GetBookingsServicePort")
    public GetBookingsServicePort getGetBookingsServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("api.timewriter.soap.nl", "GetBookingsServicePort"), GetBookingsServicePort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETBOOKINGSSERVICE_EXCEPTION!= null) {
            throw GETBOOKINGSSERVICE_EXCEPTION;
        }
        return GETBOOKINGSSERVICE_WSDL_LOCATION;
    }

}