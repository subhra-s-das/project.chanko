package Scanner;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ScannerTakeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void takeInput() {

		// USE OF BYTE CLASS TO READ AND WRITE
		/***
		 * To read a file using byte class use 1. BufferedInputStream 2.
		 * FileInputStream
		 * 
		 */
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/***
		 * To write a file using byte class use 1. BufferedInputStream 2.
		 * FileInputStream
		 * 
		 */
		try {
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// character class

	}

}
