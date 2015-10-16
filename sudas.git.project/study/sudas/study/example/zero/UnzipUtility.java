package sudas.study.example.zero;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import java.util.zip.ZipEntry;

import java.util.zip.ZipInputStream;

public class UnzipUtility {

	public static void main(String[] args) {
		String input = "C:/Test/zip/Test/New folder/jbe-0.1.1.zip";
		String destination = "C:/sudas";

		Unzipping zip = new Unzipping();
		zip.unzip(input, destination);
	}

}

class Unzipping {
	public void unzip(String input, String destination) {

		FileInputStream in;
		byte[] buffer = new byte[1024];
		try {
			in = new FileInputStream(input);
			ZipInputStream zis = new ZipInputStream(in);

			ZipEntry zipentry = null;

			while ((zipentry = zis.getNextEntry()) != null) {
				String zipfilename = zipentry.getName();
				// System.out.println(zipfilename);

				File file = new File(destination + '/' + zipfilename);
				System.out.println(destination + '/' + zipfilename);

				if (zipentry.isDirectory()) {
					if (zipfilename.endsWith("/")) {
						file.mkdirs();
					}
				}

				else {

					// System.out.println("parent "+file.getParent());
					// System.out.println("name "+file.getName());
					// System.out.println("absolute path "+file.getAbsolutePath());

					FileOutputStream fos = new FileOutputStream(file);
					int length;
					while ((length = zis.read(buffer)) > 0) {
						fos.write(buffer, 0, length);
					}

					fos.close();
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}