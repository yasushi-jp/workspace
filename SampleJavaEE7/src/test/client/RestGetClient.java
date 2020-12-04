package test.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

public class RestGetClient {

    public static void main(String[] args) {

        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        headers.putSingle("content-type", "application/json");
        headers.putSingle("Authorization", "Bearer xxxxxxxxxxxxxxxxx");

        Client client = ClientBuilder.newClient();
        Response res = client.target("https://qiita.com/api/v2/authenticated_user/items")
                .queryParam("page", 1)
                .queryParam("per_page", 100)
                .request(MediaType.APPLICATION_JSON_TYPE)
                .headers(headers)
                .get(Response.class);

        System.out.println("result=" + res.getStatus());
        System.out.println("data=" + res.readEntity(String.class));
    }
}
