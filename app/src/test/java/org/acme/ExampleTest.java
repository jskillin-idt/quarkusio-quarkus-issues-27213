package org.acme;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.quarkus.test.junit.QuarkusTest;
import org.acme.util.SaySomething;
import org.acme.util.SaySomethingTesty;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class ExampleTest {

	@Test
	public void test() throws Exception {
    assertTrue(true);
	}

	@AfterAll
	static void afterAll() throws Exception {
		finishUpBySayingSomething(new SaySomethingTesty());
	}

	private static void finishUpBySayingSomething(SaySomething saySomething) {
		System.out.println(saySomething.nice());
	}

}