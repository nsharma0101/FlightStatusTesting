package com.delta.flightstatus.DeltaFlightStatus;

import java.io.FileNotFoundException;

import com.relevantcodes.extentreports.ExtentTest;

public class ExecuteKeyWords {
	
	public static void executeFlightStatus(){
	
	ExtentTest test = null; 
	CreateKeyWords app = null;
	try {
		app = new CreateKeyWords(test);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	app.openBrowser("browser");
	
	
	
	}
	
		
		
		
	 
     /*   flightStatus.goToURL("url");
        flightStatus.clickFunction("navFlightStatus_id");
        flightStatus.clearFunction("FLIFO_flightNumber_id");
        flightStatus.sendKeysFunction("FLIFO_flightNumber_id", "flightNumber");
        flightStatus.clickFunction("FLIFO_go_id");  */
  
		
	
	
}
