package com.swt.cs;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


//
// RestControllerTest verifies following web services:
//		"GET /reportStatus"
//
@ExtendWith(SpringExtension.class)
@WebMvcTest
public class CsControllerTest {
	
	   @Autowired
	   MockMvc mockMvc; 

	   @MockBean
	   private CsService csService;
	   
		@MockBean
	    private CsRepository beaRepository;

		// TEST CASE: fetch the report of the device report via CsService call 
		//		"GET /reportStatus, where CsService is behavior mocked!
	    @Test
	    void getReportStatus() throws Exception {
	    	
	    	List<DeviceReportData> dataList = new ArrayList<DeviceReportData>();
	    	dataList.add(new DeviceReportData(1,"SmartHome_CS","CS","Siemens"));
	    	//
	    	// (1) define mocked behavior "beaService.findAll()" : service call "get a list of entities"
	        when(csService.findAll()).thenReturn(dataList);
	   

		   	//
	        // (2) call the Controller's endpoint "GET /reportStatus"
	        mockMvc.perform(MockMvcRequestBuilders.get("/reportStatus")
	                .contentType(MediaType.APPLICATION_JSON)
	        ).andExpect(jsonPath("$", hasSize(1))).andDo(print());
	    }

}
