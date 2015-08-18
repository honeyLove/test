package com.lewis.tiger.common.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 * 数据库基本操作的Hibernate封装接口
 * 
 * @author 431520
 *
 * @param <T>
 */
public interface IBaseDao<T> {
	/**
	 * 获取Session
	 * 
	 * @return
	 */
	public Session getSession();

	/**
	 * 创建Criteria对象
	 * 
	 * @return
	 */
	public Criteria createCriteria();

	/**
	 * 新增一个对象
	 * 
	 * @param obj
	 */
	public void insert(T obj);

	/**
	 * 新增多个对象
	 * 
	 * @param list
	 */
	public void insert(List<T> list);

	/**
	 * 修改一个对象
	 * 
	 * @param obj
	 */
	public void update(T obj);

	/**
	 * 修改多个对象
	 * 
	 * @param list
	 */
	public void update(List<T> list);

	/**
	 * 删除一个对象
	 * 
	 * @param obj
	 */
	public void delete(T obj);

	/**
	 * 根据对象ID删除一个对象
	 * 
	 * @param id
	 */
	public void delete(Long id);

	/**
	 * 根据对象ID获取一个对象
	 * 
	 * @param id
	 * @return
	 */
	public T get(Long id);

	/**
	 * 查找全部
	 * 
	 * @return
	 */
	public List<T> findAll();
}
