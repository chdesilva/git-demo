/**
 * Copyright (c) SLIIT. All Rights Reserved.
 */
package lab.process.code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Chathura R De Silva
 *
 */
class CalcuatorTest {

	private Calculator calculator = null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		this.calculator = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		int value1 = 5;
		int value2 = 3;
		int answer;

		answer = calculator.add(value1, value2);

		assertEquals(answer, 8);
	}

	@Test
	void testSubtract() {
		int value1 = 5;
		int value2 = 3;
		int answer;

		answer = calculator.substract(value1, value2);

		assertEquals(answer, 2);
	}

	@Test
	void testMultiply() {
		int value1 = 5;
		int value2 = 3;
		int answer;

		answer = calculator.multiply(value1, value2);

		assertEquals(answer, 15);
	}

	@Test
	void testDidide() {
		int value1 = 5;
		int value2 = 3;
		int answer;

		answer = calculator.devide(value1, value2);

		assertEquals(answer, 1);
	}

	@Test
	void testDivideZero() {
		int value1 = 5;
		int value2 = 0;
		int answer;

		try {
			answer = calculator.devide(value1, value2);
			assertNotNull(answer);
		} catch (Exception e) {
			assertTrue(e instanceof ArithmeticException);
		}

	}

	@Test
	void testPower() {
		int value1 = 5;
		int value2 = 3;
		double answer;

		answer = calculator.power(value1, value2);

		assertEquals(answer, 125);

	}

}
