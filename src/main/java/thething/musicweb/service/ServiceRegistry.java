package thething.musicweb.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ServiceRegistry {
	private Map<String, String> services;
	public ServiceRegistry() {
		services = new HashMap<>();
	}

	public void doStuff() {

	}
}
