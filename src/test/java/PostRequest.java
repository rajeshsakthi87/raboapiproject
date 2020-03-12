import serviceConfig.EmployeeConfig;
import serviceConfig.EmployeeEndpoints;

import static io.restassured.RestAssured.given;

import org.junit.Test;



public class PostRequest extends EmployeeConfig {

    @Test
    public void CreateNewEmployee ()
    {
        String requestbody = "{\n" +
                "  \"firstName\": \"rajesh\",\n" +
                "  \"lastName\": \"palani\",\n" +
                "  \"emailID\": \"ambikarajesh@gmail.com\",\n" +
                "  \"password\": \"welcome\",\n" +
                "  \"employeeName\":\"ambikarajesh\",\n" +
                "  \"employeeStatus\":1,\n" +
                "  \"phoneNumber\":\"99122034288\"\n" +
                "}";


        given()
        .body(requestbody).
        when()
        .post(EmployeeEndpoints.endpoints)
        .then();
    }
}
