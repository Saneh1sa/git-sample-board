package com.example;

public class Car {

	private int speed = 100;

	/**
	 * 現在のスピードを確認する.
	 *
	 * @return 現在のスピード
	 */
	public int checkSpeed() {
		return this.speed;
	}

	/**
	 * スピード加速.
	 * 
	 * @return スピードを25足す
	 */
	public int addSpeed() {
		return speed += 25;
	}
}
