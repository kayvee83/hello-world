package com.kayvee.helloworld.controller;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.RuntimeMXBean;
import java.util.StringJoiner;

import javax.management.MBeanServer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
	
	
	@RequestMapping("/greeting")
	@ResponseBody
	public String greeting(String name) {
		
		return "Hello "+name;
		
	}

	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello User";
	}
	
	@RequestMapping("/stats")
	@ResponseBody
	public String stats(){		RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
		
		StringJoiner joiner = new StringJoiner("Statistics \n");
		joiner.add("VM name ").add(runtimeBean.getVmName()).add(" \n");
		joiner.add("VM vendor ").add(runtimeBean.getVmVendor()).add(" \n");;
		joiner.add("VM version ").add(runtimeBean.getVmVersion()).add(" \n");
		joiner.add("Start time of VM ").add(String.valueOf(runtimeBean.getStartTime())).add(" \n");;
		joiner.add("Uptime of VM ").add(String.valueOf(runtimeBean.getUptime())).add(" \n");;
		
		return joiner.toString();
		
	}
	


}
