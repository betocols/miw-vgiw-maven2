package maven2.assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	private User u;

	@Before
	public void before() {
		u = new User(555555555, "Alberto", "Cols");
	}
	
	@Test
	public void testUserIntStrStr() {
		assertEquals(555555555, u.getNumber());
		assertEquals("Alberto", u.getName());
		assertEquals("Cols", u.getFamilyName());
	}

	@Test
	public void testFullName() {
		assertEquals("Alberto Cols", u.fullName());
	}

	@Test
	public void testInitials() {
		assertEquals("A.C.", u.initials());
	}
}
