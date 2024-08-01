package com.pcalouche.springskeleton.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import dev.pcalouche.springforge.autoconfigure.controlleradvice.CommonControllerAdvice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

@Import(CommonControllerAdvice.class)
@WebMvcTest(controllers = TestController.class)
public class TestControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void test_FindById_ThrowsResourceNotFoundException() throws Exception {
		mockMvc.perform(get("/not-found-endpoint")).andExpect(status().isNotFound());
	}

	@Test
	void test_ForbiddenPlace_ThrowsResourceForbiddenException() throws Exception {
		mockMvc.perform(get("/forbidden-endpoint")).andExpect(status().isForbidden());
	}

}
