# spring-boot-session-examples
Spring Session简单使用

## 方式一
在*application.yml*中配置

```
spring:
  session:
    store-type: redis
    timeout: 1800
    redis:
      flush-mode: on-save
      namespace: session:examples
      cleanup-cron: 0/10 * * * * *
  redis:
    host: 127.0.0.1
    port: 6379
    password: null
    database: 0
    lettuce:
      pool:
        max-active: 20
        max-wait: -1
        max-idle: 10
        min-idle: 5
    timeout: 30000
```

## 方式二
添加*RedisSessionConfig*配置类

```
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 1800, redisNamespace = "session:examples1", cleanupCron = "0/10 * * * * *", redisFlushMode = RedisFlushMode.ON_SAVE)
public class RedisSessionConfig {

	@Bean
	public LettuceConnectionFactory redisConnectionFactory() {
		return new LettuceConnectionFactory();
	}

}
```