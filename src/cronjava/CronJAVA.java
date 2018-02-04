/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronjava;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author bobmastrolilli
 */
public class CronJAVA
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
//         // Given
//   String jsonMimeType = "application/json";
//   HttpUriRequest request = new HttpGet( "https://www.333.ovh/index.php?route=api/login" );
// 
//   // When
//   HttpResponse response = HttpClientBuilder.create().build().execute( request );
// 
//   // Then
//   String mimeType = ContentType.getOrDefault(response.getEntity()).getMimeType();
//   assertEquals( jsonMimeType, mimeType );
        
        httpsclient http = new httpsclient();
        http.testIt();
        
        
     
    }
    
 
}
