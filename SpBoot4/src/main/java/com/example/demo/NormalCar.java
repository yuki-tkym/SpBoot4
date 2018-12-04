package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class NormalCar implements Car{
	private String velocity;
	private String distance;
	
	public void setVelocity(String velocity) {
		this.velocity = velocity;
	}
	
	public void setDistance(String distance) {
		this.distance = distance;
	}
	
	public void run() {
		System.out.println("走行速度は"+ velocity + "です。");
	}
	
	public void stop() {
		System.out.println("走行距離は"+ distance + "です。");
	}
}
