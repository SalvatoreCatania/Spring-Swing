package com.spring.ui;

import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.ui.gui.Gui;

@SpringBootApplication
public class TestSpringSwingApplication extends JFrame {
	
	@Autowired
	Gui gui;
	
	public static void main(String[] args) {
//		SpringApplication.run(TestSpringSwingApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(TestSpringSwingApplication.class, args);
	}

}
