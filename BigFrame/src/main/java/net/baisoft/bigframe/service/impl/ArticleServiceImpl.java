package net.baisoft.bigframe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.baisoft.bigframe.dao.ArticleMapper;
import net.baisoft.bigframe.model.Article;
import net.baisoft.bigframe.service.ArticleService;

/**
 * 文章管理实现类
 * @author 赵占涛 369880281@qq.com
 *
 */
@Service("articleService")
public class ArticleServiceImpl implements ArticleService{

	/**
	 * 文章dao
	 */
	private ArticleMapper articleMapper;
	
	public ArticleMapper getArticleMapper() {
		return articleMapper;
	}

	@Autowired
	public void setArticleMapper(ArticleMapper articleMapper) {
		this.articleMapper = articleMapper;
	}

	@Override
	public void add(Article article) {
		articleMapper.insert(article);
	}

	@Override
	public Article getById(int id) {
		return articleMapper.selectByPrimaryKey(id);
	}

	@Override
	public void delete(int id) {
		articleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(Article article) {
		articleMapper.updateByPrimaryKeySelective(article);
	}

	@Override
	public List<Article> getAll() {
		return articleMapper.getAll();
	}
	
}
