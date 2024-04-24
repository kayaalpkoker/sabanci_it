package com.swt.cs;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DeviceReportData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
   private int  deviceId;
   private String deviceName; // max 10 characters
   private String deviceType; // "0<= CS <= 100" , "101<= BEA <= 200", "UNKNOWN=1000" max
   private String vendor; // max 10 characters

   private static final String deviceNameDefault = new String("default_01");
   private static final String  UNKNOWN = new String("UNKNOWN");
   private static final String vendorDefault = new String("vendor_001");
   
   public DeviceReportData () {
	   this.deviceId = 0;
	   this.deviceName = deviceNameDefault;
	   this.deviceType = UNKNOWN;
	   this.vendor = vendorDefault;
   }
   public DeviceReportData (int deviceId, String deviceName, String deviceType, String vendor) {
	   
	   this.deviceId = deviceId;
	   this.deviceName = deviceName;
	   this.deviceType = deviceType;
	   this.vendor = vendor;
   }
   public DeviceReportData (String deviceName, String deviceType, String vendor) {
	   
	   this.deviceName = deviceName;
	   this.deviceType = deviceType;
	   this.vendor = vendor;
   }
	public DeviceReportData(DeviceReportData deviceReportData) {
		   this.deviceId = deviceReportData.deviceId;
		   this.deviceName = new String(deviceReportData.deviceName);
		   this.deviceType = new String(deviceReportData.deviceType);
		   this.vendor = new String(deviceReportData.vendor);
	}
	//
   // generated Getters and Setters
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
}
