
package com.tk1.soap;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "IShoppingImplService", targetNamespace = "http://tu.tk1.com/", wsdlLocation = "http://localhost:8090/shopping?wsdl")
public class IShoppingImplService
    extends Service
{

    private final static URL ISHOPPINGIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException ISHOPPINGIMPLSERVICE_EXCEPTION;
    private final static QName ISHOPPINGIMPLSERVICE_QNAME = new QName("http://tu.tk1.com/", "IShoppingImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8090/shopping?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ISHOPPINGIMPLSERVICE_WSDL_LOCATION = url;
        ISHOPPINGIMPLSERVICE_EXCEPTION = e;
    }

    public IShoppingImplService() {
        super(__getWsdlLocation(), ISHOPPINGIMPLSERVICE_QNAME);
    }

    public IShoppingImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ISHOPPINGIMPLSERVICE_QNAME, features);
    }

    public IShoppingImplService(URL wsdlLocation) {
        super(wsdlLocation, ISHOPPINGIMPLSERVICE_QNAME);
    }

    public IShoppingImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ISHOPPINGIMPLSERVICE_QNAME, features);
    }

    public IShoppingImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IShoppingImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IShopping
     */
    @WebEndpoint(name = "IShoppingImplPort")
    public IShopping getIShoppingImplPort() {
        return super.getPort(new QName("http://tu.tk1.com/", "IShoppingImplPort"), IShopping.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IShopping
     */
    @WebEndpoint(name = "IShoppingImplPort")
    public IShopping getIShoppingImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://tu.tk1.com/", "IShoppingImplPort"), IShopping.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ISHOPPINGIMPLSERVICE_EXCEPTION!= null) {
            throw ISHOPPINGIMPLSERVICE_EXCEPTION;
        }
        return ISHOPPINGIMPLSERVICE_WSDL_LOCATION;
    }

}