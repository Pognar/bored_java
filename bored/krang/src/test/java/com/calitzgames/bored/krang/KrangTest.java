package com.calitzgames.bored.krang;
import com.calitzgames.bored.krang.dts.Information;
import org.junit.Assert;
import org.junit.Test;

public class KrangTest {

	private final Krang mKrang = new Krang();

	@Test
	public void printLinTest() {
		String testStr = "This is a test string";
		String returnedStr = mKrang.printLin(testStr);

		Assert.assertEquals(testStr, returnedStr);
	}

	@Test
	public void setInformationTest(){
		Information information = new Information("Test obj string value", 100);
		mKrang.displayInformation(information);
		Assert.assertEquals(information.getHeader(),"Test obj string value");
		Assert.assertEquals(information.getValue(), 100);

	}

}
