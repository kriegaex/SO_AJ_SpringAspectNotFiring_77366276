package com.example.bankapp;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BankAppApplicationTests {

	// initial unrelated test
	@Test
	public void testOne(){
		assertThat(42).isEqualTo(42);
	}


	@Test
	void contextLoads() {
	}

}



