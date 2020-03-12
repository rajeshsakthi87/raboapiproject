import serviceConfig.EmployeeConfig;
import serviceConfig.EmployeeEndpoints;

import static io.restassured.RestAssured.*;

import org.junit.Test;

public class GetEmployee extends EmployeeConfig {
    @Test
    public void GetEmp ()
    {
        given().
                pathParam("employee_id","1")
                .get(EmployeeEndpoints.endpoints_unique)
                .then();

    }
}
