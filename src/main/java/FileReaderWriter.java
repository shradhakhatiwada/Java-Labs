

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Aashish Katwal
 */
public class FileReaderWriter {

	public void writeToFile(String path) {
		try (FileWriter writer = new FileWriter(path)) {
			String text = "Lorem ipsum is a dummy text. It is used massively to place random temporary contents.";

			writer.write(text);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public void readFromFile(String path) {
		try (FileReader reader = new FileReader(path)) {
			int data;
			while ((data = reader.read()) != -1) {
				System.out.print((char) data);
			}
		
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public static void main(String[] args) {
		String path = "IO_File.dat";
		FileReaderWriter frw = new FileReaderWriter();

		frw.writeToFile(path);
		frw.readFromFile(path);
	}
}
