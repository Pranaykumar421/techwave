package com.example.consumer.rabbitmq.ConsumerRabbitmq.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.consumer.rabbitmq.ConsumerRabbitmq.model.Message;

@Component
public class Consumer 
{
	@RabbitListener(queues="queue.AA")
	private void receive(Message message)
	{
		System.out.println("Message recived from queue A"+message);
	}
	@RabbitListener(queues="queue.BB")
	private void receive1(Message message)
	{
		System.out.println("Message recived from queue b"+message);
	}
}
