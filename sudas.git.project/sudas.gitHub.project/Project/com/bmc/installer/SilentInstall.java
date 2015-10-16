package com.bmc.installer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class SilentInstall {

	public static void main(String[] args) {

		Sinstall s = new Sinstall();
		s.install();

	}

}

class Sinstall {

	public void install() {

		try {
			// creating object of the ZIP CLASS
			
			
			ZipFile zip = new ZipFile("C:\\Test\\zip\\Test\\installTuner.zip");

			
			//
			Enumeration<? extends ZipEntry> fileList = zip.entries();
			while (fileList.hasMoreElements()) {
				ZipEntry files = fileList.nextElement();
				String name = files.getName();
				System.out.println(name);

				File file = new File("C:\\Test\\zip\\Test\\installTuner.zip");
				System.out.println(file.getAbsolutePath());
				if (name.endsWith("/")) {
				file.mkdirs();
					continue;
					
				}
				
				File parent = file.getParentFile();
				if (parent != null) {
					parent.mkdirs();
				}

				InputStream is = zip.getInputStream(files);
				FileOutputStream fos = new FileOutputStream(file);
				
				byte[] bytes = new byte[1024];
				int length;
				while ((length = is.read(bytes)) >= 0) {
					fos.write(bytes, 0, length);
				}
				is.close();
				fos.close();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}