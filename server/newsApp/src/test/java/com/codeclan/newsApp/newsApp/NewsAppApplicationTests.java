package com.codeclan.newsApp.newsApp;

import com.codeclan.newsApp.newsApp.models.Article;
import com.codeclan.newsApp.newsApp.repositories.ArticleRepository.ArticleRepository;
import com.codeclan.newsApp.newsApp.repositories.JournalistRepository.JournalistRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsAppApplicationTests {

	@Test
	public void contextLoads() {

	}

	@Autowired
	ArticleRepository articleRepository;

	@Autowired
	JournalistRepository journalistRepository;

//	@Test
//	public void canGetAllArticlesByTitle() {
//		List <Article> found = articleRepository.getArticlesByTitle("Saving my daughter from Instagram self-harm");
//		assertEquals("Saving my daughter from Instagram self-harm", found.get(1).getTitle());
//
//	}
//
//	@Test
//	public void canGetArticlesByCategory(){
//		// TO-DO...
//	}
//	@Test
//	public void canGetJournalistByName(){
//		// TO-DO...
//	}

	}
