//package ru.javabegin.micro.planner.todo.mq;
//
//import lombok.AllArgsConstructor;
//import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.cloud.stream.annotation.StreamListener;
//import org.springframework.stereotype.Component;
//import ru.javabegin.micro.planner.todo.service.TestDataService;
//
//@AllArgsConstructor
//@EnableBinding(TodoBinding.class)
//@Component
//public class MessageConsumer {
//
//    private TestDataService testDataService;
//
//    @StreamListener(target = TodoBinding.INPUT_CHANNEL)
//    public void initTestData(Long userId) {
//        testDataService.initTestData(userId);
//    }
//}
