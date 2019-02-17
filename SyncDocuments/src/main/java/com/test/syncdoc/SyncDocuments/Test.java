package com.test.syncdoc.SyncDocuments;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class Test {
	static String json = "C:\\Users\\santh\\eclipse-workspace\\SyncDocuments\\resource\\csvjson(1).json";
	public static void main(String args[]) {
		JavaFileHandler j=new JavaFileHandler();

		JsonReader reader;
		try {
			reader = new JsonReader(new FileReader(json));
			Map jsonJavaRootObject = new Gson().fromJson(reader, Map.class);
			ArrayList al=(ArrayList) jsonJavaRootObject.get("test");
			System.out.print(jsonJavaRootObject.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
