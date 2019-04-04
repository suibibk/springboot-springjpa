package cn.forever.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import cn.forever.dao.UserDao;
import cn.forever.model.User;
import cn.forever.service.MyService;

@Service
public class MyServiceImpl implements MyService{
	/**
	 * PageHelper的分页能力太强了
	 */
	@Autowired
	private UserDao userDao;
	public String getUser() {
		List<User> users=userDao.findAll();
		Gson gson = new Gson();
		String user = gson.toJson(users);
		System.out.println("users:"+user.toString());
		return user;
	}

}
