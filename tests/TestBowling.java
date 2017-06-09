import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	Frame frame;
	@Test
	public void testFrameContrs() throws BowlingException{
		frame= new Frame(2,2);
		assertNotNull(frame);
	}
	
	@Test
	public void testSimpleScore() throws BowlingException{
		frame = new Frame(2,2);
		assertEquals(4,frame.score());
	}
	
	@Test(expected=BowlingException.class)
	public void testWhenThrowMoreThen10(){
		frame = new Frame()
	}
}
