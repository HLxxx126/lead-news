package com.heima.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.wemedia.dtos.WmMaterialDto;
import com.heima.model.wemedia.pojos.WmMaterial;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

public interface WmMaterialService extends IService<WmMaterial> {
    /**
     * 画像をアップロードする
     * @param multipartFile
     * @return
     */

    public ResponseResult uploadPicture(MultipartFile multipartFile);

    /**
     *素材リストの検索
     * @param dto
     * @return
     */
    public ResponseResult findList(WmMaterialDto dto);
}