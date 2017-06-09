import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	Frame frame;
	@Test
	public void testFrameContrs() {
		frame= new Frame(2,2);
		assertNotNull(frame);
	}

}
