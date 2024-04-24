package edu.sabanciuniv.it524.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class MainClass4FileWriter {

	public static void main(String[] args) {
		
		try {
			FileWriter wr = new FileWriter("abc.txt", true);
			wr.write("Question authority \n");
			wr.close();
			
			System.out.println(".write() action completed");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		/*
		//aynı işi yapan ama otomatik close metodu çağıran try kullanılabilir
		//try with resources
		
		/*	try-catch'in bir de "try-with-resources" versiyonu var
		 * 
		 * try'ın yanına bir parantez koymak istersem parantez içine sadece Closable interface'ini implement eden
		 * class objeleri konulabiliyor
		 * Bu işlemi yaptığımda da FileReader gibi kullandıktan sonra close() edilmesi gereken objelerin 
		 * close() işlemi otomatik olarak yapılmış oluyor >> try parantezine reader objesini eklersem*
		 * Try parantezi içine bu objeyi yazmasaydım .close() işlemini yapmak zorundaydım
		 */
		
		/*
		try (FileWriter wr = new FileWriter("abcd.txt"))
		{
			wr.write("merhaba");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		
		
		
	/*	
		The try-with-resources Statement

		The try-with-resources statement is a try statement that declares one or more resources. A resource is an object that must be closed after the program is finished with it. The try-with-resources statement ensures that each resource is closed at the end of the statement. Any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable, can be used as a resource.

		The following example reads the first line from a file. It uses an instance of FileReader and BufferedReader to read data from the file. FileReader and BufferedReader are resources that must be closed after the program is finished with it:

			static String readFirstLineFromFile(String path) throws IOException {
			    try (FileReader fr = new FileReader(path);
			         BufferedReader br = new BufferedReader(fr)) {
			        return br.readLine();
			    }
			}	
	*/
		
		
		
	}

}
