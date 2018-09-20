
package co.services.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.services.webservices package. 
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

    private final static QName _IngresarNoticia_QNAME = new QName("http://webservices.services.co/", "IngresarNoticia");
    private final static QName _BuscarNoticia_QNAME = new QName("http://webservices.services.co/", "BuscarNoticia");
    private final static QName _ConsultarNoticiaResponse_QNAME = new QName("http://webservices.services.co/", "ConsultarNoticiaResponse");
    private final static QName _IngresarNoticiaResponse_QNAME = new QName("http://webservices.services.co/", "IngresarNoticiaResponse");
    private final static QName _BuscarNoticiaResponse_QNAME = new QName("http://webservices.services.co/", "BuscarNoticiaResponse");
    private final static QName _ConsultarNoticia_QNAME = new QName("http://webservices.services.co/", "ConsultarNoticia");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.services.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarNoticia }
     * 
     */
    public BuscarNoticia createBuscarNoticia() {
        return new BuscarNoticia();
    }

    /**
     * Create an instance of {@link ConsultarNoticiaResponse }
     * 
     */
    public ConsultarNoticiaResponse createConsultarNoticiaResponse() {
        return new ConsultarNoticiaResponse();
    }

    /**
     * Create an instance of {@link IngresarNoticia }
     * 
     */
    public IngresarNoticia createIngresarNoticia() {
        return new IngresarNoticia();
    }

    /**
     * Create an instance of {@link ConsultarNoticia }
     * 
     */
    public ConsultarNoticia createConsultarNoticia() {
        return new ConsultarNoticia();
    }

    /**
     * Create an instance of {@link IngresarNoticiaResponse }
     * 
     */
    public IngresarNoticiaResponse createIngresarNoticiaResponse() {
        return new IngresarNoticiaResponse();
    }

    /**
     * Create an instance of {@link BuscarNoticiaResponse }
     * 
     */
    public BuscarNoticiaResponse createBuscarNoticiaResponse() {
        return new BuscarNoticiaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarNoticia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.co/", name = "IngresarNoticia")
    public JAXBElement<IngresarNoticia> createIngresarNoticia(IngresarNoticia value) {
        return new JAXBElement<IngresarNoticia>(_IngresarNoticia_QNAME, IngresarNoticia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarNoticia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.co/", name = "BuscarNoticia")
    public JAXBElement<BuscarNoticia> createBuscarNoticia(BuscarNoticia value) {
        return new JAXBElement<BuscarNoticia>(_BuscarNoticia_QNAME, BuscarNoticia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarNoticiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.co/", name = "ConsultarNoticiaResponse")
    public JAXBElement<ConsultarNoticiaResponse> createConsultarNoticiaResponse(ConsultarNoticiaResponse value) {
        return new JAXBElement<ConsultarNoticiaResponse>(_ConsultarNoticiaResponse_QNAME, ConsultarNoticiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarNoticiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.co/", name = "IngresarNoticiaResponse")
    public JAXBElement<IngresarNoticiaResponse> createIngresarNoticiaResponse(IngresarNoticiaResponse value) {
        return new JAXBElement<IngresarNoticiaResponse>(_IngresarNoticiaResponse_QNAME, IngresarNoticiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarNoticiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.co/", name = "BuscarNoticiaResponse")
    public JAXBElement<BuscarNoticiaResponse> createBuscarNoticiaResponse(BuscarNoticiaResponse value) {
        return new JAXBElement<BuscarNoticiaResponse>(_BuscarNoticiaResponse_QNAME, BuscarNoticiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarNoticia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.co/", name = "ConsultarNoticia")
    public JAXBElement<ConsultarNoticia> createConsultarNoticia(ConsultarNoticia value) {
        return new JAXBElement<ConsultarNoticia>(_ConsultarNoticia_QNAME, ConsultarNoticia.class, null, value);
    }

}
