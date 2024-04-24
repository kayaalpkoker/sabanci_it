package com.swt.cs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class CsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsApplication.class, args);
	}
	@Bean
	public CommandLineRunner setup(CsRepository aRepository) {
		int DEVICE_ID = 99;
		DeviceReportData in = new DeviceReportData(DEVICE_ID,"SmartHome_CS","CS","SIEMENS-CS");
		in.setDeviceId(DEVICE_ID); // 
		return (args) -> {
			aRepository.save(in); 
		};
	}
	// ref.: https://www.youtube.com/watch?v=gduKpLW_vdY , https://www.youtube.com/watch?v=8s9I1G4tXhA
	@Bean 
	public Docket swaggerConfiguration() {

		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*")) // get rid of basic-error-controller
//				.apis(RequestHandlerSelectors.basePackage("io.javabrains"))
				.build(); 
	} 
}
