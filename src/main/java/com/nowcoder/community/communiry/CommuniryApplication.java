package com.nowcoder.community.communiry;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication()
public class CommuniryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommuniryApplication.class, args);
	}

}
