
package com.jc.ws.first;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jc.ws.first package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProcessFirstResponse_QNAME = new QName("http://first.ws.jc.com/", "processFirstResponse");
    private final static QName _ProcessFirst_QNAME = new QName("http://first.ws.jc.com/", "processFirst");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jc.ws.first
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessFirstResponse }
     * 
     */
    public ProcessFirstResponse createProcessFirstResponse() {
        return new ProcessFirstResponse();
    }

    /**
     * Create an instance of {@link ProcessFirst }
     * 
     */
    public ProcessFirst createProcessFirst() {
        return new ProcessFirst();
    }

    /**
     * Create an instance of {@link FirstVo }
     * 
     */
    public FirstVo createFirstVo() {
        return new FirstVo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessFirstResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://first.ws.jc.com/", name = "processFirstResponse")
    public JAXBElement<ProcessFirstResponse> createProcessFirstResponse(ProcessFirstResponse value) {
        return new JAXBElement<ProcessFirstResponse>(_ProcessFirstResponse_QNAME, ProcessFirstResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessFirst }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://first.ws.jc.com/", name = "processFirst")
    public JAXBElement<ProcessFirst> createProcessFirst(ProcessFirst value) {
        return new JAXBElement<ProcessFirst>(_ProcessFirst_QNAME, ProcessFirst.class, null, value);
    }

}
