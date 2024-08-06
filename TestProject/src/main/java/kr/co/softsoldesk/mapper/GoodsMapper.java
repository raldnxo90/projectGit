package kr.co.softsoldesk.mapper;

import org.apache.ibatis.annotations.Insert;

import kr.co.softsoldesk.beans.GoodsBean;

public interface GoodsMapper {
	
	@Insert("insert into Goods values(goods_seq.nextval, #{GoodsName}, #{GoodsPrice} , #{GoodsStore})")
	void addGoods(GoodsBean goodsBean);
}
