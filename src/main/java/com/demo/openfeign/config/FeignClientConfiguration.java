package com.demo.openfeign.config;

import feign.okhttp.OkHttpClient;
import org.springframework.cloud.commons.httpclient.OkHttpClientFactory;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfiguration {

    @Bean
    public OkHttpClient client() {
        return new OkHttpClient();
    }
}
