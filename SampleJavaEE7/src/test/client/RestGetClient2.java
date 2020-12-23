package test.client;

import java.io.IOException;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RestGetClient2 {

    public static void main(String[] args) {

        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        headers.putSingle("content-type", "application/json");
        headers.putSingle("Authorization", "Bearer b5fc4204e777d8a78b57d7c66bf8008595641124");

        Client client = ClientBuilder.newClient();
        Response res = client.target("https://qiita.com/api/v2/authenticated_user/items")
                .queryParam("page", 1)
                .queryParam("per_page", 100)
                .request(MediaType.APPLICATION_JSON_TYPE)
                .headers(headers)
                .get(Response.class);

        System.out.println("result=" + res.getStatus());
        String json = res.readEntity(String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,Object>[] maps = null;
        try {
            maps = objectMapper.readValue(json,  new TypeReference<Map<String, Object>[]>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Map<String,Object> map : maps) {
            System.out.println("title=" + map.get("title"));
        }

//        ObjectMapper mapper = new ObjectMapper();
//        ResData[] resData = null;
//        try {
//            resData = mapper.readValue(json, ResData[].class);
//        } catch (JsonParseException e) {
//            // TODO 自動生成された catch ブロック
//            e.printStackTrace();
//        } catch (JsonMappingException e) {
//            // TODO 自動生成された catch ブロック
//            e.printStackTrace();
//        } catch (IOException e) {
//            // TODO 自動生成された catch ブロック
//            e.printStackTrace();
//        }
//        for (ResData data : resData) {
//            System.out.println("title=" + data.getTitle());
//        }
    }
}
