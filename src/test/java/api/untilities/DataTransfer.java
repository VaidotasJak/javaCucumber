package api.untilities;

import java.util.HashMap;
import java.util.Map;

public class DataTransfer {

    private Map<String, Object> data;

    public DataTransfer() {
        this.data = new HashMap<>();
    }

    public void addData(String key, Object value) {
        data.put(key, value);
    }

    public Object getData(String key) {
        return data.get(key);
    }


}
