package kr.co.softsoldesk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.softsoldesk.DAO.GoodsDAO;
import kr.co.softsoldesk.beans.GoodsBean;

@Service
public class GoodsService {
	
	@Autowired
	private GoodsDAO goodsDAO;
	
	public void addGoods(GoodsBean goodsBean) {
		System.out.println("안녕하세요");
		goodsDAO.addGoods(goodsBean);
	}
	
}
