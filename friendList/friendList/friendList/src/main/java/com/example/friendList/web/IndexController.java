package com.example.friendList.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.friendList.domain.Friend;

@Controller
public class IndexController {
	List<Friend> friendList;
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String addFriendAndPrint(@RequestParam(value="friend", required=false) String name, Model model) {
		if(this.friendList == null) {
			this.friendList = new ArrayList<Friend>();
		}
		
		if(name != null) {
			friendList.add(new Friend(name)) ;
		}
		
		model.addAttribute("friendList", friendList);
		
		return "index";
		
	}
}
