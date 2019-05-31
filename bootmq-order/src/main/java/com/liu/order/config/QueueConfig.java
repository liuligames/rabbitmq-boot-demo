package com.liu.order.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * 队列配置  可以配置多个队列
 *
 * @author liu
 * @date 2018/8/9 15:49
 */
@Configuration
public class QueueConfig {

    /*对列名称*/
    public static final String QUEUE_NAME1 = "first-queue";
    public static final String QUEUE_NAME2 = "second-queue";
    public static final String QUEUE_NAME3 = "third-queue";

    @Bean
    public Queue firstQueue() {
        return new Queue(QUEUE_NAME1, true, false, false);
    }

    @Bean
    public Queue secondQueue() {
        return new Queue(QUEUE_NAME2, true, false, false);
    }

    @Bean
    public Queue thirdQueue() {
        // 配置 自动删除
        Map<String, Object> arguments = new HashMap<>();
        arguments.put("x-message-ttl", 60000);//60秒自动删除
        return new Queue(QUEUE_NAME3, true, false, false);
    }
}
