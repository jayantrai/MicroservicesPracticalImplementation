package com.example.MicroservicesPracticalImplementation;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;


@Component
@Endpoint(id = "stage") // this is the point we use after acutator as /actuator/stage this can be anything
public class StageEndpoint {
	
	
	//these are the endpoints we have
	
	Map<String, Stage> stages = new ConcurrentHashMap<>();
	
	@ReadOperation
	public Map<String, Stage> getAllStages() {
		return stages;
	}
	
	@ReadOperation
	public Stage getStage(@Selector String name) {
		return stages.get(name);
	}
	
	@WriteOperation
	public void setValue(@Selector String name, int stage) {
		stages.put(name, new Stage(stage));
	}
	
	
	
	static class Stage {
		int value;

		
		public Stage(int value) {
			super();
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
		
		
	}
}
