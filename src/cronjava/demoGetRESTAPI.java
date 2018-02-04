/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronjava;

import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 *
 * @author bobmastrolilli
 */
public class demoGetRESTAPI
{

    /**
     * @param args the command line arguments
     */
    public static void main() throws Exception
{
    DefaultHttpClient httpClient = new DefaultHttpClient();
     
    //User user = new User();
    //user.setId(100);
    //user.setFirstName("Lokesh");
    //user.setLastName("Gupta");
     
    StringWriter writer = new StringWriter();

     
    try
    {
        //Define a postRequest request
        HttpPost postRequest = new HttpPost("https://www.333.ovh/api/rest/session");
         
        //Set the API media type in http content-type header
        postRequest.addHeader("content-type", "application/json");
        postRequest.addHeader("X-Oc-Merchant-Id", "cORMczDhWE25B23HQkRjhXXbfddfTOmT");
        //Set the request post body
        //StringEntity userEntity = new StringEntity(writer.getBuffer().toString());
        //postRequest.setEntity(userEntity);
          
        //Send the request; It will immediately return the response in HttpResponse object if any
        HttpResponse response = httpClient.execute(postRequest);
         
        //verify the valid error code first
        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode != 201)
        {
            throw new RuntimeException("Failed with HTTP error code : " + statusCode);
        }
    }
    finally
    {
        //Important: Close the connect
        httpClient.getConnectionManager().shutdown();
    }
}
    
}
