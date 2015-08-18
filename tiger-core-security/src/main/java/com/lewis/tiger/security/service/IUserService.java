package com.lewis.tiger.security.service;

import java.util.List;

import com.lewis.tiger.security.domain.SysUser;
import com.lewis.tiger.security.exception.SecurityServiceException;

public interface IUserService {
	/**
	 * 新增对象
	 * 
	 * @param user
	 * @throws SecurityServiceException
	 */
	public void insert(SysUser user) throws SecurityServiceException;

	/**
	 * 修改对象
	 * 
	 * @param user
	 * @throws SecurityServiceException
	 */
	public void update(SysUser user) throws SecurityServiceException;

	/**
	 * 根据USERNAME和PASSWORD查找用户
	 * 
	 * @param userName
	 * @param md5Password
	 * @return
	 * @throws SecurityServiceException
	 */
	public SysUser findUser(String userName, String md5Password) throws SecurityServiceException;

	/**
	 * 根据主键删除对象，物理删除
	 * 
	 * @param ids
	 *            多个主键用,隔开
	 * @throws SecurityServiceException
	 */
	public void delUsers(String ids) throws SecurityServiceException;

	/**
	 * 查询全部
	 * 
	 * @return
	 * @throws SecurityServiceException
	 */
	public List<SysUser> findAll() throws SecurityServiceException;
}
