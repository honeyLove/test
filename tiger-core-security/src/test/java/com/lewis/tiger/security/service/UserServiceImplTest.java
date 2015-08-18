package com.lewis.tiger.security.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lewis.tiger.security.domain.SysUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test-security.xml" })
public class UserServiceImplTest extends AbstractTransactionalJUnit4SpringContextTests {
	private String username;
	private String md5pwd;

	@Autowired
	private IUserService userSrv;

	@Before
	public void initUser() {
		username = "admin";
		md5pwd = "21232F297A57A5A743894A0E4A801FC3";
	}

	@Test
	public void findUser() {
		assertNull(this.userSrv.findUser("", null));
		assertNull(this.userSrv.findUser(username, md5pwd + " "));
		assertNotNull(this.userSrv.findUser(username, md5pwd));
	}

	@Test
	public void delUser() {
		String ids = "1,2";
		this.userSrv.delUsers(ids);
		assertNull(this.userSrv.findUser(username, md5pwd));
	}

	@Test
	public void findAll() {
		assertNotNull(this.userSrv.findAll());
	}

	@Test
	public void insert() {
		int before = this.userSrv.findAll().size();
		SysUser user = new SysUser();
		user.setName("我去");
		this.userSrv.insert(user);
		int after = this.userSrv.findAll().size();
		assertEquals(after - before, 1);
	}
}