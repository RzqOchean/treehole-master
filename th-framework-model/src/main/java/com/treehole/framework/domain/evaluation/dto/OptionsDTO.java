package com.treehole.framework.domain.evaluation.dto;

import lombok.Data;

import java.util.List;

/**
 * 测试的选项
 *
 * @auther: Yan Hao
 * @date: 2019/10/15
 */
@Data
public class OptionsDTO {
    //    量表id
    private String scaleId;
    //    选项id
    private List<String> optionIds;
}
