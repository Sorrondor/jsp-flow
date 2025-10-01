package com.app.order;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Result;
import com.app.member.controller.MemberJoinController;
import com.app.member.controller.MemberJoinOkController;
import com.app.member.controller.MemberLoginController;
import com.app.member.controller.MemberLoginOkController;
import com.app.member.controller.MemberLogoutOkController;

public class OrderFrontController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
		Result result = null;
		if(target.equals("join")) {
			result = new MemberJoinController().execute(req, resp);	
		}else if(target.equals("join-ok")) {
			result = new MemberJoinOkController().execute(req, resp);	
		}else if(target.equals("login")) {
			result = new MemberLoginController().execute(req, resp);	
		}else if(target.equals("login-ok")) {
			result = new MemberLoginOkController().execute(req, resp);	
		}else if(target.equals("login-out")) {
			result = new MemberLogoutOkController().execute(req, resp);	
		}else {
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
}
