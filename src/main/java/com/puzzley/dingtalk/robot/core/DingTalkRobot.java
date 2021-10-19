package com.puzzley.dingtalk.robot.core;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiRobotSendRequest;
import com.dingtalk.api.response.OapiRobotSendResponse;
import com.puzzley.dingtalk.robot.config.RobotConfig;
import com.puzzley.dingtalk.robot.utils.SpringUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author yhj
 * @Date 2021/4/16
 **/
@Slf4j
public class DingTalkRobot implements Robot {

    @Override
    public void sendMsg(String content) throws Exception {
        RobotConfig robotConfig = SpringUtil.getBean(RobotConfig.class);
        if (robotConfig.getPushFlag()) {
            DingTalkClient client = new DefaultDingTalkClient(robotConfig.getWebhook());
            OapiRobotSendRequest request = new OapiRobotSendRequest();
            request.setMsgtype("text");
            //设置发送内容对象
            OapiRobotSendRequest.Text text = new OapiRobotSendRequest.Text();
            if (robotConfig.getEnv() != null && !"".equals(robotConfig.getEnv())) {
                content = robotConfig.getEnv() + "：" + content;
            }
            text.setContent(content);
            request.setText(text);
            //设置@对象
            OapiRobotSendRequest.At at = new OapiRobotSendRequest.At();
            if (robotConfig.getAtMobiles() != null && robotConfig.getAtMobiles().size() > 0) {
                at.setAtMobiles(robotConfig.getAtMobiles());
            }
            at.setIsAtAll(false);
            //at.setAtUserIds(Arrays.asList("109929","32099"));
            request.setAt(at);
            OapiRobotSendResponse response = client.execute(request);
        }
    }
}
