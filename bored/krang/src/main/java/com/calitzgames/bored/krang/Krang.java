package com.calitzgames.bored.krang;
import com.calitzgames.bored.krang.dts.Information;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jdk.nashorn.api.scripting.JSObject;

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

	public void printInformationObjJson(Information informationObj){
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gson.toJson(informationObj));

	}


}
