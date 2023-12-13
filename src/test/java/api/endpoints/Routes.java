package api.endpoints;


//import lombok.Data;
//
//import java.util.ResourceBundle;
//
//@Data
//public class Routes {
//
//    private final String env = System.getProperty("env");
//    public String base_url;
//    public String create_user;
//    public String get_user;
//    public String update_user;
//    public String delete_user;
//    public Routes() {
//        ResourceBundle resourceBundle = ResourceBundle.getBundle(env + "_routes");
//        this.base_url = resourceBundle.getString("base_url");
//        this.create_user = base_url + resourceBundle.getString("create_user");
//        this.get_user = base_url + resourceBundle.getString("get_user");
//        this.update_user = base_url + resourceBundle.getString("update_user");
//        this.delete_user = base_url + resourceBundle.getString("delete_user");
//    }


import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class Routes {

    static Config config = ConfigFactory.load(System.getProperty("env") + "_routes");;
    static String BASE_URL = ConfigFactory.load(System.getProperty("env") + "_routes").getString("base_url");
    public static String createUser(){
        System.out.println(BASE_URL + config.getString("create_user"));
        return BASE_URL + config.getString("create_user");
    }

    public static String getUser(){
        return BASE_URL + config.getString("get_user");
    }

}



