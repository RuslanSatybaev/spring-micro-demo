//package ru.javabegin.micro.planner.users.mq.legacy;
//
//import org.springframework.cloud.stream.annotation.Output;
//import org.springframework.messaging.MessageChannel;
//
//// интерфейс, который нужен для работы mq
//// здесь создаем нужные нам каналы message broker
//public interface TodoBinding {
//
//    String OUTPUT_CHANNEL = "todoOutputChannel";
//
//    // создает канал для отправки сообщений
//    @Output(OUTPUT_CHANNEL)
//    MessageChannel todoOutputChannel();
//}
