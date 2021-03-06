package com.zscat.beetl.function;



import com.zscat.shop.model.Member;
import com.zscat.shop.util.SysUserUtils;



import org.springframework.stereotype.Service;

@Service("auth")
public class AuthUserFunctions {


	
	/**
	 * 登录用户
	* @return
	 */
	public Member getLoginUser(){
		return (Member) SysUserUtils.getSessionLoginUser();
	}
	

	

	/**
	 * 是否为超级管理员
	* @return
	 */
	public boolean isLogin(){
		return SysUserUtils.getSessionLoginUser()!=null;
	}
}
