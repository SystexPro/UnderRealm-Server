package net.underrealm.io;


import java.io.File;
import java.io.IOException;



public class FileManager {
	

	
	
	
	public static void openFile(String fileDir) {
		File file = new File(fileDir);
	}
	
	public static  void writeFile(String fileDir) {
		File file = new File(fileDir);
		if(!file.canWrite()) {
			return;
		}
		
	}
	
	public static void createDir(String fileDir) {
		File file = new File(fileDir);
		if(file.exists()) {
			return;
		} else {
			file.mkdir();
			System.out.println("Created Dir " + file.getName());
		}
	}
	
	
	public static void createFile(String fileDir) {
		File file = new File(fileDir);
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("Created new file " + file.getName());
			} catch (IOException e) {
				System.out.println("Error creating new file " + file.getName());
				e.printStackTrace();
			}
		}
	}

}
