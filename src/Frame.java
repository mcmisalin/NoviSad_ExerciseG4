public class Frame {
	private int firstThrow;
	private int secondThrow;
	private int frameScore;
	
	public Frame(int firstThrow, int secondThrow) throws BowlingException{
		if(firstThrow+secondThrow>10 || firstThrow>10 || secondThrow>10)
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
		//to be implemented
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		return false;
	}
}
