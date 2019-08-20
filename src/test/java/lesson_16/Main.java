package lesson_16;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;


public class Main {
    String users = "/api/v1/users";
    String byID = "/api/v1/users/";
    String baseUri = "https://5d5192b13432e70014e6b238.mockapi.io";
    List<usersDTO> listOfUsersDTO = new ArrayList<>();
    Gson gson = new Gson();
    Gson gsonBuilder = new GsonBuilder().create();

    @Test
    public void getUsersAndPrint() throws JSONException {

//        "5. Create a request to the mock service to get all users.
//        Endpoint: /api/v1/users.
//        Extract all users from the response body and add them to ArrayList(Type of array list you can pick by yourself).

        JSONArray usersInJson = new JSONArray(
                given().baseUri(baseUri)
                        .basePath(users)
                        .when().get().then().extract().response().jsonPath().prettify());

        List<JSONObject> listOfUsersInJson = new ArrayList<>();

//        Print all user's first names, last names and ages to the console."
        for (int index = 0; index < usersInJson.length(); index++) {
            JSONObject jsonObject = (JSONObject) usersInJson.get(index);
            System.out.println(jsonObject.getString("FirstName") + " " + jsonObject.getString("LastName") + " " + jsonObject.getString("age"));
            listOfUsersInJson.add(jsonObject);
        }

        for (int index = 0; index < usersInJson.length(); index++) {
            usersDTO user = gson.fromJson(listOfUsersInJson.get(index).toString(), usersDTO.class);
            listOfUsersDTO.add(user);
        }

        for (int index = 0; index < usersInJson.length(); index++) {
            System.out.println("first name: " + listOfUsersDTO.get(index).getFirstName() + " " + "last name: " + listOfUsersDTO.get(index).getLastName() + " " + "age: " + listOfUsersDTO.get(index).getAge());
        }

    }

    @Test
    public void postUser() {

        usersDTO user = new usersDTO();
        user.setAge(11);
        user.setEmail("test@test.com");
        user.setFirstName("Tony");
        user.setLastName("Anton");

        String jsonFomUser = gsonBuilder.toJson(user);

        given().baseUri(baseUri)
                .basePath(users)
                .body(jsonFomUser)
                .post().then().statusCode(201);
    }

    @Test
    public void getUserById() {
        System.out.println(given().baseUri(baseUri)
                .basePath(byID + "2")
                .get()
                .then().statusCode(200).extract().response().prettyPrint()
        );
    }

    @Test
    public void deleteUserById() {
        given().baseUri(baseUri)
                .basePath(byID + "2")
                .delete().then().statusCode(200);
    }

    @Test
    public void updateUserById() {
        given().baseUri(baseUri)
                .basePath(byID + "5")
                .put().then().statusCode(200);
    }


}
