package myproj;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileUtil {


	public static void writeAsString(File targetFile, String resultStr) {
		
		System.out.println("fileUtil->resultStr ===== " + resultStr);
		
		FileOutputStream fos  = null;
		OutputStreamWriter osw = null;
		try {
			fos = new FileOutputStream(targetFile);
			
			osw = new OutputStreamWriter(fos);
			
			osw.write(resultStr);
			osw.flush();
			
			fos.close();
			
		} catch (IOException e) {
			
			System.out.println(e);
			
			e.printStackTrace();
		}
		
	}
}
