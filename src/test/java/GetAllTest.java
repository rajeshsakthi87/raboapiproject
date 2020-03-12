
import serviceConfig.EmployeeConfig;
import serviceConfig.EmployeeEndpoints;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class GetAllTest extends EmployeeConfig
{
    @Test
    public void getallEmployees()
    {
        given()
                .when().get(EmployeeEndpoints.endpoints)
                .then()
                .assertThat()
                .statusCode(200);
    }
   
    @Test
    public void AssertJSONArray()
    {
    	Response response = null;       
    	response = RestAssured.given()
    		    .when()
    		    .get(EmployeeEndpoints.endpoints);
    	
    	JsonPath jsonval = response.jsonPath();
    	String firstName = jsonval.get("firstName[0]");
    	
    	assertEquals("rajesh",firstName);
        
    }

}
