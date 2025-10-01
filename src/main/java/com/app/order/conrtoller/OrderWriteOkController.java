package com.app.order.conrtoller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import com.app.Action;
import com.app.Result;
import com.app.dao.OrderDAO;
import com.app.vo.OrderVO;

public class OrderWriteOkController implements Action{

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		OrderDAO orderDAO = new OrderDAO();
		String[] productIds = null, productCounts = null;
		
		productIds = req.getParameterValues("productId");
		productCounts = req.getParameterValues("productCount");
		
		for(int i=0; i<productIds.length; i++) {
			OrderVO	 orderVO = new OrderVO();
			Long productId = Long.parseLong(productIds[i]);
			Integer productCount = Integer.parseInt(productCounts[i]);
//			String memberEmail = (String)session.getAttribute("memberEmail");
//			Long memberId = memberDAO.selectIdByMemberEmail(memberEmail);
			
//			orderVO.setMemberId(memberId);
			orderVO.setProductId(productId);
			orderVO.setProductCount(productCount);
		}
		
		return result;
	}
}
