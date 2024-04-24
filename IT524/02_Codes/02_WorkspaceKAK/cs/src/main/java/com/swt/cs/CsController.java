package com.swt.cs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class CsController {

    @Autowired
    private CsService csService;

    @GetMapping("/reportStatus")
    ResponseEntity<List<DeviceReportData>> getAllReportData() {
        return new ResponseEntity<>(csService.findAll(), HttpStatus.OK);
    }
}
