package com.example.service;

import com.example.model.Test;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lzy
 * @since 2019-10-13
 */
public interface TestService extends IService<Test> {

    List<Test> getall();
}
