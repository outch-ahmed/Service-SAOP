
package fr.aston.poec.formation.jee.ws.converer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IConverter", targetNamespace = "http://soap.ws.java.formation.poec.aston.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IConverter {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "celsiusFahrenheit", targetNamespace = "http://soap.ws.java.formation.poec.aston.fr/", className = "fr.aston.poec.formation.jee.ws.converer.CelsiusFahrenheit")
    @ResponseWrapper(localName = "celsiusFahrenheitResponse", targetNamespace = "http://soap.ws.java.formation.poec.aston.fr/", className = "fr.aston.poec.formation.jee.ws.converer.CelsiusFahrenheitResponse")
    @Action(input = "http://soap.ws.java.formation.poec.aston.fr/IConverter/celsiusFahrenheitRequest", output = "http://soap.ws.java.formation.poec.aston.fr/IConverter/celsiusFahrenheitResponse")
    public double celsiusFahrenheit(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

}
