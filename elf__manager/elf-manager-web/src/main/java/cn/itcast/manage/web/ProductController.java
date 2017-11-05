package cn.itcast.manage.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.manage.service.ProductService;
import cn.itcast.pojo.TbItem;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping("item/findid/{itemid}")
	@ResponseBody
	public TbItem findItemById(@PathVariable Long itemid){
		TbItem item = productService.findItemById(itemid);
		return item;
	}
}
