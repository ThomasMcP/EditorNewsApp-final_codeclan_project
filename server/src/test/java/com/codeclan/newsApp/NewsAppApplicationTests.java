package com.codeclan.newsApp;

import com.codeclan.newsApp.models.Article;
import com.codeclan.newsApp.models.Journalist;
import com.codeclan.newsApp.repositories.ArticleRepository.ArticleRepository;
import com.codeclan.newsApp.repositories.JournalistRepository.JournalistRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.GregorianCalendar;

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


	Journalist journalist;

	@Before
	public void setUp() {
		journalist = new Journalist();
		journalistRepository.save(journalist);
        GregorianCalendar date1 = new GregorianCalendar(2018, 10, 03);
		Article article1 = new Article("Tendril Nostrils",
				"The investigation into the Bog Monster",
				"http:bbc.co.uk/feed/", "http:src.image_placeholder", date1,"description", journalist );
		articleRepository.save(article1);
	}



}
