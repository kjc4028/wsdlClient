package com.jc.ws.first;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2019-08-31T17:55:54.847+09:00
 * Generated source version: 2.6.2
 * 
 */
@WebService(targetNamespace = "http://first.ws.jc.com/", name = "FirstInfoProcess")
@XmlSeeAlso({ObjectFactory.class})
public interface FirstInfoProcess {

    @WebMethod
    @RequestWrapper(localName = "processFirst", targetNamespace = "http://first.ws.jc.com/", className = "com.jc.ws.first.ProcessFirst")
    @ResponseWrapper(localName = "processFirstResponse", targetNamespace = "http://first.ws.jc.com/", className = "com.jc.ws.first.ProcessFirstResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.jc.ws.first.FirstVo processFirst();
}
