package com.bcdbook.user.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bcdbook.user.dao.IUserDao;
import com.bcdbook.user.pojo.User;
import com.bcdbook.user.service.IUserService;

//import com.cn.hnust.dao.IUserDao;
//import com.cn.hnust.pojo.User;
//import com.cn.hnust.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
