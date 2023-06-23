package com.javaFileHtmlDeserialize;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Htmldd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileWriter obj = new FileWriter("index.html");?
		FileOutputStream fos = new FileOutputStream("index.hml");
		String fis = fos.toString();
		System.out.println(fis);
	}

}
