
package timewriter.soap.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import timewriter.object.*;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GetBookingsServicePort", targetNamespace = "api.timewriter.soap.nl")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetBookingsServicePort {


    /**
     * 
     * @param securityToken
     * @param endDate
     * @param filters
     * @param startDate
     * @return
     *     returns timewriter.object.GetBookingsResult
     */
    @WebMethod(operationName = "GetBookings", action = "GetBookings")
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "GetBookings", targetNamespace = "api.timewriter.soap.nl", className = "timewriter.object.GetBookings")
    @ResponseWrapper(localName = "GetBookingsResponse", targetNamespace = "api.timewriter.soap.nl", className = "timewriter.object.GetBookingsResponse")
    public GetBookingsResult getBookings(
        @WebParam(name = "securityToken", targetNamespace = "")
        String securityToken,
        @WebParam(name = "startDate", targetNamespace = "")
        XMLGregorianCalendar startDate,
        @WebParam(name = "endDate", targetNamespace = "")
        XMLGregorianCalendar endDate,
        @WebParam(name = "filters", targetNamespace = "")
        Filters filters);

}
