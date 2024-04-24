package com.swt.cs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("csRepository")
public interface  CsRepository extends JpaRepository<DeviceReportData, Long> {

}
