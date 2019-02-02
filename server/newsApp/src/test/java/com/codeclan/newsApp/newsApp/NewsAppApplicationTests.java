package com.codeclan.newsApp.newsApp;

import com.codeclan.newsApp.newsApp.models.Journalist;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsAppApplicationTests {


	@Test
	public void contextLoads() {
	}

	@Test
	public void journalistHasName(){
		Journalist journalist = new Journalist("Peter Parker");
		assertEquals("Peter Parker", journalist.getName());
	}

}

