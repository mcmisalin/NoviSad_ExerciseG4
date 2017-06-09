public class Frame {
	private int firstThrow;
	private int secondThrow;
	private int frameScore;
	
	public Frame(int firstThrow, int secondThrow) throws BowlingException{
		if(firstThrow+secondThrow>10)
			throw new BowlingException();

		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
		frameScore= firstThrow+secondThrow;
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	//returns the score of a single frame
	public int score(){
		frameScore= this.firstThrow+this.secondThrow;
		return frameScore;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(this.firstThrow==10)
			return true;
		else
			return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if(this.firstThrow+this.secondThrow==10 && !isStrike())
			return true;
		else
			return false;
	}
}
