package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class CalcController {

	@GetMapping("webcalcs/{op}/{a}/{b}")
	int calculation(@PathVariable String op, @PathVariable int a, @PathVariable int b) {

		if (op.equals("add") ) {
			return a + b;
		}

		if (op.equals("sub")) {
			return a - b;
		}
		if (op.equals("mul")) {
			return a * b;
		}

		if (op.equals("div")) {

			return a / b;
		}

		return 0;
	}

}
