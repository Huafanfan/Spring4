package com.huafanfan.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huafanfan.mapper.EmpMapper;
import com.huafanfan.pojo.PageInfo;
import com.huafanfan.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpMapper empMapper;
	@Override
	public PageInfo show(int pageSize, int pageNumber) {
		PageInfo pi= new PageInfo();
		pi.setPageNumber(pageNumber);
		pi.setPageSize(pageSize);
		pi.setList(empMapper.selByPage(pageSize*(pageNumber-1), pageSize));
		long count = empMapper.selCount();
		pi.setTotal(count%pageSize==0?count/pageSize:count/pageSize+1);
		return pi;
	}

}
