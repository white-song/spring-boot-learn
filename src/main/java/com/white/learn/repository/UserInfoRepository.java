package com.white.learn.repository;

import com.white.learn.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserInfoRepository extends JpaSpecificationExecutor<UserInfo>, JpaRepository<UserInfo, Long> {
    UserInfo findByName(String name);
    UserInfo findByEmail(String email);

    @Query("select u.id, u.name, u.email from UserInfo u where u.name=?1")
    List<UserInfo> findUserInfoByName(String name);
}
