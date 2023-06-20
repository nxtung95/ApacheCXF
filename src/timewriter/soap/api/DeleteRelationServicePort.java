
package timewriter.soap.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import timewriter.object.*;
/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DeleteRelationServicePort", targetNamespace = "api.timewriter.soap.nl")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DeleteRelationServicePort {


    /**
     * 
     * @param securityToken
     * @param relationType
     * @param id2
     * @param id1
     * @return
     *     returns nl.soap.timewriter.api.DeleteRelationResult
     */
    @WebMethod(operationName = "DeleteRelation", action = "DeleteRelation")
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "DeleteRelation", targetNamespace = "api.timewriter.soap.nl", className = "nl.soap.timewriter.api.DeleteRelation")
    @ResponseWrapper(localName = "DeleteRelationResponse", targetNamespace = "api.timewriter.soap.nl", className = "nl.soap.timewriter.api.DeleteRelationResponse")
    public DeleteRelationResult deleteRelation(
        @WebParam(name = "securityToken", targetNamespace = "")
        String securityToken,
        @WebParam(name = "id1", targetNamespace = "")
        long id1,
        @WebParam(name = "id2", targetNamespace = "")
        long id2,
        @WebParam(name = "relationType", targetNamespace = "")
        String relationType);

}