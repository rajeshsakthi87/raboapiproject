import serviceConfig.EmployeeConfig;
import serviceConfig.EmployeeEndpoints;

import static io.restassured.RestAssured.given;

import org.junit.Test;



public class PutRequest extends EmployeeConfig {

    @Test
    public void UpdateNewEmployee ()
    {
    	String updatebody = "{\n" +
                "  \"firstName\": \"rajesh\",\n" +
                "  \"lastName\": \"palani\",\n" +
                "  \"emailID\": \"ambikarajesh@gmail.com\",\n" +
                "  \"password\": \"welcome\",\n" +
                "  \"employeeName\":\"ambika\",\n" +
                "  \"employeeStatus\":1,\n" +
                "  \"phoneNumber\":\"99122034288\"\n" +
                "}";


        given()
                .body(updatebody).
                when()
                .put("employees/1")
                .then();
    }
}
