package test;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		File file = new File("some/test.txt");
		System.out.println(file.exists());
	}

}