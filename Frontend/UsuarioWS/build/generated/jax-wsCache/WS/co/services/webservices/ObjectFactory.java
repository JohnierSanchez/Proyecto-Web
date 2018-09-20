
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

    private final static QName _BuscarUsuarioResponse_QNAME = new QName("http://webservices.services.co/", "BuscarUsuarioResponse");
    private final static QName _IngresarUsuario_QNAME = new QName("http://webservices.services.co/", "IngresarUsuario");
    private final static QName _BuscarUsuario_QNAME = new QName("http://webservices.services.co/", "BuscarUsuario");
    private final static QName _EliminarUsuarioResponse_QNAME = new QName("http://webservices.services.co/", "EliminarUsuarioResponse");
    private final static QName _ConsultarUsuario_QNAME = new QName("http://webservices.services.co/", "ConsultarUsuario");
    private final static QName _IngresarUsuarioResponse_QNAME = new QName("http://webservices.services.co/", "IngresarUsuarioResponse");
    private final static QName _ConsultarUsuarioResponse_QNAME = new QName("http://webservices.services.co/", "ConsultarUsuarioResponse");
    private final static QName _EliminarUsuario_QNAME = new QName("http://webservices.services.co/", "EliminarUsuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.services.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IngresarUsuario }
     * 
     */
    public IngresarUsuario createIngresarUsuario() {
        return new IngresarUsuario();
    }

    /**
     * Create an instance of {@link BuscarUsuarioResponse }
     * 
     */
    public BuscarUsuarioResponse createBuscarUsuarioResponse() {
        return new BuscarUsuarioResponse();
    }

    /**
     * Create an instance of {@link BuscarUsuario }
     * 
     */
    public BuscarUsuario createBuscarUsuario() {
        return new BuscarUsuario();
    }

    /**
     * Create an instance of {@link ConsultarUsuario }
     * 
     */
    public ConsultarUsuario createConsultarUsuario() {
        return new ConsultarUsuario();
    }

    /**
     * Create an instance of {@link IngresarUsuarioResponse }
     * 
     */
    public IngresarUsuarioResponse createIngresarUsuarioResponse() {
        return new IngresarUsuarioResponse();
    }

    /**
     * Create an instance of {@link EliminarUsuarioResponse }
     * 
     */
    public EliminarUsuarioResponse createEliminarUsuarioResponse() {
        return new EliminarUsuarioResponse();
    }

    /**
     * Create an instance of {@link ConsultarUsuarioResponse }
     * 
     */
    public ConsultarUsuarioResponse createConsultarUsuarioResponse() {
        return new ConsultarUsuarioResponse();
    }

    /**
     * Create an instance of {@link EliminarUsuario }
     * 
     */
    public EliminarUsuario createEliminarUsuario() {
        return new EliminarUsuario();
    }

    /**
     * Create an instance of {@link TblUsuario }
     * 
     */
    public TblUsuario createTblUsuario() {
        return new TblUsuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.co/", name = "BuscarUsuarioResponse")
    public JAXBElement<BuscarUsuarioResponse> createBuscarUsuarioResponse(BuscarUsuarioResponse value) {
        return new JAXBElement<BuscarUsuarioResponse>(_BuscarUsuarioResponse_QNAME, BuscarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.co/", name = "IngresarUsuario")
    public JAXBElement<IngresarUsuario> createIngresarUsuario(IngresarUsuario value) {
        return new JAXBElement<IngresarUsuario>(_IngresarUsuario_QNAME, IngresarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.co/", name = "BuscarUsuario")
    public JAXBElement<BuscarUsuario> createBuscarUsuario(BuscarUsuario value) {
        return new JAXBElement<BuscarUsuario>(_BuscarUsuario_QNAME, BuscarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.co/", name = "EliminarUsuarioResponse")
    public JAXBElement<EliminarUsuarioResponse> createEliminarUsuarioResponse(EliminarUsuarioResponse value) {
        return new JAXBElement<EliminarUsuarioResponse>(_EliminarUsuarioResponse_QNAME, EliminarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.co/", name = "ConsultarUsuario")
    public JAXBElement<ConsultarUsuario> createConsultarUsuario(ConsultarUsuario value) {
        return new JAXBElement<ConsultarUsuario>(_ConsultarUsuario_QNAME, ConsultarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.co/", name = "IngresarUsuarioResponse")
    public JAXBElement<IngresarUsuarioResponse> createIngresarUsuarioResponse(IngresarUsuarioResponse value) {
        return new JAXBElement<IngresarUsuarioResponse>(_IngresarUsuarioResponse_QNAME, IngresarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.co/", name = "ConsultarUsuarioResponse")
    public JAXBElement<ConsultarUsuarioResponse> createConsultarUsuarioResponse(ConsultarUsuarioResponse value) {
        return new JAXBElement<ConsultarUsuarioResponse>(_ConsultarUsuarioResponse_QNAME, ConsultarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.services.co/", name = "EliminarUsuario")
    public JAXBElement<EliminarUsuario> createEliminarUsuario(EliminarUsuario value) {
        return new JAXBElement<EliminarUsuario>(_EliminarUsuario_QNAME, EliminarUsuario.class, null, value);
    }

}
