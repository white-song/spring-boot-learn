package com.white.learn.sql;

import com.white.learn.model.User;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

public class UserSql {

	public String getCount(User user) {
		return new SQL(){{
			SELECT("count(1)");
			FROM("users");
			if (!StringUtils.isEmpty(user.getName())) {
				WHERE("name = #{name}");
			}
		}}.toString();
	}

}
