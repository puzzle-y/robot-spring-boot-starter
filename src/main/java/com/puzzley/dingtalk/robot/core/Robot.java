package com.puzzley.dingtalk.robot.core;

/**
 * @author yhj
 */
public interface Robot {
    /**
     * 发送机器人消息
     *
     * @param content 通知类型
     */
    void sendMsg(String content) throws Exception;
}
