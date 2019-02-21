/**
 * 
 */
package xperimental;



import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.jupiter.api.Test;

/**
 * @author Nick
 *
 */
class XperiMentaLrunnerTest {

	Location loc = new Location("Newark", "New Jersey");
	Seller seller = new Seller("Bobby McFerrin");
	Plane plane = new Plane(101, 1968, "Boeing", "747", "red", "it's a big plane", "74,999", seller, loc);
	
	@Test
	void test() {
		//assertThat(objectUnderTest, is(not(someOtherObject)));
		assertThat(loc, is(not(seller)));
		assertThat(loc, is(not(plane)));
	}
	
	@Test
	void testSeller() {
		System.out.println(seller.getName());
		assertEquals(seller.getName(), "Bobby McFerrin");
	}
	@Test
	void testLocation() {
		assertEquals(loc.getCity(), "Newark");
		assertEquals(loc.getState(), "New Jersey");
		
		
		assertTrue(loc.getCity().equals("Newark"));
		assertFalse(loc.getCity().equals("Boston"));
	}
	@Test
	void testPlane() {
		assertTrue(plane.getColor().equals("red"));
		assertTrue(plane.getDescription().equals("it's a big plane"));
		assertTrue(plane.getId() == 101);
		assertTrue(plane.getLocation().equals(loc));
		assertTrue(plane.getMake().equals("Boeing"));
		assertTrue(plane.getModel().equals("747"));
		assertTrue(plane.getPrice().equals("74,999"));
		assertTrue(plane.getSeller().equals(seller));
		assertTrue(plane.getYear() == 1968);
	}

}
