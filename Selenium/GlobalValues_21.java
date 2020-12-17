package Selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValues_21 {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream("/Users/imac/Documents/Eclipse-Workspace/Selenium/src/Selenium/data.properties");

		prop.load(fis);

		System.out.println(prop.getProperty("browser"));

		System.out.println(prop.getProperty("url"));

		prop.setProperty("browser", "firefox");

		System.out.println(prop.getProperty("browser"));

		FileOutputStream fos = new FileOutputStream("/Users/imac/Documents/Eclipse-Workspace/Selenium/src/Selenium/data.properties");

		prop.store(fos, null);

	}

}