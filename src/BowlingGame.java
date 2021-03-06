import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time: 21:02
// Student ID: it3-2015

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
	public void setBonus(int firstThrow, int secondThrow) throws BowlingException{
		bonus=new Frame(firstThrow, secondThrow);
	}
	
	// Returns the game score
	public int score(){
		for (int i = 0; i < frames.size(); i++) {
				if(i!=0){
					if(frames.get(i-1).isSpare())
						frames.get(i-1).setFrameScore(frames.get(i-1).getFrameScore()+frames.get(i).getFirstThrow());
					else if(frames.get(i-1).isStrike())
						frames.get(i-1).setFrameScore(frames.get(i-1).getFrameScore()+frames.get(i).score());
			}
			ukupno+=frames.get(i).score();
		}
		
		if(bonus!=null){
			if(frames.get(9).isSpare())
				ukupno+=bonus.getFirstThrow();
			else if(frames.get(9).isStrike())
				ukupno+=bonus.score();
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
