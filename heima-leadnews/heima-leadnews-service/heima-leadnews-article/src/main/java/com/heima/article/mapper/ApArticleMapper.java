package com.heima.article.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heima.model.article.dtos.ArticleHomeDto;
import com.heima.model.article.pojos.ApArticle;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * @author HLxxx
 * @version 1.0
 */
@Mapper
public interface ApArticleMapper extends BaseMapper<ApArticle> {
    /**
     * ニュースリストを読み込む
     * @param dto
     * @param type  1 もっと読み込む  2 最新のニュースを読み込む
     * @return
     */
    public List<ApArticle> loadArticleList(ArticleHomeDto dto, Short type);
}
