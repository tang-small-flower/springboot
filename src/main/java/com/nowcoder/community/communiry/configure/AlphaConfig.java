package com.nowcoder.community.communiry.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
public class AlphaConfig {
    @Bean
    public SimpleDateFormat simpledateformat()
    {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
