package com.lewis.tiger.common.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.lewis.tiger.common.dao.IBaseDao;

public class BaseDao<T> implements IBaseDao<T> {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	private Class<T> entityClass;

	@SuppressWarnings("unchecked")
	public BaseDao() {
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		entityClass = (Class<T>) type.getActualTypeArguments()[0];
	}

	@Override
	public Criteria createCriteria() {
		return this.getSession().createCriteria(entityClass);
	}

	@Override
	public void insert(T obj) {
		this.getSession().save(obj);
		this.getSession().flush();
	}

	@Override
	public void insert(List<T> list) {
		for (T obj : list) {
			this.insert(obj);
		}
	}

	@Override
	public void update(T obj) {
		this.getSession().update(obj);
		this.getSession().flush();
	}

	@Override
	public void update(List<T> list) {
		for (T obj : list) {
			this.update(obj);
		}
	}

	@Override
	public void delete(T obj) {
		this.getSession().delete(obj);
		this.getSession().flush();
	}

	@Override
	public void delete(Long id) {
		this.delete(this.get(id));
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(Long id) {
		return (T) this.getSession().get(entityClass, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		return this.createCriteria().list();
	}
}
