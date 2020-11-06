import org.junit.*;
import org.junit.runners.MethodSorters;
import org.mockito.Mockito;
import java.util.*;
import java.awt.*;
import javax.swing.*;


import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GameOfLifePinningTest {
	/*
	 * READ ME: You may need to write pinning tests for methods from multiple
	 * classes, if you decide to refactor methods from multiple classes.
	 * 
	 * In general, a pinning test doesn't necessarily have to be a unit test; it can
	 * be an end-to-end test that spans multiple classes that you slap on quickly
	 * for the purposes of refactoring. The end-to-end pinning test is gradually
	 * refined into more high quality unit tests. Sometimes this is necessary
	 * because writing unit tests itself requires refactoring to make the code more
	 * testable (e.g. dependency injection), and you need a temporary end-to-end
	 * pinning test to protect the code base meanwhile.
	 * 
	 * For this deliverable, there is no reason you cannot write unit tests for
	 * pinning tests as the dependency injection(s) has already been done for you.
	 * You are required to localize each pinning unit test within the tested class
	 * as we did for Deliverable 2 (meaning it should not exercise any code from
	 * external classes). You will have to use Mockito mock objects to achieve this.
	 * 
	 * Also, you may have to use behavior verification instead of state verification
	 * to test some methods because the state change happens within a mocked
	 * external object. Remember that you can use behavior verification only on
	 * mocked objects (technically, you can use Mockito.verify on real objects too
	 * using something called a Spy, but you wouldn't need to go to that length for
	 * this deliverable).
	 */

	/* TODO: Declare all variables required for the test fixture. */
	MainPanel gol;
	@Before
	public void setUp() {
		/*
		 * TODO: initialize the text fixture. For the initial pattern, use the "blinker"
		 * pattern shown in:
		 * https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life#Examples_of_patterns
		 * The actual pattern GIF is at:
		 * https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life#/media/File:Game_of_life_blinker.gif
		 * Start from the vertical bar on a 5X5 matrix as shown in the GIF.
		 */

		gol = new MainPanel(5);
		String vertical  = ".....\n..X..\n..X..\n..X..\n.....\n";
		ArrayList<String> lines = new ArrayList<String>();
		lines.add(".....");
		lines.add("..X..");
		lines.add("..X..");
		lines.add("..X..");
		lines.add(".....");
		gol.load(lines);

	}

	/* TODO: Write the three pinning unit tests for the three optimized methods */
	@Test
	public void testIterateCell() {
		Cell[][] cells =  gol.getCells();
		// for (int j = 0; j < 5; j++) {
		// 	for (int k = 0; k < 5; k++) {
		// 		System.out.print(cells[j][k].getAlive());
		// 	}
		// 	System.out.println();
		// }
 	// 	System.out.println(cells[2][1].getAlive());
 	// 	System.out.println(cells[2][2].getAlive());
 	// 	System.out.println(cells[1][2].getAlive());

		// System.out.println(gol.getNumNeighbors(0,2));
		// System.out.println(gol.getNumNeighbors(1,2));
		// System.out.println(gol.getNumNeighbors(2,2));
		// System.out.println(gol.getNumNeighbors(3,2));
		// System.out.println(gol.getNumNeighbors(4,2));
		// System.out.println(gol.iterateCell(2,2));
		// System.out.println(gol.iterateCell(1,2));

		//MainPanel gol = Mockito.mock(MainPanel.class);
		// Mockito.when(gol.getNumNeighbors(0,0)).thenReturn(0);
		// Mockito.when(gol.getNumNeighbors(1,0)).thenReturn(0);
		// Mockito.when(gol.getNumNeighbors(2,0)).thenReturn(0);
		// Mockito.when(gol.getNumNeighbors(3,0)).thenReturn(0);
		// Mockito.when(gol.getNumNeighbors(4,0)).thenReturn(0);


		// Mockito.when(gol.getNumNeighbors(0,1)).thenReturn(1);
		// Mockito.when(gol.getNumNeighbors(1,1)).thenReturn(2);
		// Mockito.when(gol.getNumNeighbors(2,1)).thenReturn(3);
		// Mockito.when(gol.getNumNeighbors(3,1)).thenReturn(2);
		// Mockito.when(gol.getNumNeighbors(4,1)).thenReturn(1);

		// Mockito.when(gol.getNumNeighbors(0,2)).thenReturn(1);
		// Mockito.when(gol.getNumNeighbors(1,2)).thenReturn(1);
		// //Mockito.when(gol.getNumNeighbors(2,2)).thenReturn(2);
		// Mockito.when(gol.getNumNeighbors(3,2)).thenReturn(1);
		// Mockito.when(gol.getNumNeighbors(4,2)).thenReturn(1);

		// Mockito.when(gol.getNumNeighbors(0,3)).thenReturn(1);
		// Mockito.when(gol.getNumNeighbors(1,3)).thenReturn(2);
		// Mockito.when(gol.getNumNeighbors(2,3)).thenReturn(3);
		// Mockito.when(gol.getNumNeighbors(3,3)).thenReturn(2);
		// Mockito.when(gol.getNumNeighbors(4,3)).thenReturn(1);

		// Mockito.when(gol.getNumNeighbors(0,4)).thenReturn(0);
		// Mockito.when(gol.getNumNeighbors(1,4)).thenReturn(0);
		// Mockito.when(gol.getNumNeighbors(2,4)).thenReturn(0);
		// Mockito.when(gol.getNumNeighbors(3,4)).thenReturn(0);
		// Mockito.when(gol.getNumNeighbors(4,4)).thenReturn(0);




		assertFalse(gol.iterateCell(0,0));
		assertFalse(gol.iterateCell(1,0));
		assertFalse(gol.iterateCell(2,0));
		assertFalse(gol.iterateCell(3,0));
		assertFalse(gol.iterateCell(4,0));

		assertFalse(gol.iterateCell(0,1));
		assertFalse(gol.iterateCell(1,1));
		assertTrue(gol.iterateCell(2,1));
		assertFalse(gol.iterateCell(3,1));
		assertFalse(gol.iterateCell(4,1));

		assertFalse(gol.iterateCell(0,2));
		assertFalse(gol.iterateCell(1,2));
		assertTrue(gol.iterateCell(2,2));//
		assertFalse(gol.iterateCell(3,2));
		assertFalse(gol.iterateCell(4,2));

		assertFalse(gol.iterateCell(0,3));
		assertFalse(gol.iterateCell(1,3));
		assertTrue(gol.iterateCell(2,3));
		assertFalse(gol.iterateCell(3,3));
		assertFalse(gol.iterateCell(4,3));

		assertFalse(gol.iterateCell(0,4));
		assertFalse(gol.iterateCell(1,4));
		assertFalse(gol.iterateCell(2,4));
		assertFalse(gol.iterateCell(3,4));
		assertFalse(gol.iterateCell(4,4));

	}


	@Test
	public void testToString() {
		
		String test = gol.toString();
		String ans = ".....\n..X..\n..X..\n..X..\n.....\n";
		assertEquals(ans,test);
		

	}

	@Test
	public void testCalculateNextIteration() {
		gol.calculateNextIteration();
		Cell[][] cells =  gol.getCells();
		for (int j = 0; j < 5; j++) {
			for (int k = 0; k < 5; k++) {
				if(j==2&&0<k&&k<4){
					assertTrue(cells[j][k].getAlive());
				}else{
					assertFalse(cells[j][k].getAlive());
				}
			}
		}

	}
}
