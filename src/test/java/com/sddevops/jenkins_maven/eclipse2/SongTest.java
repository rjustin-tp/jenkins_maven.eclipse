package com.sddevops.jenkins_maven.eclipse2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SongTest {
	private Song s1;

	@BeforeEach
	void setUp() throws Exception {
		s1 = new Song("001", "good 4 u", "Olivia Rodrigo", 3.59);
	}

	@AfterEach
	void tearDown() throws Exception {
		s1 = null;
	}

	@Test
	void testGetId() {
		String id = s1.getId();
		assertEquals(id, "001");
	}

	@Test
	void testSetId() {
		s1.setId("005");
		assertEquals(s1.getId(), "005");
	}

	@Test
	void testGetTitle() {
		String title = s1.getTitle();
		assertEquals(title, "good 4 u");
	}

	@Test
	void testSetTitle() {
		fail("Not yet implemented");
	}

	@Test
	void testGetArtiste() {
		fail("Not yet implemented");
	}

	@Test
	void testSetArtiste() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSongLength() {
		fail("Not yet implemented");
	}

	@Test
	void testSetSongLength() {
		fail("Not yet implemented");
	}

}
