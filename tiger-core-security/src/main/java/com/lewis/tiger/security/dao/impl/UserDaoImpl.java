package com.lewis.tiger.security.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.lewis.tiger.common.dao.impl.BaseDao;
import com.lewis.tiger.security.dao.IUserDao;
import com.lewis.tiger.security.domain.SysUser;

@Repository
public class UserDaoImpl extends BaseDao<SysUser> implements IUserDao {
	@SuppressWarnings("unchecked")
	@Override
	public SysUser findUser(String userName) {
		Criteria criteria = this.getSession().createCriteria(SysUser.class);
		criteria.add(Restrictions.eq("userName", userName));

		List<SysUser> list = criteria.list();
		if (null == list || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
}
