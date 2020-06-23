package com.mjx.news.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import com.mjx.news.repository.*;
import com.mjx.news.entity.*;
@Controller
@RequestMapping(path="/user")

public class UserController {
  // @Autowired
  // private UserRepository userRepository;
  // @GetMapping(path="/get")
  // public @ResponseBody String getUser(@RequestParam String id) {
  //   User u = new User();

  //   return u.toString();
  // }
  @GetMapping("/greeting")
  public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

}