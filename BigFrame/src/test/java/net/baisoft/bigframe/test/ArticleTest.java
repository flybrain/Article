package net.baisoft.bigframe.test;

import java.util.Date;
import java.util.List;

import net.baisoft.bigframe.model.Article;
import net.baisoft.bigframe.service.ArticleService;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.gson.Gson;

/**
 * 文章测试类
 * @author 赵占涛 369880281@qq.com
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={ "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class ArticleTest {

	private static final Logger logger = Logger.getLogger(ArticleTest.class);
	
	private ArticleService articleService;
	@Autowired
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	@Test
	public void addTest() {
		Article article = new Article();
		article.setTitle("hello中了个文");
		article.setContent("hello world!中了个中了个文");
		article.setCreatetime(new Date());
		articleService.add(article);
	}
	@Test
	public void getAllTest() {
		List<Article> articles = articleService.getAll();
		logger.debug(new Gson().toJson(articles));
	}
}
