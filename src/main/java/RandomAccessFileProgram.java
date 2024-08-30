import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author hp
 */
public class RandomAccessFileProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String filePath = "example.dat";

		// Step 1: Write data to the file
		try (RandomAccessFile raf = new RandomAccessFile(filePath, "rw")) {
			// Write some data to the file
			raf.writeInt(100); // Write an integer at the start
			raf.writeDouble(123.456); // Write a double after the integer
			raf.writeUTF("Hello, RandomAccessFile!"); // Write a string

			System.out.println("Data written to file.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Step 2: Read data from specific positions in the file
		try (RandomAccessFile raf = new RandomAccessFile(filePath, "r")) {
			// Move the file pointer to the beginning and read the integer
			raf.seek(0);
			int intValue = raf.readInt();
			System.out.println("Integer read: " + intValue);

			// Move the file pointer to the position after the integer and read the double
			raf.seek(4); // Move to byte position 4 (after the integer)
			double doubleValue = raf.readDouble();
			System.out.println("Double read: " + doubleValue);

			// Move the file pointer to the position after the double and read the string
			raf.seek(12); // Move to byte position 12 (after the integer and double)
			String stringValue = raf.readUTF();
			System.out.println("String read: " + stringValue);

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Clean up the file (optional)
		File file = new File(filePath);
//		if (file.delete()) {
//			System.out.println("File deleted.");
//		} else {
//			System.out.println("Failed to delete the file.");
//		}
	}
}
