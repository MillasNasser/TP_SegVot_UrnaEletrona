/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceções;

/**
 *
 * @author millas
 */
public class VotoInseridoException extends Exception {

	/**
	 * Creates a new instance of <code>VotoInseridoException</code> without
	 * detail message.
	 */
	public VotoInseridoException() {
	}

	/**
	 * Constructs an instance of <code>VotoInseridoException</code> with the
	 * specified detail message.
	 *
	 * @param msg the detail message.
	 */
	public VotoInseridoException(String msg) {
		super(msg);
	}
}
