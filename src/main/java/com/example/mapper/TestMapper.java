package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lzy
 * @since 2019-10-13
 */
@Mapper
public interface TestMapper extends BaseMapper<Test> {
    List<Test> getperson();

}
