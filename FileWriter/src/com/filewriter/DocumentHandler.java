package com.filewriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DocumentHandler {
	
	public DocumentHandler() {
		
	}
	public String getfilepath(String filepath) {
		return filepath;
	}
	public boolean examinefile(String filepath) throws FileNotFoundException {
		Scanner fileSc = new Scanner(filepath);
		if(fileSc.hasNextLine()) {
			return true;
		}
		fileSc.close();
		return false;
	}

//	public Boolean documentSieve() {
//		FileInputStream input = new FileInputStream(stringPath);
//		return true;
//		
//	}

}
