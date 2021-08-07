package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class CinfigDataProvider {
	static Properties prop= null;

	public static void main(String[] args) {
		try {
			File fs= new File("C:\\Users\\sid\\eclipse-workspace\\demo_selenium\\configs\\Configuration.properties");
	       FileInputStream fins= new FileInputStream(fs);
			prop= new Properties();
		}
		catch (Exception e) {
			System.out.println("fielk not found");
		}

	}
	public String geturl() {
		return prop.getProperty("url1");
	}
	public String getpassword() {
		return prop.getProperty("Password");
	}

	public String searchkey(String key) {
		return prop.getProperty(key);
	}

}
