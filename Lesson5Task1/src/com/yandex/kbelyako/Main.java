package com.yandex.kbelyako;

import java.io.File;
import java.io.IOException;
public class Main {
public static void main(String[] args) {
MyFileFilter mFF = new MyFileFilter("docx", "pdf");
File folder = new File("C:/Users/kbelyakov/Desktop/OMC ADM/Новая папка/Java/OOP");
File testFolder = new File("TestJ");
testFolder.mkdirs();
//File[] fileList = folder.listFiles(mFF);
File[] fileList = folder.listFiles();
for (File file : fileList)
{
System.out.println(file);
}

File content=new File (".");

FileOperation.list(content);

/*File[] fileArray=content.listFiles();
 for (File fileone : fileArray) {
	long fileSize=fileone.length();
	String type=(fileone.isFile()) ? "File":"Folder";
	System.out.println(fileone.getName()+"\t"+type+"\t"+fileSize);
}*/

File in = new File("C:/Users/kbelyakov/Desktop/OMC ADM/Новая папка/Java/OOP/Java OOP (All cource).pdf");
File out = new File("book.pdf");

try {
	FileOperation.copyFile(in, out);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

System.out.println("After copy:");
FileOperation.list(content);


}
}