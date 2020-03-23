package gg.lol.mylol.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import gg.lol.mylol.sr.TestClassSR;
import gg.lol.mylol.tft.TestClassTFT;

@Configuration
public class Config {
	
	@Bean
	public TestClassSR testClassSR() {
		return new TestClassSR();
	}
	
	@Bean
	public TestClassTFT testClassTFT() {
		return new TestClassTFT();
	}
}
