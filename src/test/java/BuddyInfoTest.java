import static org.junit.Assert.*;

import webAPP.Models.BuddyInfo;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;

public class BuddyInfoTest {
	private BuddyInfo buddy1;

	private String name;
	private String number;
	private String email;
	private String address;
	private EntityManager EM;

	@Before
	public void setUp() throws Exception {
		buddy1 = new BuddyInfo();
		name = "Meet";
		number = "9058078241";
		email = "yeetus@deletus.com";
		address = "my house";
		buddy1.setAll(name, number, email,address);
	}

	@Test
	public void testSettingAndGettingAll() {
		buddy1.setAll(name, number, email,address);

		assertEquals("Name should be Meet", name, buddy1.getName());
		assertEquals("Number should be 9058078241", number, buddy1.getNumber());
		assertEquals("Email should be yeetus@deletus.com", email, buddy1.getEmail());
		assertEquals("Address should be yeetus@deletus.com", address, buddy1.getAddress());
	}

	@Test
	public void testSetAndGetName() {
		buddy1.setName(name);
		assertEquals("Name should be " + name, name, buddy1.getName());
	}
	@Test
	public void testSetAndGetNumber() {
		buddy1.setNumber(number);
		assertEquals("Number should be " + number, number, buddy1.getNumber());
	}
	@Test
	public void testSetAndGetEmail() {
		buddy1.setEmail(email);
		assertEquals("email should be " + email, email, buddy1.getEmail());
	}
}