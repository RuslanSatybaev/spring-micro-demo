package ru.javabegin.micro.planner.todo.feign;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import ru.javabegin.micro.planner.entity.User;

@Component
public class UserFeignClientFallback implements UserFeignClient {

    // этот метод будет вызываться, если сервис /user/id не будет доступен
    @Override
    public ResponseEntity<User> findUserById(Long id) {
        return null;
    }
}
