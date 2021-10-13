package exceptionsHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExternalFileOutputDemo {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("/home/iamneha30gmail/Documents/Output");
		PrintWriter printWriter = new PrintWriter(f);
		
		printWriter.print("Hello Neha !!!");
		printWriter.close();
	}
}
