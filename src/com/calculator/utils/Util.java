package com.calculator.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;




import com.google.gson.Gson;

public class Util {
	
	
	/*
	 * Read properties for every web page from JSON file. For e.g., the button
	 * CSSSelectors, title, content, etc..<br>
	 *
	 * @param fileName
	 *            the file name
	 * @return the PageProperties object.
	 */
	public static PageProperties readPageProperties(String fileName) {
		final Gson gson = new Gson();
		try {
			InputStream fileSource = new FileInputStream(fileName);
			final BufferedReader reader = new BufferedReader(
					new InputStreamReader(fileSource, StandardCharsets.ISO_8859_1));
			PageProperties prop = gson.fromJson(reader, PageProperties.class);
			Logger.Debug("loading page properties success");
			return prop;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
    
    public static  void delay(int seconds){

    	try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}