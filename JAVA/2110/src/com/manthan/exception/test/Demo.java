package com.manthan.exception.test;

import java.io.File;
import java.io.IOException;

public class Demo {

	void run() throws IOException {

		File f= new File("Demo.txt");
		try {
			f.createNewFile();
		}

		catch(IOException e) {
			e.printStackTrace();
			throw e;
		}
	}
}
