package com.white.learn.repository;

import com.white.learn.model.UserInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserInfoRepository {
    Page<UserInfo> findAll(Pageable pageable);
    Optional<UserInfo> findById(String id);
    UserInfo findByUserNameOrEmail(String userName, String email);
    UserInfo findByUserName(String userName);
    UserInfo findByEmail(String email);
    void deleteById(String id);
}
