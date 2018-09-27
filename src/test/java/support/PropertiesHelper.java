package support;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesHelper {

    public String getProperties (String propDir, String param) throws IOException {

        Properties prop = new Properties();

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(propDir);

        if (is != null){
            prop.load(is);
        } else {
            throw new FileNotFoundException("property file '" + propDir + "' not found in the classpath");
        }

        return prop.getProperty(param);
    }
}
