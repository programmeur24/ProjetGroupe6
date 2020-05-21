package Element;

import static org.junit.Assert.*;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CorrespondenceTest {
	private Correspondence correspond;
	private ImageIcon imageIco;
	private Image image;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.correspond = new Correspondence("Diamantbleu.png", '#');
		correspond.loadImage();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetImage() {
		this.imageIco = new ImageIcon(getClass().getResource("/Images/Diamantbleu.png"));
		this.image = this.imageIco.getImage();
		assertEquals(image, this.correspond.getImage());
	}

	@Test
	public void testGetImageName() {
		final String name = "Diamantbleu.png";
		assertEquals(name, this.correspond.getImageName());
	}

	@Test
	public void testGetCharacterImage() {
		final char caract = '#';
		assertEquals(caract, this.correspond.getCharacterImage());
	}

}
