/**
 * Copyright (c) SLIIT. All Rights Reserved.
 */
package lab.process.code;

/**
 * @author Chathura R De Silva
 *
 */
public class Calculator {

	/**
	 * Adds two values
	 * 
	 * @param value1
	 * @param value2
	 * @return
	 */
	public int add(int value1, int value2) {
		return value1 + value2;
	}

	/**
	 * Subtracts second value from the first
	 * 
	 * @param value1
	 * @param value2
	 * @return
	 */
	public int substract(int value1, int value2) {
		return value1 - value2;
	}

	/**
	 * Multiply two values
	 * 
	 * @param value1
	 * @param value2
	 * @return
	 */
	public int multiply(int value1, int value2) {
		return value1 * value2;
	}

	/**
	 * Divide first value from the second
	 * 
	 * @param value1
	 * @param value2
	 * @return
	 */
	public int devide(int value1, int value2) {
		return value1 / value2;
	}

	/**
	 * Power function
	 * 
	 * @param value1
	 *            Base Value
	 * @param value2
	 *            Exponent
	 * @return
	 */
	public double power(int value1, int value2) {
		return Math.pow(value1, value2);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
