package net.baisoft.bigframe.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.baisoft.bigframe.model.Article;
import net.baisoft.bigframe.service.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 文章控制器
 * @author 赵占涛 369880281@qq.com
 *
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

	/**
	 * 文章管理 
	 */
	private ArticleService articleService;
	@Autowired
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
	
	/**
	 * 跳转到添加文章，这里基本上是什么都没做，这样是为了以后扩展，比如有了文章分类的话，可以在这里加载分类数据。
	 */
	@RequestMapping("addShow")
	public String addShow() {
		return "articleAdd";
	}
	/**
	 * 添加文章
	 * @param title 标题
	 * @param content 内容
	 */
	@RequestMapping("add")
	public String add(String title, String content) {
		Article article = new Article();
		article.setTitle(title);
		article.setContent(content);
		article.setCreatetime(new Date());
		articleService.add(article);
		return "redirect:list.do";
	}
	
	/**
	 * 显示一篇文章
	 * @param id 文章id
	 * @return 文章 
	 */
	@RequestMapping("/show")
	public String show(int id, HttpServletRequest request) {
		Article article = articleService.getById(id);
		request.setAttribute("article", article);
		return "articleShow";		
	}
	
	/**
	 * 显示一篇文章json格式
	 * @param id 文章id
	 * @return 文章 
	 */
	@RequestMapping("/show/json")
	@ResponseBody
	public Article show(int id) {
		Article article = articleService.getById(id);
		return article;		
	}
	
	/**
	 * 文章列表
	 */
	@RequestMapping("/list")
	public String list(HttpServletRequest request) {
		List<Article> articles = articleService.getAll();
		request.setAttribute("articles", articles);
		return "articleList";
	}
	
	/**
	 * 文章列表
	 */
	@RequestMapping("/list/json")
	@ResponseBody
	public List<Article> list() {
		List<Article> articles = articleService.getAll();
		return articles;
	}
	
	/**
	 * 删除文章
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete")
	public String delete(int id) {
		articleService.delete(id);
		return "redirect:list.do";
	}
	
}
