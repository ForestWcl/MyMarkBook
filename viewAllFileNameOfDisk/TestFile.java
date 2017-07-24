import java.io.*;

public class TestFile
{
	public static void main(String[]agrs){
	
		File f = new File("E:/");
		method(f);
	}
	public static void method(File f){
		
		if(f.isFile()){
			return ;
		}
		File [] fs = f.listFiles();
		for(File subFile : fs){
			System.out.println(subFile.getAbsolutePath());
			method(subFile);
		}
	}
}
