package com.moov.Moov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.moov.Moov.Scheduler.ThreadScheduler;

@SpringBootApplication
@EnableAsync
public class MoovApplication {

	public static void main(String[] args) {

		SpringApplication.run(MoovApplication.class, args);
		ThreadScheduler scheduler = new ThreadScheduler();
		scheduler.start();
	}

}
