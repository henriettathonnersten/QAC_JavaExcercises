package code;

public class Story {
	private int storyID;
	private String output;
	
	public Story(int id, String story) {
		storyID = id;
		output = story;
	}
	
	public int getID() {
		return storyID;
	}
	
	public void setID(int newID) {
		storyID = newID;
	}
	
	public String getOutput() {
		return output;
	}
	
	public void setOutput(String newStory) {
		output = newStory;
	}
}
