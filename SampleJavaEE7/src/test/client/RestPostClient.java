package test.client;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RestPostClient {

    public static void main(String[] args) {

        String json = "{ \"name\" : \"name\", \"subtype\" : \"CUSTOM\" }";
        Client client = ClientBuilder.newClient();

        Response res = null;

        try {
            res = client.target("http://localhost:8080")
                    .path("/oauth/access_token")
                    .request(MediaType.APPLICATION_JSON_TYPE)
                    .post(Entity.<String> entity(json, MediaType.APPLICATION_JSON), Response.class);
        } catch (BadRequestException e) {
            System.out.println("response=" + e.getResponse().readEntity(String.class));
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("response=" + res);
        if (res != null) {
            System.out.println("data=" + res.readEntity(String.class));
        }

    }
}
