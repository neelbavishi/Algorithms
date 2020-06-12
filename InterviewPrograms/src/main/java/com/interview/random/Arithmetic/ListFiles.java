package com.interview.random.Arithmetic;

import java.io.File;

public class ListFiles {

	public void listFilesInDirectory(File dir) {
		  File[] files = dir.listFiles();
		  if (files != null) {
		    for (File f : files) {
		      if (f.isDirectory()) {
		        listFilesInDirectory(f);
		      } else {      
		        System.out.println(f.getName());
		      }
		    }
		  }
		}
	
	public static void main(String args[]){
		ListFiles fl = new ListFiles();
		File driveRoot = new File("C:\\nbavishi");
		fl.listFilesInDirectory(driveRoot);
	}
	
}
