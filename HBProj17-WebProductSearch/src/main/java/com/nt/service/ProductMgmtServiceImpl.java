package com.nt.service;

import com.nt.dao.ProductDao;
import com.nt.dao.ProductDaoImpl;
import com.nt.dto.ProductDTO;
import com.nt.entity.Product;

public class ProductMgmtServiceImpl implements ProductMgmtService{
private ProductDao dao;
	public ProductMgmtServiceImpl()
{
dao=new ProductDaoImpl();	
}
	@Override
	public ProductDTO fetchProduct(int pid) {
		// TODO Auto-generated method stub
		System.out.println(dao.hashCode());
		System.out.println("ProductMgmtServiceImpl.fetchProduct()");
		Product prod=dao.getByPid(pid);
		System.out.println("ProductMgmtServiceImpl.fetchProduct()");
		ProductDTO dto=new ProductDTO();
		System.out.println("ProductMgmtServiceImpl.fetchProduct()");
		dto.setPid(prod.getPid());
		System.out.println("ProductMgmtServiceImpl.fetchProduct()");
		dto.setPname(prod.getPname());
		dto.setQty(prod.getQty());
		System.out.println("ProductMgmtServiceImpl.fetchProduct()");
        dto.setPrice((float)Math.round(prod.getPrice()));
        System.out.println("ProductMgmtServiceImpl.fetchProduct()");
		if(prod.getPrice()<=500)
		{
			dto.setCategory("affortable");
		}
		else
		{
			dto.setCategory("Costly");
		}
        return dto;
	}

}
