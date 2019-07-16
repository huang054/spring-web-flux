package com.springflux.springflux.flux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class Flux {

    @Autowired
    private Handder bannerHandler;

    @Bean
    public RouterFunction<ServerResponse> webFluxRoutesRegister(){
        return RouterFunctions
                .route(RequestPredicates.GET("/banner/getList"), bannerHandler::getList);//查询 json响应

    }
}
