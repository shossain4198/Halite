package hlt;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.IOException;

public class Writer {
	private String path;
	private boolean append_to_file = false;
	
	public Writer(String file_path)
	{
		path = file_path;
	}
	public Writer(String file_path, boolean append)
	{
		path = file_path;
		append_to_file = append;
	}
	
	public void writeToFile(String string) throws IOException{
		FileWriter write = new FileWriter(path, append_to_file);
		PrintWriter print_line = new PrintWriter(write);
		print_line.printf("%s" + "%n", string);
		print_line.close();
	}
}