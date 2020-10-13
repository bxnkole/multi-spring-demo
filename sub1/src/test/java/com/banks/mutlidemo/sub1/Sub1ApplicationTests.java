package com.banks.mutlidemo.sub1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class Sub1ApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void c1() throws Exception {
		mockMvc.perform(get("/c1"))
						.andExpect(status().isOk())
						.andExpect(content().string("c1"));
	}
	@Test
	void c2() throws Exception {
		mockMvc.perform(get("/c2"))
						.andExpect(status().isOk())
						.andExpect(content().string("c2"));
	}

}
