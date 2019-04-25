package com.session.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.RedisFlushMode;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 
 * SpringSession配置<br>
 * 版权: Copyright (c) 2011-2019<br>
 * 
 * @author: 孙常军<br>
 * @date: 2019年4月25日<br>
 */
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 1800, redisNamespace = "session:examples1", cleanupCron = "0/10 * * * * *", redisFlushMode = RedisFlushMode.ON_SAVE)
public class RedisSessionConfig {

	@Bean
	public LettuceConnectionFactory redisConnectionFactory() {
		return new LettuceConnectionFactory();
	}

}
