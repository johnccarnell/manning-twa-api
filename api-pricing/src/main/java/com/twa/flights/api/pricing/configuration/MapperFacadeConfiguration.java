package com.twa.flights.api.pricing.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

@Configuration
public class MapperFacadeConfiguration {

    private MapperFactory mapperFactory;

    @Bean
    public MapperFacade mapperFacade() {
        mapperFactory = new DefaultMapperFactory.Builder().build();

        return mapperFactory.getMapperFacade();
    }
}
