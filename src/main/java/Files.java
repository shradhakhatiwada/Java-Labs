

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Aashish Katwal
 */
public class Files {

	public void writeToFile(String path) {

		try (FileOutputStream writeStream = new FileOutputStream(path.concat("sampleFile.txt"), false)) {
			writeStream.write("This is a sample paragraph".getBytes());
			writeStream.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void readFromFile(String path) {
		try (FileInputStream readStream = new FileInputStream(new File(path.concat("sampleFile.txt")))) {
			Scanner fileContent = new Scanner(readStream);

			while (fileContent.hasNext()) {
				System.out.println(fileContent.next());
			}

			fileContent.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {

		Files file = new Files();
		String path = "";

		file.writeToFile(path);

		file.readFromFile(path);

	}

}
