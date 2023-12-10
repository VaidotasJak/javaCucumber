package api.endpoints;

import api.model.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserEndpoints {

    public static Response createUser(User payload) {
        return given()
                .contentType(ContentType.JSON)
                .accept("*/*")
                .body(payload)
                .when()
                .post(Routes.base_url + Routes.create_user);
    }

    public static Response getUser(String username) {
        return given()
                .pathParams("username", username)
                .when()
                .get(Routes.get_user);
    }

    public static Response updateUser(String username, User paylaod) {
        return given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParams("username", username)
                .body(paylaod)
                .when()
                .put(Routes.update_user);
    }

    public static Response deleteUser(String username) {
        return given()
                .pathParams("username", username)
                .when()
                .delete(Routes.delete_user);
    }

}
