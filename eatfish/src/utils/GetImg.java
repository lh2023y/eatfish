package utils;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import eatfish.World;

public class GetImg {
	/** ¶ÁÍ¼Æ¬µÄ·½·¨ */
	public static BufferedImage read(String fName) {
		try {
			BufferedImage img1 = ImageIO.read(World.class.getResource(fName));
			return img1;
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
