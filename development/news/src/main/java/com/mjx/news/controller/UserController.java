package com.mjx.news.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import com.mjx.news.repository.*;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import com.mjx.news.mapper.*;
import com.mjx.news.entity.*;
import com.mjx.news.service.*;
import org.springframework.web.bind.annotation.RequestBody;

@RestController

@RequestMapping("/user")
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
  @PostMapping(value="/setUser")
  public void postMethodName(@RequestBody SomeEnityData entity) {
      //TODO: process POST request
      
      return entity;
  }
  

}