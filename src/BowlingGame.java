import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int ukupno=0;
	
	public BowlingGame(){
		
	}
	
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException{
		if(frames.size()<10)
			this.frames.add(frame);
		else
			throw new BowlingException();
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		bonus=new Frame(firstThrow, secondThrow);
	}
	
	// Returns the game score
	public int score(){
		for (int i = 0; i < frames.size(); i++) {
			ukupno+=frames.get(i).getFrameScore();
		}
		return ukupno;
	}

	public List<Frame> getFrames() {
		return frames;
	}

	public void setFrames(List<Frame> frames) {
		this.frames = frames;
	}

	public Frame getBonus() {
		return bonus;
	}	
	
}
