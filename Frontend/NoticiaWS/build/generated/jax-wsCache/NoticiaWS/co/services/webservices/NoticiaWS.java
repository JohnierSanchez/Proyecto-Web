
package co.services.webservices;

import java.util.List;
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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NoticiaWS", targetNamespace = "http://webservices.services.co/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NoticiaWS {


    /**
     * 
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod(operationName = "ConsultarNoticia")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConsultarNoticia", targetNamespace = "http://webservices.services.co/", className = "co.services.webservices.ConsultarNoticia")
    @ResponseWrapper(localName = "ConsultarNoticiaResponse", targetNamespace = "http://webservices.services.co/", className = "co.services.webservices.ConsultarNoticiaResponse")
    @Action(input = "http://webservices.services.co/NoticiaWS/ConsultarNoticiaRequest", output = "http://webservices.services.co/NoticiaWS/ConsultarNoticiaResponse")
    public List<Object> consultarNoticia();

    /**
     * 
     * @param codigo
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "BuscarNoticia")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "BuscarNoticia", targetNamespace = "http://webservices.services.co/", className = "co.services.webservices.BuscarNoticia")
    @ResponseWrapper(localName = "BuscarNoticiaResponse", targetNamespace = "http://webservices.services.co/", className = "co.services.webservices.BuscarNoticiaResponse")
    @Action(input = "http://webservices.services.co/NoticiaWS/BuscarNoticiaRequest", output = "http://webservices.services.co/NoticiaWS/BuscarNoticiaResponse")
    public String buscarNoticia(
        @WebParam(name = "codigo", targetNamespace = "")
        int codigo);

    /**
     * 
     * @param descripcion
     * @param codigo
     * @param titulo
     * @param url
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "IngresarNoticia")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "IngresarNoticia", targetNamespace = "http://webservices.services.co/", className = "co.services.webservices.IngresarNoticia")
    @ResponseWrapper(localName = "IngresarNoticiaResponse", targetNamespace = "http://webservices.services.co/", className = "co.services.webservices.IngresarNoticiaResponse")
    @Action(input = "http://webservices.services.co/NoticiaWS/IngresarNoticiaRequest", output = "http://webservices.services.co/NoticiaWS/IngresarNoticiaResponse")
    public String ingresarNoticia(
        @WebParam(name = "codigo", targetNamespace = "")
        int codigo,
        @WebParam(name = "titulo", targetNamespace = "")
        String titulo,
        @WebParam(name = "descripcion", targetNamespace = "")
        String descripcion,
        @WebParam(name = "url", targetNamespace = "")
        String url);

}
