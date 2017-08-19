package ejercicio21;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2017-08-18T18:34:05.077-05:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "IEncriptar", 
                  wsdlLocation = "http://localhost:8081/ejercicio22/ejemplo?wsdl",
                  targetNamespace = "http://ejercicio21/") 
public class IEncriptar extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ejercicio21/", "IEncriptar");
    public final static QName IEncriptarPort = new QName("http://ejercicio21/", "IEncriptarPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8081/ejercicio22/ejemplo?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IEncriptar.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8081/ejercicio22/ejemplo?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IEncriptar(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IEncriptar(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IEncriptar() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IEncriptar(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IEncriptar(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IEncriptar(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns IEncriptarPortType
     */
    @WebEndpoint(name = "IEncriptarPort")
    public IEncriptarPortType getIEncriptarPort() {
        return super.getPort(IEncriptarPort, IEncriptarPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IEncriptarPortType
     */
    @WebEndpoint(name = "IEncriptarPort")
    public IEncriptarPortType getIEncriptarPort(WebServiceFeature... features) {
        return super.getPort(IEncriptarPort, IEncriptarPortType.class, features);
    }

}
