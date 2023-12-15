package api.endpoints;

import api.model.User;
import api.untilities.DataTransferSingleton;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserEndpoints {
    Routes configManager = Routes.getInstance();
    DataTransferSingleton dataTransferSingleton = DataTransferSingleton.getInstance();

    public void createNewUser(User payload) {
        Response response = given()
                .contentType(ContentType.JSON)
                .accept("application/json")
                .body(payload)
                .when()
                .post(configManager.createUser());
        dataTransferSingleton.setCurrentResponse(response);
    }

    public void getUser(String username) {
        Response response = given()
                .pathParams("username", username)
                .when()
                .get(configManager.getUser());
        dataTransferSingleton.setCurrentResponse(response);
    }

    //s
//    public static Response updateUser(String username, User paylaod) {
//        return given()
//                .contentType(ContentType.JSON)
//                .accept(ContentType.JSON)
//                .pathParams("username", username)
//                .body(paylaod)
//                .when()
//                .put(routes.getUpdate_user());
//    }
//
    public void deleteUser(String username) {
        Response response = given()
                .pathParams("username", username)
                .when()
                .delete(configManager.deleteUser());
        dataTransferSingleton.setCurrentResponse(response);
    }

}
