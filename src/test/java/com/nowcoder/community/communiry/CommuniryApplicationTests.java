package com.nowcoder.community.communiry;

import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
@ContextConfiguration(classes = CommuniryApplication.class)
class CommuniryApplicationTests implements ApplicationContextAware {

	@Test
	void contextLoads() {
	}
	private ApplicationContext ac;


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ac=applicationContext;
	}

}
