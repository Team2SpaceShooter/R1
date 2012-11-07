import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;


public class BufferedImageLoader {

	public BufferedImage loadImage(String pathRelativeToThis) throws IOException{
		BufferedImage img = null;
		
		try {
			URL url = this.getClass().getResource(pathRelativeToThis);
			if (url == null)
				System.out.println("cant find path: " + pathRelativeToThis);
			img = ImageIO.read(url);
		} catch (IOException e) {
			
			System.out.println("in cathc; failed to laod");
		}
		
		return img;
	}
}
