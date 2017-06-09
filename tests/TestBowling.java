import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	Frame frame;
	BowlingGame bg;
	
	
	@Test
	public void testFrameConstr() throws BowlingException{
		frame= new Frame(2,2);
		assertNotNull(frame);
	}
	
	@Test
	public void testSimpleScore() throws BowlingException{
		frame = new Frame(2,2);
		assertEquals(4,frame.score());
	}
	
	@Test(expected=BowlingException.class)
	public void testWhenThrowsAreMoreThen10() throws BowlingException{
		frame = new Frame(4,8);
	}
	
	@Test(expected=BowlingException.class)
	public void testWhenFirstisMoreThen10() throws BowlingException{
		frame = new Frame(12,0);
	}
	
	@Test
	public void testIfFrameIsSpare() throws BowlingException{
		frame = new Frame(5,5);
		assertTrue(frame.isSpare());
	}
	
	@Test
	public void testIfFrameIsStrike() throws BowlingException{
		frame = new Frame(10,0);
		assertTrue(frame.isStrike());
	}
	
	
	@Test
	public void testBowlingGameConstr(){
		
	}
	
}
