package com.pragmatists.cdc;

import com.pragmatists.cdc.infrastructure.RestSupport;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Configuration
@Import(RestSupport.class)
@EnableAutoConfiguration
@ComponentScan
@Profile("cdc")
public class BooksEndpointConfigurationCdc {
}
