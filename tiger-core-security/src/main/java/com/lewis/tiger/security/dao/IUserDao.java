package com.lewis.tiger.security.dao;

import com.lewis.tiger.common.dao.IBaseDao;
import com.lewis.tiger.security.domain.SysUser;

public interface IUserDao extends IBaseDao<SysUser> {
	/**
	 * 根据用户名返回对象
	 *
	 * @param userName
	 * @return
	 */
	public SysUser findUser(String userName);
}
