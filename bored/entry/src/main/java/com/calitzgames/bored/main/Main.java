package com.calitzgames.bored.main;
import com.calitzgames.bored.krang.Krang;
import com.calitzgames.bored.krang.dts.*;

import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Krang krang = new Krang();
		Information information = krang.setInformation("Header information", 123);
		krang.displayInformation(information);
		krang.printInformationObjJson(information);
		krang.writeToJsonInformation(information);

	}
}
