package test.client;

import java.io.IOException;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleRestClient {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();

		// GET
		WebTarget target = client.target("http://localhost:8080")
				.path("/oauth/access_token")
				.queryParam("token", "shortAccessToken");
		Response res = null;

		res = target.request().get();

		System.out.println("result=" + res.getStatus());
		System.out.println("resultData=" + res.readEntity(String.class));

		// POST
		Entity<Form> entity = Entity.entity(new Form()
				.param("name", "name")
				.param("subtype", "CUSTOM"),
				MediaType.APPLICATION_FORM_URLENCODED_TYPE);
		res= client.target("http://localhost:8080")
		        .path("/path_to_post_method")
		        .request(MediaType.APPLICATION_JSON)
		        .post(entity);
		System.out.println("result=" + res.getStatus());
		System.out.println("resultData=" + res.readEntity(String.class));

		// HTTPヘッダ
		MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
		headers.putSingle("Authorization", "Bearer " + "accessToken");

		target = client.target("http://localhost:8080").path("/accounts");
		String jsonString = target.request().headers(headers).get(String.class);
		System.out.println("jsonString=" + jsonString);

		// JSONパース
		String result = client.target("http://localhost:8080")
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
