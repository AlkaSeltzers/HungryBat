import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 
 */

/**
 * @author Alka, Subhiksha, Rubaiya
 *
 */
public class CommonUtils {
	
	public static BufferedImage loadImage(String imgName) {
		try {
		   return ImageIO.read(new File(Constants.IMAGE_FOLDER +  imgName));
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		return null;
	}

}
