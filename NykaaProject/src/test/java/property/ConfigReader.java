package property;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	public static Properties p;
	public ConfigReader() throws Throwable {
		File f=new File("C:\\Users\\HP\\New_workspace\\Interview\\NykaaProject\\src\\test\\java\\property\\Nykaa.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	public String geturl() {
		String url = p.getProperty("url");
		return url;

	}
	public String getnum() {
		String num=p.getProperty("num");
		return num;
	}
}
