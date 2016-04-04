package net.baisoft.bigframe.service;

import java.util.List;

import net.baisoft.bigframe.model.Article;

/**
 * 文章管理
 * @author 赵占涛 369880281@qq.com
 *
 */
public interface ArticleService {

	/**
	 * 添加文章 
	 * @param article 文章 
	 */
	public void add(Article article);
	
	/**
	 * 删除文章
	 * @param id 文章编号
	 */
	public void delete(int id);
	
	/**
	 * 修改
	 * @param article 修改的文章 
	 */
	public void update(Article article);
	
	/**
	 * 得到一往篇文章 
	 * @param id
	 * @return
	 */
	public Article getById(int id);
	
	/**
	 * 得到所有的文章
	 * @return
	 */
	public List<Article> getAll();
}
