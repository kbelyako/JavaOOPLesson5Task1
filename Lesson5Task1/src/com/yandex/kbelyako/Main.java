package com.yandex.kbelyako;

import java.io.File;
public class Main {
public static void main(String[] args) {
MyFileFilter mFF = new MyFileFilter("docx", "pdf");
File folder = new File("C:/Users/kbelyakov/Desktop/OMC ADM/Новая папка/Java/OOP");
File[] fileList = folder.listFiles(mFF);
for (File file : fileList) {
System.out.println(file);
}
}
}