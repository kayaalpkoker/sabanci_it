package com.swt.cs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class CsServiceTest {
	
	@MockBean
    private CsRepository csRepository;
	
	@Test
	void getAllReportData(){
	    DeviceReportData aData = new DeviceReportData("SmartHome_CS","CS","TTTech");

    	// (1) define mocked behavior "csRepository.findAll()" : service call "get a list of entities"
	    // 		https://www.infoworld.com/article/3543268/junit-5-tutorial-part-2-unit-testing-spring-mvc-with-junit-5.html
	    doReturn(Arrays.asList(aData)).when(csRepository).findAll();
	    
	    //
	    CsService beaService = new CsService(csRepository);
	    
	    List<DeviceReportData> dataList = beaService.findAll();
	    DeviceReportData lastData = dataList.get(dataList.size()-1);

	    assertEquals(aData.getDeviceId(), lastData.getDeviceId());
	    assertEquals(aData.getDeviceName(), lastData.getDeviceName());
	    assertEquals(aData.getDeviceType(), lastData.getDeviceType());
	    assertEquals(aData.getVendor(), lastData.getVendor());
	}
}