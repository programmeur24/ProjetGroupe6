package Element;

import static org.junit.Assert.*;

import java.awt.Image;

import javax.swing.ImageIcon;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ElementTest {
	private Element element;
	private Type type;
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
		this.type = Type.HARD;
		this.correspond = new Correspondence("Diamantbleu.png", '#');
		this.correspond.loadImage();
		this.element = new Element(type, correspond);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetCorrespondence() {
		final Correspondence cor = new Correspondence("Diamantbleu.png", '#');
		assertEquals(cor,this.element.getCorrespondence());
	}

	@Test
	public void testGetType() {
		final Type cor = Type.HARD;
		assertEquals(cor,this.element.getType());
	}

	@Test
	public void testGetImage() {
		this.imageIco = new ImageIcon(getClass().getResource("/Images/Diamantbleu.png"));
		this.image = this.imageIco.getImage();
		assertEquals(image, this.element.getCorrespondence().getImage());
	}

}
