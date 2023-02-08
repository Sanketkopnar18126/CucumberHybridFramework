package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configatorclass {
	
	
public static Properties intialiseprop() throws IOException {
	
	Properties prop=new Properties();
	
	
	File fl=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties");
	
	try {
		FileInputStream fis = new FileInputStream(fl);
		prop.load(fis);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
	return prop;
	
}
}
