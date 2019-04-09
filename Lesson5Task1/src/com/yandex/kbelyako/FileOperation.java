package com.yandex.kbelyako;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {
	public static void copyFile(File in, File out) throws IOException {
		byte[] bufer = new byte[1024 * 1024 * 8];
		int byteread = 0;
		try (FileInputStream fis = new FileInputStream(in);
				FileOutputStream fos = new FileOutputStream(out)) {
			for (; (byteread = fis.read(bufer)) > 0;) {
				fos.write(bufer, 0, byteread);
			}
		} catch (IOException e) {
			throw e;
		}
	}

	public static void list(File f) {
		// File content=new File (".");
		File[] fileArray = f.listFiles();
		for (File fileone : fileArray) {
			long fileSize = fileone.length();
			String type = (fileone.isFile()) ? "File" : "Folder";
			System.out.println(fileone.getName() + "\t" + type + "\t"
					+ fileSize);
		}
	}

}