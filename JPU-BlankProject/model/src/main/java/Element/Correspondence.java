package Element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Correspondence {
	//****ATTRIBUT****//
	private ImageIcon imageIco;
	private Image image;
	private String imageName;
	private char characterImage;
	private boolean imageLoaded;
	
	
	
	//****CONSTRUCTEUR****//
	public Correspondence(String imageName, char characterImage) {
		this.setCharacterImage(characterImage);
		this.setImageName(imageName);
	}
	
	public Correspondence(char characterImage) {
		this("ImageParDefaut",characterImage);
	}


	
	//****SETTERS****//
	public void setImage(Image image) {
		this.image = image;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public void setCharacterImage(char characterImage) {
		this.characterImage = characterImage;
	}

	public void setImageLoaded(boolean imageLoaded) {
		this.imageLoaded = imageLoaded;
	}
	
	public void setImageIco(ImageIcon imageIco) {
		this.imageIco = imageIco;
	}
	
	
	
	//****GETTERS****//
	public Image getImage() {
		return image;
	}

	public String getImageName() {
		return imageName;
	}

	public char getCharacterImage() {
		return characterImage;
	}

	public boolean isImageLoaded() {
		return imageLoaded;
	}
	
	public ImageIcon getImageIco() {
		return imageIco;
	}
	
	
	
	//****METHODES****//
	public final void loadImage() throws IOException {
		this.imageIco = new ImageIcon(getClass().getResource("/Images/"+this.getImageName()));
		this.setImage(this.imageIco.getImage());	
	}
}
