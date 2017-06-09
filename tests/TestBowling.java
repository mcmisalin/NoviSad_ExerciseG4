import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	Frame frame;
	@Test
	public void testFrameContrs() {
		frame= new Frame(2,2);
		assertNotNull(frame);
	}
	
	@Test
	public void testSimpleScore(){
		frame = new Frame(2,2);
		assertEquals(4,frame.score());
	}

}
