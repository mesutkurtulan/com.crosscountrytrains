package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    static private Properties properties;

    static {
        String path = "src/configuration.properties"; // sadece dosya adı yazılması yeterlidir. (Dosya uzantısı ile birlikte)
        try {
            FileInputStream fileInputStream = new FileInputStream(path); //
            properties = new Properties(); //
            properties.load(fileInputStream); //
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
