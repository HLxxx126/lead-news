package com.heima.article.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.article.dtos.ArticleDto;
import com.heima.model.article.dtos.ArticleHomeDto;
import com.heima.model.article.pojos.ApArticle;
import com.heima.model.common.dtos.ResponseResult;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author HLxxx
 * @version 1.0
 */
public interface ApArticleService extends IService<ApArticle> {
    /**
     * 文章リストを読み込む
     * @param dto
     * @param type  1 もっと読み込む  2 最新のニュースを読み込む
     * @return
     */
    public ResponseResult load(ArticleHomeDto dto,Short type);

    /**
     *アプリ関連文章を保存します
     * @param dto
     * @return
     */
    public ResponseResult saveArticle(ArticleDto dto);
}
