package com.budomuya.webservice.controller;

import com.budomuya.webservice.model.Hello;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.budomuya.webservice.model.Message;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloWorldRestController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/msg/{player}")
	public Message message(@PathVariable String player) {

		return new Message(player, "Hello " + player);
	}

    @RequestMapping("/hello")
    public Hello hello(@RequestParam(value = "name", required = false) String name) {
        return new Hello(counter.incrementAndGet(),
                String.format(template, name));
    }

}
