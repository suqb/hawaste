package com.gec.hawaste.mapper;

import com.gec.hawaste.entity.Demand;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 客户的需求填写 Mapper 接口
 * </p>
 *
 * @author gec
 * @since 2022-11-22
 */
@Mapper
public interface DemandMapper extends BaseMapper<Demand> {

}
