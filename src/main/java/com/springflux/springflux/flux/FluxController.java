package com.springflux.springflux.flux;

import com.springflux.springflux.bean.User;
import com.springflux.springflux.respoitry.UserDao;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.jws.soap.SOAPBinding;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class FluxController {



    @Bean
    public RouterFunction<ServerResponse> find(UserDao userDao) throws SQLException {

        //String userName=serverRequest.queryParam("name").orElse(" ");
        User user=userDao.insertUser("'name");
        Mono<User> user1=Mono.just(user);
        Map<String,User> userMap = new HashMap<>();
        Collection<User> users=userMap.values();
        Flux<User> userFlux=Flux.fromIterable(users);
        //serverRequest.bodyToMono(User.class).subscribe(user1 -> BeanUtils.copyProperties(user1, user));

       return RouterFunctions.route(RequestPredicates.path("/user"),
                request->ServerResponse.ok().body(user1, User.class));

        //return  ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(user1, User.class);
    }
}
