package com.lewis.tiger.security.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.lewis.tiger.security.dao.IUserDao;
import com.lewis.tiger.security.domain.SysUser;
import com.lewis.tiger.security.exception.SecurityServiceException;
import com.lewis.tiger.security.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao userDaoImpl;

	@Override
	public void insert(SysUser user) throws SecurityServiceException {
		this.userDaoImpl.insert(user);
	}

	@Override
	public void update(SysUser user) throws SecurityServiceException {
		this.userDaoImpl.update(user);
	}

	@Override
	public SysUser findUser(String userName, String md5Password) throws SecurityServiceException {
		if (StringUtils.isEmpty(userName)) {
			return null;
		}

		SysUser user = this.userDaoImpl.findUser(userName);
		if (null == user) {
			return null;
		}
		if (!user.getPassword().equals(md5Password)) {
			return null;
		}
		return user;
	}

	@Override
	public void delUsers(String ids) throws SecurityServiceException {
		for (String id : ids.split(",")) {
			this.userDaoImpl.delete(Long.valueOf(id));
		}
	}

	@Override
	public List<SysUser> findAll() throws SecurityServiceException {
		return this.userDaoImpl.findAll();
	}
}
