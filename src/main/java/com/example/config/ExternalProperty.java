package com.example.config;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by NPOST on 2017-04-20.
 */
@Component
@PropertySource(value = "file:C:/properties/application-test.properties", ignoreResourceNotFound = true)     // 테스트서버 환경변수
@PropertySource(value = "file:/properties/application-production.properties", ignoreResourceNotFound = true) // 운영서버 환경변수
public class ExternalProperty {

}
