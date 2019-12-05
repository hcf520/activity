package com.hcf.activity.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcf.activity.entity.SprdFaqList;
import com.hcf.activity.service.ISprdFaqListService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hcf
 * @since 2019-12-05
 */
@RestController
@RequestMapping("/sprd-faq-list")
public class SprdFaqListController {

	@Autowired
	private ISprdFaqListService iSprdFaqListService;
	
	@RequestMapping(value="/findAll")
	public List findAll(){
		return iSprdFaqListService.list();
	}
	
	@GetMapping("/findById")
	public SprdFaqList findById(int id){
		return iSprdFaqListService.getById(id);
	}
}

