package com.heima.model.wemedia.dtos;

import com.heima.model.common.dtos.PageRequestDto;
import lombok.Data;

/**
 * @author HLxxx
 * @version 1.0
 */
@Data
public class WmMaterialDto extends PageRequestDto {
    /**
     * 1 お気に入りに追加しました
     * 0 お気に入りに追加しませんでした
     */
    private Short isCollection;
}
