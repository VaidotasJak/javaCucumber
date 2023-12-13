package api.endpoints;

import api.model.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserEndpoints {

    public  Response createUser(User payload) {
        return given()
                .contentType(ContentType.JSON)
                .accept("application/json")
                .body(payload)
                .when()
                .post(Routes.createUser());
    }

    public Response getUser(String username) {
        return given()
                .pathParams("username", username)
                .when()
                .get(Routes.getUser());
    }
//
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
//    public static Response deleteUser(String username) {
//        return given()
//                .pathParams("username", username)
//                .when()
//                .delete(routes.getDelete_user());
//    }

}
