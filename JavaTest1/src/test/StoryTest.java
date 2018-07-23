package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import code.Story;

public class StoryTest {
	
	Story story = new Story(1, "Lorem ipsum");
	
	@Test
	public void storyExistanceTest() {
		assertNotNull(story);
	}
	 
	@Test
	public void getStoryID() {
		assertEquals("The ID is not the same as the ID expected", 1, story.getID());
	}
	
	@Test
	public void setStoryID() {
		story.setID(5);
		assertEquals("The ID is not the same as the ID expected", 5, story.getID());
	}
	
	@Test 
	public void getStory() {
		assertEquals("The story is not the one expected", "Lorem ipsum", story.getOutput());
	}
	
	@Test 
	public void setStory() {
		story.setOutput("The hare jumped over the quick brown fox.");
		assertEquals("The story is not the one expected", "The hare jumped over the quick brown fox.", story.getOutput());
	}
	
}
