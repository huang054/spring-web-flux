package com.springflux.springflux.flux;

import com.springflux.springflux.bean.User;
import com.springflux.springflux.respoitry.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.sql.SQLException;

@Component
public class Handder {

    @Autowired
    private UserDao bannerService;

    public Mono<ServerResponse> getList(ServerRequest request) {
        //获取请求参数
        String page = request.queryParam("name").orElse("1");
       // String size = request.queryParam("rows").orElse("5");
        User user = null;
        try {
            user = bannerService.insertUser(page);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ServerResponse.ok().body(BodyInserters.fromObject(user));
    }



}