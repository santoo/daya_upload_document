package com.test.syncdoc.SyncDocuments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

/**
 * Hello world!
 *
 */
public class SyncDocument {
	
	public void uploadDocument(String fileUri, String fileName) {
		HttpEntity entity = MultipartEntityBuilder.create().addTextBody("field1", "value1")
				.addBinaryBody("", new File(fileUri), ContentType.create("application/octet-stream"), fileName)
				.build();
		HttpPost request = new HttpPost("");
		request.setEntity(entity);

		HttpClient client = HttpClientBuilder.create().build();
		try {
			HttpResponse response = client.execute(request);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
