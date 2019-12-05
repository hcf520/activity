package com.hcf.activity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcf.activity.entity.Userlist;
import com.hcf.activity.service.IUserlistService;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author hcf
 * @since 2019-12-05
 */
@RestController
@RequestMapping("/userlist")
public class UserlistController {

	@Autowired
	private IUserlistService iUserlistService;

	@GetMapping("/findById")
	public Userlist findById(int id) {
		return iUserlistService.getById(id);
	}
}
