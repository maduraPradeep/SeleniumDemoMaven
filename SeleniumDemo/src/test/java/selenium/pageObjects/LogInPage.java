package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import core.Utilities;

public class LogInPage extends AbstractPage {
//	Properties config = Utilities.LoadConfigurations();
//	String resourceFileDir = config.getProperty("ResourceFilesDirectory");
	
	public static void LoadResources() throws IOException {
		Properties config = Utilities.LoadConfigurations();
		String baseDirectory = new File(".").getAbsolutePath();
		FileInputStream stream = 
				new FileInputStream(baseDirectory+ config.getProperty("ResourceFilesDirectory") + "LoginPageResources.properties");
		
		LoadResourceFile(stream);
	}
	
	public static String EmailAddress() {
		return PageResources.getProperty("emailTextBoxId");
	}
	
	public static String Password() {
		return PageResources.getProperty("passwordTextBoxId");
	}
	
	public static String LogInButton() {
		return PageResources.getProperty("logInButtonId");
	}
}
