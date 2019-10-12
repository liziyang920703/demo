package com.example.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.TestMapper;
import com.example.model.Test;
import com.example.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lzy
 * @since 2019-10-13
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {

    @Resource//按name
    private TestMapper testMapper;

    @Override
    public List<Test> getall() {
        return testMapper.getperson();
    }
}
