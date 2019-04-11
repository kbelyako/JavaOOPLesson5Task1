package com.yandex.kbelyako;

import java.io.File;
import java.io.IOException;
public class Main {
public static void main(String[] args) {
	
MyFileFilter mFF = new MyFileFilter("docx", "pdf");

File root = new File(".");
File copySource = new File("CopySource");
File copyTarget = new File("CopyTarget");
File testFile = new File(copySource,"Test.txt");

try {
	testFile.createNewFile();
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}

FileOperation.list(root); 

copySource.mkdirs();
copyTarget.mkdirs();

FileOperation.list(root);

System.out.println("Before copy target:");
FileOperation.list(copyTarget);

try {
	FileOperation.copyFilesExt(copySource, copyTarget, "txt");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
}

System.out.println("After copy, target:");
File  copyedfTestFile= new File(copyTarget, testFile.getName());
FileOperation.list(copyTarget);
copyedfTestFile.delete();



}
}