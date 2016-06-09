package smart.simpleDB;

import org.junit.Test;

public class Test1{

	@Test
	public void testUserHome(){
		String homedir = System.getProperty("user.home");
		System.out.println(homedir);
	}
}
