package com.api.demo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadingProps {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Reading File!!!

		// WHere the file is present!!
		// File

		System.out.println(System.getProperty("user.dir"));
		File myfile = new File(System.getProperty("user.dir") + "\\config\\qa.properties");

		FileReader fileReader = new FileReader(myfile);
		Properties properties = new Properties();
		properties.load(fileReader);
		System.out.println(properties.getProperty("URL"));
	}

}
