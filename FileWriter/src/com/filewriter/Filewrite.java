package com.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		The file writer is meant to write character data to a file
//		It does not matter if a file to be written on is present or not, The file writer class always creates a file
//		You can override the existing file using file writer and also append to the existing file.
		
		FileWriter obj = new FileWriter("abc.txt"); 
		obj.write((int)(100));
		obj.write("My name is Lawrence");
		obj.flush();
		obj.close(); 
//		System.out.println(obj);
		DocumentHandler obj2 = new DocumentHandler();
		obj2.examinefile("C:\\Users\\DELL\\Documents\\chatGPT.txt");
		System.out.println(obj2.examinefile("C:\\Users\\DELL\\Documents\\gift.txt"));
	}

}
