package com.swt.cs;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CsService {


	public List<DeviceReportData> findAll() {
		return csRepository.findAll(); 
	}

	private CsRepository csRepository;
	
	public CsService(CsRepository aRepository) {
		this.csRepository = aRepository;
	}


}
