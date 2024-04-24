package com.swt.fcs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FSM_TC_Suite_1_Test_FordData_Factory_Settings {

	FordCSSettingDataX settings = new FordCSSettingDataX(true);
	

		
		@Test
	    void FCS_TC_1_Test_validateVoltage() {
				assertEquals(settings.validateVoltage(-100),false);
	            assertEquals(settings.validateVoltage(0),false);
	            assertEquals(settings.validateVoltage(207),false);
	            assertEquals(settings.validateVoltage(208),true);
	            assertEquals(settings.validateVoltage(240),true);
	            assertEquals(settings.validateVoltage(241),false);
	    }

	    @Test
	    void FCS_TC_2_Test_validateCurrent() {

	    		assertEquals(settings.validateCurrent((float) -5.0),false);
	            assertEquals(settings.validateCurrent((float) 0.0),true);
	            assertEquals(settings.validateCurrent((float) 29.9),true);
	            assertEquals(settings.validateCurrent((float) 30.0),true);
	            assertEquals(settings.validateCurrent((float) 30.1),false);
	    }

	    @Test
	    void FCS_TC_3_Test_validateTemperature() {

	            assertEquals(settings.validateOTemperature((float) -30.1),false);
	            assertEquals(settings.validateOTemperature((float) -30.0),true);
	            assertEquals(settings.validateOTemperature((float) -29.5),true);
	            assertEquals(settings.validateOTemperature((float) 0.0),true);
	            assertEquals(settings.validateOTemperature((float) 49.5),true);
	            assertEquals(settings.validateOTemperature((float) 50.0),true);
	            assertEquals(settings.validateOTemperature((float) 50.1),false); 
	    }
	   
//	    @Test
//	    void validateDimensionsTest() {
//	    	assertEquals(settings.validateDimensions("12x12x8"),true);
//	    	assertEquals(settings.validateDimensions("12x8x12"),false);
//	    }
//	    
//	    @Test
//	    void validateWeightTest() {
//	    	assertEquals(settings.validateWeight((float)10.0), true);
//	    	assertEquals(settings.validateWeight((float) 9.0), false);
//	    	assertEquals(settings.validateWeight((float) -9.0), false);
//	    }
//		@Test
//		void validateRegulatoryTest() {
//			assertEquals(settings.validateRegulatory("UL cUL CE CTick"), true);
//			assertEquals(settings.validateRegulatory("CTck"), false);
//		}
	
}
