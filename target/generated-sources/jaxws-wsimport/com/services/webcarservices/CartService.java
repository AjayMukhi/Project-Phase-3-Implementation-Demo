
package com.services.webcarservices;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CartService", targetNamespace = "http://webcarservices.services.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CartService {


    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCartCountByUserName", targetNamespace = "http://webcarservices.services.com/", className = "com.services.webcarservices.GetCartCountByUserName")
    @ResponseWrapper(localName = "getCartCountByUserNameResponse", targetNamespace = "http://webcarservices.services.com/", className = "com.services.webcarservices.GetCartCountByUserNameResponse")
    @Action(input = "http://webcarservices.services.com/CartService/getCartCountByUserNameRequest", output = "http://webcarservices.services.com/CartService/getCartCountByUserNameResponse")
    public int getCartCountByUserName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.services.webcarservices.Cart
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCartByUserName", targetNamespace = "http://webcarservices.services.com/", className = "com.services.webcarservices.GetCartByUserName")
    @ResponseWrapper(localName = "getCartByUserNameResponse", targetNamespace = "http://webcarservices.services.com/", className = "com.services.webcarservices.GetCartByUserNameResponse")
    @Action(input = "http://webcarservices.services.com/CartService/getCartByUserNameRequest", output = "http://webcarservices.services.com/CartService/getCartByUserNameResponse")
    public Cart getCartByUserName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteCartById", targetNamespace = "http://webcarservices.services.com/", className = "com.services.webcarservices.DeleteCartById")
    @ResponseWrapper(localName = "deleteCartByIdResponse", targetNamespace = "http://webcarservices.services.com/", className = "com.services.webcarservices.DeleteCartByIdResponse")
    @Action(input = "http://webcarservices.services.com/CartService/deleteCartByIdRequest", output = "http://webcarservices.services.com/CartService/deleteCartByIdResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://webcarservices.services.com/CartService/deleteCartById/Fault/Exception")
    })
    public void deleteCartById(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<com.services.webcarservices.Cart>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCartList", targetNamespace = "http://webcarservices.services.com/", className = "com.services.webcarservices.GetCartList")
    @ResponseWrapper(localName = "getCartListResponse", targetNamespace = "http://webcarservices.services.com/", className = "com.services.webcarservices.GetCartListResponse")
    @Action(input = "http://webcarservices.services.com/CartService/getCartListRequest", output = "http://webcarservices.services.com/CartService/getCartListResponse")
    public List<Cart> getCartList();

    /**
     * 
     * @param id
     * @return
     *     returns com.services.webcarservices.Cart
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCartById", targetNamespace = "http://webcarservices.services.com/", className = "com.services.webcarservices.GetCartById")
    @ResponseWrapper(localName = "getCartByIdResponse", targetNamespace = "http://webcarservices.services.com/", className = "com.services.webcarservices.GetCartByIdResponse")
    @Action(input = "http://webcarservices.services.com/CartService/getCartByIdRequest", output = "http://webcarservices.services.com/CartService/getCartByIdResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://webcarservices.services.com/CartService/getCartById/Fault/Exception")
    })
    public Cart getCartById(
        @WebParam(name = "id", targetNamespace = "")
        Integer id)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Boolean
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createCart", targetNamespace = "http://webcarservices.services.com/", className = "com.services.webcarservices.CreateCart")
    @ResponseWrapper(localName = "createCartResponse", targetNamespace = "http://webcarservices.services.com/", className = "com.services.webcarservices.CreateCartResponse")
    @Action(input = "http://webcarservices.services.com/CartService/createCartRequest", output = "http://webcarservices.services.com/CartService/createCartResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://webcarservices.services.com/CartService/createCart/Fault/Exception")
    })
    public Boolean createCart(
        @WebParam(name = "arg0", targetNamespace = "")
        Cart arg0)
        throws Exception_Exception
    ;

}
