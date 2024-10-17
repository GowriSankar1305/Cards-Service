package com.mybank.cards.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mobile")
public class ExternalConfig {

	private String company;
	private String model;
	private String storage;
	private Double price;
}
