package com.codeclan.newsApp.newsApp;

import com.codeclan.newsApp.newsApp.models.Article;
import com.codeclan.newsApp.newsApp.models.Journalist;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.codeclan.newsApp.newsApp.repositories.ArticleRepository.ArticleRepository;
import com.codeclan.newsApp.newsApp.repositories.JournalistRepository.JournalistRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsAppApplicationTests {


	@Test
	public void contextLoads() {
	}

	@Autowired
	JournalistRepository journalistRepository;

	@Autowired
	ArticleRepository articleRepository;


	@Test
	public void journalistHasName() {
		Journalist journalist = new Journalist("Peter Parker");
		assertEquals("Peter Parker", journalist.getName());
	}

	@Test
	public void journalistHasArticle() {
		Journalist journalist = new Journalist("Peter Parker");
		GregorianCalendar date = new GregorianCalendar(2019, 02, 02);
		Article article = new Article("Tech Talks", journalist, "Description about it", "www.tech.com", date, "Tech stuff", "image.link");
		journalist.addArticle(article);
		assertEquals(1, journalist.countArticles());
	}

	@Test
	public void articleHasTitle() {
		Journalist journalist = new Journalist("Peter Parker");
		GregorianCalendar date = new GregorianCalendar(2019, 02, 02);
		Article article = new Article("Tech Talks", journalist, "Description about it", "www.tech.com", date, "Tech stuff", "image.link");
		assertEquals("Tech Talks", article.getTitle());
	}

	@Test
	public void articleHasJournalist() {
		Journalist journalist = new Journalist("Peter Parker");
		GregorianCalendar date = new GregorianCalendar(2019, 02, 02);
		Article article = new Article("Tech Talks", journalist, "Description about it", "www.tech.com", date, "Tech stuff", "image.link");
		assertEquals(journalist, article.getJournalist());
	}

	@Test
	public void articleHasDescription(){
		Journalist journalist = new Journalist("Peter Parker");
		GregorianCalendar date = new GregorianCalendar(2019, 02, 02);
		Article article = new Article("Tech Talks", journalist, "Description about it", "www.tech.com", date, "Tech stuff", "image.link");
		assertEquals("Description about it", article.getDescription());

	}

	@Test
	public void articleHasUrl(){
		Journalist journalist = new Journalist("Peter Parker");
		GregorianCalendar date = new GregorianCalendar(2019, 02, 02);
		Article article = new Article("Tech Talks", journalist, "Description about it", "www.tech.com", date, "Tech stuff", "image.link");
		assertEquals("www.tech.com", article.getUrl());
	}

//	@Test
//	public void articleHasDate(){
//		Journalist journalist = new Journalist("Peter Parker");
//		Date date = new Date(2019, 02, 02);
//		Article article = new Article("Tech Talks", journalist, "Description about it", "www.tech.com", date, "Tech stuff", "image.link");
//		assertEquals(date, article.getDate());
//	}

	@Test
	public void articleHasContent(){
		Journalist journalist = new Journalist("Peter Parker");
		GregorianCalendar date = new GregorianCalendar(2019, 02, 02);
		Article article = new Article("Tech Talks", journalist, "Description about it", "www.tech.com", date, "Tech stuff", "image.link");
		assertEquals("Tech stuff", article.getContent());
	}

	@Test
	public void articleHasImageLink(){
		Journalist journalist = new Journalist("Peter Parker");
		GregorianCalendar date = new GregorianCalendar(2019, 02, 02);
		Article article = new Article("Tech Talks", journalist, "Description about it", "www.tech.com", date, "Tech stuff", "image.link");
		assertEquals("image.link", article.getImageLink());
	}

	@Test
	public void canGetJournalistByName(){
		List<Journalist> found = journalistRepository.findJournalistByName("Peter Parker");
		assertEquals("Peter Parker", found.get(0).getName());
	}


	@Test
	public void canGetArticleByTitle(){
		List<Article> found = articleRepository.findArticleByTitle("Tech Talks");
		assertEquals("Tech Talks", found.get(0).getTitle());
	}

	@Test
	public void canGetArticleByJournalistId(){
		List<Article> found = articleRepository.findArticleByJournalistId(2L);
		assertEquals(1, found.size());
	}

	@Test
	public void canFindJournalistById(){
		List<Journalist> found = journalistRepository.findJournalistById(1L);
		assertEquals("Peter Parker", found.get(0).getName());
	}

	@Test
	public void canGetArticleById(){
		List<Article> found = articleRepository.findArticleById(1L);
		assertEquals("Tech Talks", found.get(0).getTitle());
	}






}

