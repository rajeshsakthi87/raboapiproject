import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

import serviceConfig.EmployeeConfig;
import serviceConfig.EmployeeEndpoints;
import sun.security.util.IOUtils;

public class PostArrayRequest extends EmployeeConfig{
	 @Test
	    public void CreateNewEmployee ()
	    {
	     
		String result;
		try {
			String payloadinput = new String(
					Files.readAllBytes(Paths
							.get("C:\\Users\\Rajesh\\eclipse-workspace\\APIproject\\JSONFileInput\\jasonrequest.json")),
					StandardCharsets.UTF_8);
			given().
			body(payloadinput).
			when()
			.post(EmployeeEndpoints.arrayendpoints)
			.then();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	        
	    }
}
