package api.httpRequests;

//public class Routes {
//
//    static Config config = ConfigFactory.load(System.getProperty("env") + "_routes");;
//    static String BASE_URL = ConfigFactory.load(System.getProperty("env") + "_routes").getString("base_url");
//    public static String createUser(){
//        System.out.println(BASE_URL + config.getString("create_user"));
//        return BASE_URL + config.getString("create_user");
//    }
//
//    public static String getUser(){
//        return BASE_URL + config.getString("get_user");
//    }
//

//}

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Routes {
    private static Routes instance;
    private Properties properties;

    private Routes() {
        properties = new Properties();
        loadProperties();
    }

    public static Routes getInstance() {
        if (instance == null) {
            instance = new Routes();
        }
        return instance;
    }

    private void loadProperties() {
        String env = System.getProperty("env");
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(env + "_routes.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public String baseUrl(){
        return getProperty("base_url");
    }

    public String createUser(){
        return baseUrl() + getProperty("create_user");
    }

    public String getUser(){
        return baseUrl() + getProperty("get_user");
    }

    public String deleteUser(){
        return baseUrl() + getProperty("delete_user");
    }

}
