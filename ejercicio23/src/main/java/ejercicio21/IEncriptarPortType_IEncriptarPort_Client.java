
package ejercicio21;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2017-08-18T18:34:05.036-05:00
 * Generated source version: 2.5.1
 * 
 */
public final class IEncriptarPortType_IEncriptarPort_Client {

    private static final QName SERVICE_NAME = new QName("http://ejercicio21/", "IEncriptar");

    private IEncriptarPortType_IEncriptarPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = IEncriptar.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        IEncriptar ss = new IEncriptar(wsdlURL, SERVICE_NAME);
        IEncriptarPortType port = ss.getIEncriptarPort();  
        
        {
        System.out.println("Invoking encriptar...");
        java.lang.String _encriptar_arg0 = "";
        java.lang.String _encriptar__return = port.encriptar(_encriptar_arg0);
        System.out.println("encriptar.result=" + _encriptar__return);


        }

        System.exit(0);
    }

}
