package com.antonio.store.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.antonio.store.store.entity.Article;
import com.antonio.store.store.service.ArticleService;

@Controller
public class HomeController {

	@Autowired
	private ArticleService articleService;


	@RequestMapping("/")
	public String index(Model model) {
		List<Article> articles = articleService.findFirstArticles();
		model.addAttribute("articles", articles);
		return "index";
	}


}
