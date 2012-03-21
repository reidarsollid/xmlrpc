package no.nith.enterprise.xmlrpc;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: Reidar Sollid
 * Date: 15.02.11
 * Time: 13.37
 */
public class MessageClient {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl xmlRpcClientConfig = new XmlRpcClientConfigImpl();
        xmlRpcClientConfig.setServerURL(new URL("http://127.0.0.1:4567/"));
        XmlRpcClient xmlRpcClient = new XmlRpcClient();
        xmlRpcClient.setConfig(xmlRpcClientConfig);

        Object [] objects = new Object [] {"Java","Hello Erlang"};
        String result = (String) xmlRpcClient.execute("message",objects);
        System.out.println(result);
    }
}
