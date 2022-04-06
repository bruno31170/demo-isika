package com.formation.demoisika;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.formation.demoisika.service.CalculatorService;

@SpringBootTest
class DemoIsikaApplicationTests {

	@Autowired
	private CalculatorService calculatorService;
	
	@Test
	void addTest() {
		assertEquals(12, calculatorService.add(8, 4));
	}

}
