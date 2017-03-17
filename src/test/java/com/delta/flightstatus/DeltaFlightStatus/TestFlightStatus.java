package com.delta.flightstatus.DeltaFlightStatus;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

public class TestFlightStatus {
	
	@Test
	public void testFlightStatus(){
		
		ExecuteKeyWords.executeFlightStatus();
	

	}

}
