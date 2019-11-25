package com.manthan.exception.test;

import java.io.File;
import java.io.IOException;

public class TestG {
	public static void main(String[] args) {
		
		System.out.println("main started");

		File f = new File("sindhu.txt");
		
		try{
			f.createNewFile();
			System.out.println("file created");
		}
		
		catch(IOException e) {
			System.out.println("sorry could not create file");
		}

		System.out.println("main ends");
	}
}
