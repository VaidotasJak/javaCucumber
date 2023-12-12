package api.untilities;

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
        if(INSTANCE == null) {
            INSTANCE = new DataTransferSingleton();
        }
        return INSTANCE;
    }

    public Object getDataHandler(String keyValue){
        return dataHandler.get(keyValue);
    }
    public void addDataHandler(String key, Object value) {
        dataHandler.put(key, value);
    }
    public Map<String, Object> getAllData() {
        return dataHandler;
    }


}

