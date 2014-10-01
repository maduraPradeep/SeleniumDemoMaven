package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import core.Utilities;

public class UserHomePage extends AbstractPage {
	
	public static void LoadResources() throws IOException {
		Properties configs = Utilities.LoadConfigurations();
		String baseDirectory = new File(".").getAbsolutePath();
		FileInputStream stream = 
				new FileInputStream(baseDirectory+ configs.getProperty("ResourceFilesDirectory") + "UserHomePageResources.properties");
		LoadResourceFile(stream);
	}
	
	public static String FBLogo(){
		return PageResources.getProperty("FBLogoXPath");
	}
	
	public static String ProfileName() {
		return PageResources.getProperty("UsersNameLabelXPath");
	}
	
	public static String UserAccountAnchor() {
		return PageResources.getProperty("UserAccountAnchorId");
	}
	
	public static String LogOutButton() {
		return PageResources.getProperty("LogOutButtonXPath");
	}
}
