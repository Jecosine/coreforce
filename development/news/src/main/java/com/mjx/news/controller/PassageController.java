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

@RestController
@RequestMapping("/passage")
public class PassageController {
  @GetMapping("/getById")
  public Passage getPassageById(@RequestParam String id) throws IOException {
    Passage passage = DBConnection.getPassageById(id);
		return passage;
	}
  @GetMapping("/getByPart")
  public List<Passage> getPassagesByPart(@RequestParam Integer id) throws IOException {
    List<Passage> passages = DBConnection.getPassagesByPart(id);
		return passages;
  }
  @GetMapping("/getAll")
  public List<Passage> getAllPassages() throws IOException {
    List<Passage> passages = DBConnection.getAllPassages();
		return passages;
  }
  @GetMapping("/getInfo")
  public List<Passage> getAllInfos() throws IOException {
    List<Passage> passages = DBConnection.getAllInfos();
		return passages;
  }
}