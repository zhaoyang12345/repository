package cn.itcast.manage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.manage.service.ProductService;
import cn.itcast.mapper.TbItemMapper;
import cn.itcast.pojo.TbItem;
@Service
public class ProductServiceimpl implements ProductService{

	@Autowired
	private TbItemMapper tbItemmapper;
	
	@Override
	public TbItem findItemById(Long id) {
		// TODO Auto-generated method stub
		return tbItemmapper.selectByPrimaryKey(id);
	}

}
