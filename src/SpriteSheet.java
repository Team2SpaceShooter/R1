/*
 * This is the class that holds/reads the sprite sheet
 * 
 * This will hold the sprite sheet in a buffered image
 * 
 * The one method will grab the indicated sprite and return the image
 * 
 * 
 */

import java.awt.image.BufferedImage;

public class SpriteSheet {

	public BufferedImage spriteSheet;
	
	public SpriteSheet(BufferedImage ss) {
		this.spriteSheet = ss;
	}
	
	public SpriteSheet() {
		// TODO Auto-generated constructor stub
	}

	// this grabs the image based on width and height as well as x,y coord
	public BufferedImage gradSprite(int x, int y, int width, int height){
		
		BufferedImage sprite = spriteSheet.getSubimage(x, y, width, height);
		return sprite;
	}
		
}
