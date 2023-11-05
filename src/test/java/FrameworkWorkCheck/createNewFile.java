package FrameworkWorkCheck;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class createNewFile {

	public static void main(String[] args) throws IOException {
		File file= new File("demo.html");
		file.createNewFile();
		System.out.println("Done");
		
		Path pat=Paths.get("demo.txt");
		Files.createFile(pat);

	}

}
