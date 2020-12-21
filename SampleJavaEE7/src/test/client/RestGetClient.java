package test.client;

import java.io.IOException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import test.bean.ResData;

public class RestGetClient {

    public static void main(String[] args) {

        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        headers.putSingle("content-type", "application/json");
        headers.putSingle("Authorization", "Bearer xxxxxxxxxxxxxx");

        Client client = ClientBuilder.newClient();
        Response res = client.target("https://qiita.com/api/v2/authenticated_user/items")
                .queryParam("page", 1)
                .queryParam("per_page", 100)
                .request(MediaType.APPLICATION_JSON_TYPE)
                .headers(headers)
                .get(Response.class);

        System.out.println("result=" + res.getStatus());
        String json = res.readEntity(String.class);
        ObjectMapper mapper = new ObjectMapper();
        ResData[] resData = null;
        try {
            resData = mapper.readValue(json, ResData[].class);
        } catch (JsonParseException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        } catch (JsonMappingException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
        for (ResData data : resData) {
            System.out.println("title=" + data.getTitle());
        }
    }
}
