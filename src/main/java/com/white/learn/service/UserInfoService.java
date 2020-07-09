package com.white.learn.service;

import com.white.learn.model.UserInfo;
import com.white.learn.param.UserInfoParam;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserInfoService {
    @Cacheable()
    public Page<UserInfo> findByCondition(UserInfoParam detailParam, Pageable pageable);
}
