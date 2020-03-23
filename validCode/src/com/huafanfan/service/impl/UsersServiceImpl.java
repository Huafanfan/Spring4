package com.huafanfan.service.impl;

import com.huafanfan.mapper.UsersMapper;
import com.huafanfan.pojo.Users;
import com.huafanfan.service.UsersService;

public class UsersServiceImpl implements UsersService{
	private UsersMapper usersMapper;
	
	public UsersMapper getUsersMapper() {
		return usersMapper;
	}

	public void setUsersMapper(UsersMapper usersMapper) {
		this.usersMapper = usersMapper;
	}

	@Override
	public Users login(Users users) {
		return usersMapper.selByUsersPwd(users);
	}

}
