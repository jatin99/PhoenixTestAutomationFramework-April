package com.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.config.pojo.Config;
import com.config.pojo.Environment;
import com.google.gson.Gson;

public class JSONUtility {

	//reading JSON File for us
	
	public static Environment readJSONConfig(String env) throws FileNotFoundException {
		Gson gson = new Gson();
		File jsonFile = new File(System.getProperty("user.dir")+"//config//config.json");
		FileReader fileReader = new FileReader(jsonFile);
		Config config=gson.fromJson(fileReader, Config.class);
		
		Environment environment =config.getEnvironments().get(env);
		return environment;


		
	}
}
