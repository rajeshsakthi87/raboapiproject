
import serviceConfig.EmployeeConfig;

import static io.restassured.RestAssured.given;

import org.junit.Test;



public class DeleteEmployee extends EmployeeConfig {

    @Test
    public void DeleteEmployee()
    {
        given().
        when().
        delete("employees/3").
        then();
    }
}
