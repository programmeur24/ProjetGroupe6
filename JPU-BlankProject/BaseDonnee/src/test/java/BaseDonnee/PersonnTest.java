package BaseDonnee;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonnTest {
	private Personn personnage = new Personn();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		personnage.open();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSelectPersonnage() {
		final String mapt = "JoueurVersHaut.png";
		assertEquals(mapt, personnage.selectPersonnage(1));
	}

}
