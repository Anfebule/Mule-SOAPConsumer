
package ejercicio21;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ejercicio21 package. 
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

    private final static QName _EncriptarResponse_QNAME = new QName("http://ejercicio21/", "encriptarResponse");
    private final static QName _Encriptar_QNAME = new QName("http://ejercicio21/", "encriptar");
    private final static QName _EncriptarArg0_QNAME = new QName("http://ejercicio21/", "arg0");
    private final static QName _EncriptarResponseReturn_QNAME = new QName("http://ejercicio21/", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejercicio21
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EncriptarResponse }
     * 
     */
    public EncriptarResponse createEncriptarResponse() {
        return new EncriptarResponse();
    }

    /**
     * Create an instance of {@link Encriptar }
     * 
     */
    public Encriptar createEncriptar() {
        return new Encriptar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncriptarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejercicio21/", name = "encriptarResponse")
    public JAXBElement<EncriptarResponse> createEncriptarResponse(EncriptarResponse value) {
        return new JAXBElement<EncriptarResponse>(_EncriptarResponse_QNAME, EncriptarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Encriptar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejercicio21/", name = "encriptar")
    public JAXBElement<Encriptar> createEncriptar(Encriptar value) {
        return new JAXBElement<Encriptar>(_Encriptar_QNAME, Encriptar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejercicio21/", name = "arg0", scope = Encriptar.class)
    public JAXBElement<String> createEncriptarArg0(String value) {
        return new JAXBElement<String>(_EncriptarArg0_QNAME, String.class, Encriptar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejercicio21/", name = "return", scope = EncriptarResponse.class)
    public JAXBElement<String> createEncriptarResponseReturn(String value) {
        return new JAXBElement<String>(_EncriptarResponseReturn_QNAME, String.class, EncriptarResponse.class, value);
    }

}
