package automation.worldremit.initialsetup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

// TODO: Auto-generated Javadoc
/**
 * The Class CommonUtils.
 */
public class CommonUtils {

	/**
	 * Gets the val from resource.
	 * @return the val from resource
	 * @throws IOException 
	 */
	public static Properties getValFromResource() throws IOException{
		Properties config = new Properties();
			FileInputStream fsConfig = new FileInputStream(
			System.getProperty("user.dir") + "/src/test/resources/Configuration.properties");
			config.load(fsConfig);					
		return config; 
	}
		
	
	/**
	 * Gets the properties value.
	 * @param propkey the propkey
	 * @param prop the prop
	 * @return the properties value
	 */
	public static String getPropertiesValue(String propkey, Properties prop)
	{
		String sValue = prop.getProperty(propkey);
		return sValue;
	}

}
