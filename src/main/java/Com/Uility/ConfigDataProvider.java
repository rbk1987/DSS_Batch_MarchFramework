package Com.Uility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() throws IOException  {
		String path="C:\\Users\\sspm\\eclipse-workspace\\DSS_Bach_MarchFramework\\Config\\Config.Properties";
		FileInputStream fis=new FileInputStream(path);
		pro=new Properties();
		pro.load(fis);
		
	}
	public String getBaseUrl_QA1()
	{
		return pro.getProperty("BaseUrl_QA1");
	}

}
//y  t