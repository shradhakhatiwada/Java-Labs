

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author hp
 */
public class DataIOStream {

	public void readFromFile(String path) {
		try (DataInputStream readStream = new DataInputStream(new FileInputStream(path))) {
			byte[] fileData = readStream.readAllBytes();
			System.out.println(new String(fileData));
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public void writeToFile(String path) {
		try (DataOutputStream stream = new DataOutputStream(new FileOutputStream(path))) {
			stream.writeBytes("This is written from Data output Stream");
			;
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public static void main(String[] args) {
		String path = "Test.txt";

		DataIOStream stream = new DataIOStream();
		stream.writeToFile(path);
		stream.readFromFile(path);
	}
}
