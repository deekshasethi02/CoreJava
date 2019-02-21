import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MemberTest {
	@Test
	public void testShowMemberDetail() {
	Member member = new Member();
	member.setFirstName("deeksha");
	member.setLastName("sethi");
	member.setEmail("deeksha.sethi@yash.com");
	member.setPassword("123456");
	member.setRole("trainee");
	assertEquals("Member [firstName=deeksha, lastName=sethi, email=deeksha.sethi@yash.com, role=trainee, password=123456]", member.showMemberDetail());
}
}
