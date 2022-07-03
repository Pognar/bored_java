package com.calitzgames.bored.krang;
import com.calitzgames.bored.krang.dts.Information;
import java.lang.*;

public class Krang {

	public String printLin(String input) {
		System.out.println(input);
		return input;
	}

	public Information setInformation(String header, int value) {
		return new Information(header, value);
	}

	public void displayInformation(Information informationObj) {
		System.out.println("Information header : " + informationObj.getHeader());
		System.out.println("Information value : " + informationObj.getValue());
	}

}
