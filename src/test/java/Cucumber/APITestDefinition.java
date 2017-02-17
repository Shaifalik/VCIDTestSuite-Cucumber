package Cucumber;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.containsString;

import java.io.IOException;
import java.sql.SQLException;
import com.jayway.restassured.response.ValidatableResponse;

import DAO.DAOAccess;
import DAO.PostgreDAO;
import JSONS.VCIDJSON;

public class APITestDefinition {
	String jsonString;
	ValidatableResponse response;

	public void getJSON(String msisdn) throws IOException {
		jsonString = VCIDJSON.getVCID("908", "2540a6c4c4b8", "sk1@gmail.com", msisdn, "CUST");
		System.out.println(jsonString);
	}

	public void sendRequest() throws Exception {
		response = given().contentType("application/json").header("accept", "application/json")
				.header("requestId", "TEST008").body(jsonString).when().post("http://52.209.79.99:8080/v1/openservice")
				.then().statusCode(200);
		System.out.println(response);
	}

	public void validateResponse() throws Exception {
		response.body(containsString("Z004"));
	}

	public void validatedatabase() {
		try {
			PostgreDAO pstJdbc = DAOAccess.getConnection();
			pstJdbc.executeQuery("Select * from ziam limit 1");
			pstJdbc.closeDatabase();
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}