# 钉钉聊天机器人发送消息

## 使用方式

### 注意事项
支持Nacos配置中心动态刷新

### 引入依赖
```xml
<dependency>
  <groupId>com.puzzley.dingtalk</groupId>
  <artifactId>robot-spring-boot-starter</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</dependency>
```

### 配置信息
```yaml
daoism:
  robot:
    push-flag: true
    webhook: https://oapi.dingtalk.com/robot/send?access_token=737a1ea7f7e4b5d90exxxxxxxxxxxxxxxxx81d8d8ad87b55708549d
    at-mobiles:
      - 18767xxxx76
      - 15988xxxx07
    env: 生鲜开发环境
```
push-flag  ：是否开启消息发送，false的时候不发送消息，默认false。

webhook    ：钉钉聊天机器人的WebHook地址，附带上access_token，默认发到钉钉异常通知群。

at-mobiles ：消息@对象，钉钉手机号，列表，可以为空。

env        ：所属环境，会在消息开头带上环境，可以为空。


### 代码调用
```java
RobotClient.sendMsg("订单推送海鼎定时任务执行出错，错误信息：xxxxx");
```

