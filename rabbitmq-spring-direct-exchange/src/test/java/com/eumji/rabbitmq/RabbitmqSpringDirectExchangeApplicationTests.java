package com.eumji.rabbitmq;

import com.eumji.rabbitmq.vo.TutorialSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitmqSpringDirectExchangeApplication.class)
public class RabbitmqSpringDirectExchangeApplicationTests {

	@Autowired
	private TutorialSender sender;
	@Test
	public void contextLoads() {

	}

	@Test
	public void sendMessage(){
		sender.send();
	}

}
