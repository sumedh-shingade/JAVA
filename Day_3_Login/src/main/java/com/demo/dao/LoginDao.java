package com.demo.dao;

import com.demo.beans.MyUser;

public interface LoginDao {

	MyUser validateLogin(String uname, String pass);

}
