package com.gi;

import org.springframework.jdbc.core.JdbcTemplate;

public class LoginModel {
	
	JdbcTemplate jt;
	public void setJt(JdbcTemplate jt)
	{
		this.jt = jt;
	}
	public String validate(String name,String pass)
	{
		String ans=null;
		String sql = "select type from logindetail where name=? and pass=?";
		ans = (String)jt.queryForObject(sql, new Object[]{name,pass},String.class);
		return ans;
	}
}
