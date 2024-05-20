package com.heima.article.service;

import com.heima.model.article.pojos.ApArticle;

/**
 * @author HLxxx
 * @version 1.0
 */
public interface ArticleFreemarkerService {
    /**
     * 生成静态文件上传到minIo中
     * @param apArticle
     * @param content
     */
    public void buildArticleToMinIo(ApArticle apArticle,String content);
}
