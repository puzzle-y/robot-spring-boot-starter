package com.puzzley.dingtalk.robot;

import com.puzzley.dingtalk.robot.config.RobotConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author yhj
 * @Date 2021/4/16
 **/
@Configuration
@ConditionalOnProperty(prefix = RobotConfig.PREFIX, name = "enable", havingValue = "true", matchIfMissing = true)
@EnableConfigurationProperties(RobotConfig.class)
public class RobotAutoConfiguration {

}
