package com.mjx.news.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.ui.Model;
import com.mjx.news.repository.*;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mjx.news.mapper.*;
import com.mjx.news.entity.*;
import com.mjx.news.service.*;
import org.springframework.web.bind.annotation.RequestBody;

@RestController

// @RequestMapping("/user")
public class UserController {
  @GetMapping("/getUserById")
  public User getUserById(@RequestParam String id) throws IOException {
    User user = DBConnection.getUserById(id);
		return user;
	}
  @GetMapping("/getUsersByRole")
  public List<User> getUsersByRole(@RequestParam Integer id) throws IOException {
    List<User> users = DBConnection.getUsersByRole(id);
		return users;
  }
  @GetMapping("/getAllUsers")
  public List<User> getUsersByRole() throws IOException {
    List<User> users = DBConnection.getAllUsers();
		return users;
  }
  @PostMapping(value="/addUser")
  // @ResponseBody 
  public User addUser(@RequestBody User user) throws IOException{
      //TODO: process POST request\
      int a = DBConnection.addUser(user);
      System.out.println(user.getRealname());
      return user;
  }

  @PostMapping(value="/deleteUser")
  public int delUser(@RequestParam String id) throws IOException{
    return 1;
  }

  @PostMapping(value="/loginService")
  public String login(HttpServletRequest request,HttpServletResponse response) throws IOException {
    String email = (String)request.getAttribute("email");
    String password = (String)request.getAttribute("password");

    User user = DBConnection.getUserByEmail(email);
    if (user.getPassword() == password) {
      request.getSession().setAttribute("user", user);
      return "redirect:/admin";
    } else {
      return "redirect:/adminlogin";
    }
  } 

}