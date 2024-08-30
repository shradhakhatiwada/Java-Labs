

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author hp
 */

@SuppressWarnings("serial")
class AchsStudent implements Serializable {
	String name;
	private int roll, labNum;

	public AchsStudent(String name, int roll, int labNum) {
		this.name = name;
		this.roll = roll;
		this.labNum = labNum;
	}

	public void display() {
		System.out.printf("Name: %s%nRoll: %d%nLab Question: %d", name, roll, labNum);
	}
}

public class SerializationDeserialization {

	public static void main(String[] args) {

		AchsStudent student = new AchsStudent("Shradha Khatiwada", 211843, 20);

		String path = "employee_object.txt";
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {

			oos.writeObject(student);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Object Serialized.");

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
			AchsStudent deserializedStudent = (AchsStudent) ois.readObject();
			deserializedStudent.display();
		} catch (IOException | ClassNotFoundException e) {
			e.getMessage();
		}
	}
}
