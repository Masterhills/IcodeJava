package com.filehandle;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FileManaget {

	public static void main(String[] args) throws IOException {
		
//		LinkedList obj5 = new LinkedList();
//		obj5.add(0, "lawrence");
//		obj5.add(1,5);
//		obj5.add(3,2);
//		obj5.add(2,"uche");
//		Iterator ot = obj5.iterator();
//		while(ot.hasNext()) {
//			System.out.println(ot.next());
//		}
		// TODO Auto-generated method stub
//		Creating a file in CWD(Current working directory) name abc.txt
		File f = new File("abc.txt");
//		f.createNewFile();           
		File obj = new File("handle.txt");
		System.out.println(obj.exists());
		obj.createNewFile();
		System.out.println(obj.exists());
		
//		First, creating a directory, mrHilss and then creating a file abc.txt in mrHilss directory
		File f1 = new File("mrHilss");
		f1.mkdir();
		File f2 = new File("mrHilss","abc.txt");
		System.out.println(f1.exists());
//		
////		We can also write the second section line of code
		File f3 = new File(f1,"abc.txt");
		f3.createNewFile();
//		
//		//Creating a file, demo.txt in the Desktop directory
		File f4 = new File("C://Users//DELL//Desktop","demo.txt");
		f4.createNewFile();
		
//		Important methods in file class	
		System.out.println(5);
		System.out.println(f.isFile());
		
		int count_f = 0;
		int count_D = 0;
		File f5 = new File("C://Users//DELL//Desktop");
		String s[] = f5.list();
		for(String s1: s) {
			File f6 = new File(f5, s1);
			if(f6.isFile()) {
				count_f+=1;
				System.out.println(s1);
			}
			if(f6.isDirectory()) {
				count_D+=1;
				System.out.println(s1);
			}
		}
			System.out.printf("The total number of files is " + count_f);
			System.out.println("");
			System.out.printf("The total number of Directories is "+ count_D);
			System.out.println("");
			
			int count = 0;
			String name = "Uche lawrence";
			for(int i = 0; i<name.length(); ++i) {
				if(name.charAt(i) ==  ' ') {
					continue;
				}
				System.out.print(name.charAt(i)+ "");
				count+=1;
			}
			System.out.println("");
			System.out.println(count);
			
//		System.out.println(count);
	}

}
