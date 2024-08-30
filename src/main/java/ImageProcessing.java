

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * @author hp
 * 
 */
public class ImageProcessing {

	public void readImage(String path) {
		BufferedImage image = null;
		try {
			File file = new File(path);

			image = new BufferedImage(1080, 1080, BufferedImage.TYPE_INT_ARGB);

			image = ImageIO.read(file);

		} catch (IOException e) {
			e.getMessage();
		}

		writeImage(image);

	}

	public void writeImage(BufferedImage image) {
		try {
			File output = new File("C:\\users\\hp\\Downloads\\generatedImage.jpg");
			ImageIO.write(image, "jpg", output);

		} catch (IOException e) {
			e.getMessage();
		}
	}

	public static void main(String[] args) {

		String imagePath = "C:\\users\\hp\\Downloads\\Untitled%20Diagram.drawio.png";

		ImageProcessing process = new ImageProcessing();

		process.readImage(imagePath);
                
                System.out.println("DOne");

	}

}
