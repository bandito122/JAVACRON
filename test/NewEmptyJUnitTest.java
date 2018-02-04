/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bobmastrolilli
 */
public class NewEmptyJUnitTest
{
    
    public NewEmptyJUnitTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
public void
givenRequestWithNoAcceptHeader_whenRequestIsExecuted_thenDefaultResponseContentTypeIsJson()throws IOException {
  
   // Given
   String jsonMimeType = "application/json";
   HttpUriRequest request = new HttpGet( "https://www.333.ovh/index.php?route=api/login" );
 
   // When
   HttpResponse response = HttpClientBuilder.create().build().execute( request );
 
   // Then
   String mimeType = ContentType.getOrDefault(response.getEntity()).getMimeType();
   assertEquals( jsonMimeType, mimeType );
}
}
