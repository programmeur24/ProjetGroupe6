package com.entity.motionlesselements;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import entity.EntityTest;

public class ExitDoorTest extends EntityTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		entity = new ExitDoor(3,3);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testExitDoor() {
		super.testEntityBasicCharacteristics();
		final String expectedSpriteName = "Door.png";
		final char expectedCharName = 'e';
		assertEquals(expectedCharName, entity.getSprite().getConsoleImage());
		assertEquals(expectedSpriteName, entity.getSprite().getImageName());
		assertNull(entity.getStrategy());
	}

}
