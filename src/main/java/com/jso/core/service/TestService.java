package com.jso.core.service;

import com.jso.core.api.TestResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/test")
public class TestService {

	@RequestMapping(value = "/{name}", method = GET)
	public TestResponse test(@PathVariable final String name) {
		final TestResponse response = new TestResponse();
		response.setMessage("Hello " + name);
		return response;
	}
}
