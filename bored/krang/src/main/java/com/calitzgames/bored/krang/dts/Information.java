package com.calitzgames.bored.krang.dts;

public class Information {
	private final String header;
	private final int value;

	public Information(String nameObj, int valueObj) {
		this.header = nameObj;
		this.value = valueObj;
	}

	public String getHeader() {
		return this.header;
	}

	public int getValue() {
		return this.value;
	}
}
