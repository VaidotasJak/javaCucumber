package api.untilities;

import api.model.User;
import io.restassured.response.Response;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class DataTransferSingleton {

    private static DataTransferSingleton INSTANCE;
    private static Map<String, Object> dataHandler;

    private DataTransferSingleton() {
        this.dataHandler = new HashMap<>();
    }

    public static DataTransferSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DataTransferSingleton();
        }
        return INSTANCE;
    }

    public Object getDataHandler(String keyValue) {
        return dataHandler.get(keyValue);
    }

    public void addDataHandler(String key, Object value) {
        dataHandler.put(key, value);
    }

    public User getUserPayload() {
        return (User) dataHandler.get("validCreateUser" + Thread.currentThread().getId());
    }

    public void setUserPayload(User user) {
        dataHandler.put("validCreateUser" + Thread.currentThread().getId(), user);
    }

    public Response getCurrentResponse() {
        return (Response) dataHandler.get("currentResponse" + Thread.currentThread().getId());
    }

    public void setCurrentResponse(Response response) {
        dataHandler.put("currentResponse" + Thread.currentThread().getId(), response);
    }

    public Map<String, Object> getAllData() {
        return dataHandler;
    }


}

