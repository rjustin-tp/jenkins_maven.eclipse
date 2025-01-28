package com.sddevops.jenkins_maven.eclipse2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SongCollectionTest {
	private SongCollection sc;
	private Song s1;
	private Song s2;
	private Song s3;
	private Song s4;
	private final int SONG_COLLECTION_SIZE = 4;

	@BeforeEach
	void setUp() throws Exception {
		// Arrange
		sc = new SongCollection();
		s1 = new Song("001", "good 4 u", "Olivia Rodrigo", 3.59);
		s2 = new Song("002", "Peaches", "Justin Bieber", 3.18);
		s3 = new Song("003", "MONTERO", "Lil Nas", 2.3);
		s4 = new Song("004", "bad guy", "billie eilish", 3.14);
		sc.addSong(s1);
		sc.addSong(s2);
		sc.addSong(s3);
		sc.addSong(s4);
	}

	@AfterEach
	void tearDown() throws Exception {
		sc = null;
	}

	@Test
	void testGetSongs() {
		List<Song> testSc = sc.getSongs();
		assertEquals(testSc.size(), SONG_COLLECTION_SIZE);
	}

	@Test
	void testAddSong() {
		List<Song> testSc = sc.getSongs();
		// Assert that Song Collection is equals to Song Collection Size 4
		assertEquals(testSc.size(), SONG_COLLECTION_SIZE);
		// Act
		sc.addSong(s1);
		// Assert that Song Collection is equals to Song Collection Size 4 + 1
		assertEquals(testSc.size(), SONG_COLLECTION_SIZE + 1);

	}

	@Test
	void testSortSongsByTitle() {
		ArrayList<Song> sortedSongsByTitle = sc.sortSongsByTitle();
		assertEquals(sortedSongsByTitle.get(0), s3);
		assertEquals(sortedSongsByTitle.get(1), s2);
		assertEquals(sortedSongsByTitle.get(2), s4);
		assertEquals(sortedSongsByTitle.get(3), s1);

	}

	@Test
	void testSortSongsBySongLength() {
		ArrayList<Song> sortedSongsByLength = sc.sortSongsBySongLength();
		assertEquals(sortedSongsByLength.get(0), s1);
		assertEquals(sortedSongsByLength.get(1), s2);
		assertEquals(sortedSongsByLength.get(2), s4);
		assertEquals(sortedSongsByLength.get(3), s3);

	}

	@Test
	void testFindSongsById() {
		Song songTest = sc.findSongsById("001");
		assertEquals(songTest, s1);
	}

	@Test
	void testFindSongByTitle() {
		Song songTest = sc.findSongByTitle("good 4 u");
		assertEquals(songTest, s1);
	}

}
