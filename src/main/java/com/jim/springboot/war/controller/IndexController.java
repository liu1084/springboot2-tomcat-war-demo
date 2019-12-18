package com.jim.springboot.war.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project: springboot2-tomcat-war-demo
 * @packageName: com.jim.springboot.war
 * @author: Administrator
 * @date: 2019/12/18 12:41
 * @description：TODO
 */

@RestController
@RequestMapping(value = "/dashboard")
public class IndexController {

	@GetMapping(value = "/")
	public String index() {
		return "Hello";
	}
}
