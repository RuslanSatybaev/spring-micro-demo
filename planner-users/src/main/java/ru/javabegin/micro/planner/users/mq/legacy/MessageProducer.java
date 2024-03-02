//package ru.javabegin.micro.planner.users.mq.legacy;
//
//import lombok.AllArgsConstructor;
//import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.messaging.Message;
//import org.springframework.messaging.support.MessageBuilder;
//import org.springframework.stereotype.Component;
//
//@AllArgsConstructor
//@Component
//@EnableBinding(TodoBinding.class)
//public class MessageProducer {
//    private TodoBinding todoBinding;
//
//    // отправка сообщения при создании нового пользователя
//    public void initUserData(Long userId) {
//
//        // контейнер для добавления данных и headers
//        Message message = MessageBuilder.withPayload(userId).build();
//
//        todoBinding.todoOutputChannel().send(message);
//    }
//}
