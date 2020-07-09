package com.white.learn.service.impl;

import com.mysql.cj.util.StringUtils;
import com.white.learn.model.UserInfo;
import com.white.learn.param.UserInfoParam;
import com.white.learn.repository.UserInfoRepository;
import com.white.learn.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;


@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoRepository userInfoRepository;

    @Override
    public Page<UserInfo> findByCondition(UserInfoParam detailParam, Pageable pageable) {
        return userInfoRepository.findAll((root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<Predicate>();
            //equal 示例
            if (!StringUtils.isNullOrEmpty(detailParam.getUserId())){
                predicates.add(cb.equal(root.get("id"),detailParam.getUserId()));
            }
            //like 示例
//            if (!StringUtils.isNullOrEmpty(detailParam.getEmail())){
//                predicates.add(cb.like(root.get("email"),"%"+detailParam.getEmail()+"%"));
//            }
            return query.where(predicates.toArray(new Predicate[0])).getRestriction();
        }, pageable);
    }
}
