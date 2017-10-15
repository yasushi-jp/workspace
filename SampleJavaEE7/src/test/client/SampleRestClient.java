package test.client;

import java.io.IOException;
import java.util.Map;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleRestClient {

	private static Client client = ClientBuilder.newClient();

	public static void main(String[] args) {

		// GET
		WebTarget target = client.target("http://localhost:8080")
				.path("/oauth/access_token")
				.queryParam("token", "shortAccessToken");
		String result = "";
		try {
			result = target.request().get(String.class);
		} catch (BadRequestException e) {
			System.out.println("response=" + e.getResponse().readEntity(String.class));
			e.printStackTrace();
		}
		System.out.println("result=" + result);

		// POST
		Entity<Form> entity = Entity.entity(new Form()
				.param("name", "name")
				.param("subtype", "CUSTOM"),
				MediaType.APPLICATION_FORM_URLENCODED_TYPE);

		try {
		    result = client.target("http://localhost:8080")
		        .path("/path_to_post_method")
		        .request()
		        .post(entity, String.class);
		} catch (BadRequestException e) {
			System.out.println("response=" + e.getResponse().readEntity(String.class));
			e.printStackTrace();
		}
		System.out.println("result=" + result);

		// HTTPヘッダ
		MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
		headers.putSingle("Authorization", "Bearer " + "accessToken");

		target = client.target("http://localhost:8080").path("/accounts");
		String jsonString = target.request().headers(headers).get(String.class);
		System.out.println("jsonString=" + jsonString);

		// JSONパース
		result = client.target("http://localhost:8080")
			    .path("/path_to_post_method")
			    .request()
			    .post(entity, String.class);

			ObjectMapper objectMapper = new ObjectMapper();
			try {
				Map<String,Object> map = objectMapper.readValue(result,  new TypeReference<Map<String, Object>>() {});
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
