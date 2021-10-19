package com.puzzley.dingtalk.robot.client;

import com.puzzley.dingtalk.robot.core.DingTalkRobot;
import com.puzzley.dingtalk.robot.core.Robot;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author yhj
 * @Date 2021/4/16
 **/
@Slf4j
public class RobotClient {
    public static boolean sendMsg(String content) {
        //后续可以根据配置来选择使用哪个机器人实现类
        Robot robot = new DingTalkRobot();
        try {
            robot.sendMsg(content);
        } catch (Exception e) {
            log.error("发送钉钉机器人消息失败", e);
            return false;
        }
        return true;
    }
}
