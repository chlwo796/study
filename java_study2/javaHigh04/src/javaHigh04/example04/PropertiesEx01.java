package javaHigh04.example04;

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx01 {
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		properties.load(PropertiesEx01.class.getResourceAsStream("database.properties"));

		System.out.println(properties.getProperty("driver"));
		System.out.println(properties.getProperty("url"));
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
		System.out.println(properties.getProperty("admin"));
	}
}
