package com.puzzley.dingtalk.robot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @Author yhj
 * @Date 2021/4/16
 **/
@Data
@ConfigurationProperties(prefix = RobotConfig.PREFIX)
public class RobotConfig {
    public static final String PREFIX = "daoism.robot";

    /**
     * 是否发送机器人消息，默认true发送
     */
    private Boolean pushFlag = false;

    /**
     * 机器人WebHook地址，默认钉钉异常通知群WebHook
     */
    private String webhook = "https://oapi.dingtalk.com/robot/send?access_token=737a1ea7f7e4b5d90e2280e8232c0c2cd09aff8f00e281d8d8ad87b55708549d";

    /**
     * 通知人手机号列表
     */
    private List<String> atMobiles;

    /**
     * 配置属于哪个环境的消息
     */
    private String env;

}
