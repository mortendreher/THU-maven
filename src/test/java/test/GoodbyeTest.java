package test;

import org.junit.Test;

import maven.Goodbye;

public class GoodbyeTest {

	@Test
	public void test() {
		Goodbye goodbye = new Goodbye();
		assert(goodbye.isAlive());

	}
}
