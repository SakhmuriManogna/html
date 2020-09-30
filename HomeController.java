package com.myspr.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myspr.demo.Model.AllOther;
import com.myspr.demo.Model.Author;
import com.myspr.demo.dao.AuthorDao;


@Controller
public class HomeController {

@Autowired
AuthorDao dao;



@RequestMapping(value="/")
public String home(Model model)
{
return "home";
}

@RequestMapping(value="/display")
public String display(Model model,@ModelAttribute Author author)
{
String status=dao.saveAuthor(author);
model.addAttribute("status",status);
return "display";
}


@RequestMapping(value="/search")
public String search(Model model,@RequestParam ("authorName") String authorName)
{
	
ArrayList<Author> sea =(ArrayList<Author>) dao.getbyname(authorName);
model.addAttribute("sea",sea);
return "search";
}


@RequestMapping(value="/search2")
public String search2(Model model,@RequestParam ("city") String name)
{
	
ArrayList<Author>  sea2 =(ArrayList<Author>) dao.getbycity("city");
model.addAttribute("sea2",sea2);
return "search2";
}



@RequestMapping(value="/delete")
public String delete(Model model,@RequestParam ("authorName") String authorName)
{
String  delete=dao.delete(authorName);
model.addAttribute("delete",delete);

return "delete";
}








}