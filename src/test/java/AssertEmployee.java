import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import serviceConfig.EmployeeConfig;
import serviceConfig.EmployeeEndpoints;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

import org.apache.http.HttpStatus;
import org.junit.Test;


public class AssertEmployee extends EmployeeConfig {
	Response response = null;
    @Test
    public void GetData()
    {
        given().
                when()
                .get("employees/1")
                .then()
                .assertThat()
                .body("emailID", equalTo("ambikarajesh@gmail.com"))
        		.statusCode(200);

    }

    @Test
    public void AssertStatuscode()
    {
              
    	response = RestAssured.given()
    		    .when()
    		    .get("employees/1");
    	
    	int statcode = response.getStatusCode();
    	System.out.println("statcode "+statcode);
    	assertEquals(200,statcode);
    	

    }
    
    @Test
    public void AssertStatusLine()
    {
    	       
    	response = RestAssured.given()
    		    .when()
    		    .get("employees/1");
    	
    	String statusline=	response.getStatusLine().trim();
    	System.out.println("statusline : "+statusline);
    	assertEquals("HTTP/1.1 200",statusline);
    	
    }
    @Test
    public void ExtractBody()
    {
         response =
                given().
                when().
                get("employees/1").
                then()
                .contentType(ContentType.JSON)
                .extract().response();
        String responseastring = response.asString();
        System.out.println("Response "+responseastring);

    }
    
    @Test
    public void AssertJSONObject()
    {
    	       
    	response = RestAssured.given()
    		    .when()
    		    .get("employees/1");
    	
    	JsonPath jsonval = response.jsonPath();
    	String firstName = jsonval.get("firstName");
    	
    	assertEquals("rajesh",firstName);
        
    }

}
