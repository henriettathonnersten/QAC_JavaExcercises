package test;

import org.junit.Test;

public class TestHarness {
	
	@Test
	public void overAllTest() {
		GameTest gameTest = new GameTest();
		gameTest.gameExistanceCheck();
		gameTest.moveOfPlayer();
		gameTest.checkForStories();

		PlayerTest playerTest = new PlayerTest();
		playerTest.personExistanceCheck();
		playerTest.getNorthSouth();
		playerTest.setNorthSouth();
		playerTest.getWestEast();
		playerTest.setWestEast();
		playerTest.locationUpdate();
				
		CompassTest compassTest = new CompassTest();
		compassTest.compassExistanceCheck();
		compassTest.distanceCheck();
		compassTest.compassConverter();
		
		StoryTest storyTest = new StoryTest();
		storyTest.storyExistanceTest();
		storyTest.getStoryID();
		storyTest.setStoryID();
		storyTest.getStory();
		storyTest.setStory();		
	}

}
