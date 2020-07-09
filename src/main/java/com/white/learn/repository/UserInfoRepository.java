package com.white.learn.repository;

import com.white.learn.model.UserInfo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserInfoRepository extends JpaSpecificationExecutor<UserInfo>, JpaRepository<UserInfo, Long> {

    @Query("select u from UserInfo u")
    Page<UserInfo> findList(Pageable pageable);

    UserInfo findById(long id);
    UserInfo findByUserName(String username);
    void deleteById(Long id);

}
