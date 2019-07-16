package com.springflux.springflux.handler;

import com.springflux.springflux.bean.User;
import com.springflux.springflux.respoitry.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;

public class UserHandler {

  /*  @Autowired
    private UserDao dao;
    public Mono<ServerResponse> listPeople(ServerRequest request) {
        Flux<User> people = Flux<User>
        return ServerResponse.ok().contentType(APPLICATION_JSON).body(people, Person.class);
    }
*/

}
