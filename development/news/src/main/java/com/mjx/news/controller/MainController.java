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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mjx.news.mapper.*;
import com.mjx.news.entity.*;
import com.mjx.news.service.*;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/admin")
public class MainController {
  // login
  @RequestMapping("/login")
  public String hello()  {    
		return "pages/admin-login.html";
	}

  @RequestMapping("/") 
  public String mainpage(HttpServletRequest request, HttpServletResponse response) throws IOException {
    HttpSession session = request.getSession(false);
    if (session != null && session.getAttribute("user") != null) {
      System.out.println(((User)session.getAttribute("user")).getEmail());
      return "pages/admin-todos.html";
    }
    return "redirect:/admin/login";
  }
  @RequestMapping("/editProfile")
  public String getUser1() throws IOException{
		return "pages/admin-edituser.html";
  }
  // @RequestMapping("")
}