package BaseDonnee;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MapTest {
	private Map map = new Map();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		map.open();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSelectMap() {
		final String mapt = "map1.txt";
		assertEquals(mapt, map.selectMap(1));
	}

	@Test
	public void testSelectMetal() {
		final String mapt = "metal.png";
		assertEquals(mapt, map.selectMetal(1));
	}

	@Test
	public void testSelectBrokenWall() {
		final String mapt = "murcasse.png";
		assertEquals(mapt, map.selectBrokenWall(1));
	}

	@Test
	public void testSelectWall() {
		final String mapt = "mur.png";
		assertEquals(mapt, map.selectWall(1));
	}

	@Test
	public void testSelectStone() {
		final String mapt = "rock.png";
		assertEquals(mapt, map.selectStone(1));
	}

	@Test
	public void testSelectDiamond() {
		final String mapt = "Diamantbleu.png";
		assertEquals(mapt, map.selectDiamond(1));
	}

	@Test
	public void testSelectMonstre() {
		final String mapt = "Enemi1_1.png";
		assertEquals(mapt, map.selectMonstre(1));
	}

}
