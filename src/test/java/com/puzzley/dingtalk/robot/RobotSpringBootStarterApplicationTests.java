package com.puzzley.dingtalk.robot;

import com.puzzley.dingtalk.robot.client.RobotClient;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RobotTestApplication.class)
class RobotSpringBootStarterApplicationTests {

	@Test
	void contextLoads() {
		RobotClient.sendMsg("测试123456推送");
	}

}
