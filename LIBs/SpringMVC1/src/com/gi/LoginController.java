package com.gi;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller{
	LoginModel lm;

	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		
		String a = req.getParameter("t1");
		String b = req.getParameter("t2");
		
		String ans = lm.validate(a, b);

		if(ans==null)
			return new ModelAndView("/login.jsp");
		else if(ans.equals("admin"))
			return new ModelAndView("/admin.jsp");
		else if(ans.equals("user"))
			return new ModelAndView("/user.jsp");
		else 
			return null;		
	}
	public void setLm(LoginModel lm)
	{
		this.lm = lm;
	}
}	
