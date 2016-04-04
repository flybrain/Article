package net.baisoft.bigframe.dao;

import java.util.List;

import net.baisoft.bigframe.model.Article;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);
    
    /**
     * 查询所有的记录
     * @return
     */
    List<Article> getAll();
}