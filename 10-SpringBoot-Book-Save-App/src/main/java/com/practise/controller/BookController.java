package com.practise.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.practise.entity.BookEntity;
import com.practise.reopsitory.BookRepo;

@Controller
public class BookController {
	
	@Autowired
	private BookRepo bg;
	
	
	@GetMapping("/load")
	public String loadform(Model model) {
		BookEntity booke = new BookEntity();
		model.addAttribute("book", booke);
		return "index";
	}
	
	@PostMapping("/save")
	public String addform(@ModelAttribute("book")  BookEntity book, Model model) {
		
		BookEntity entity = bg.save(book);
		
		if(book.getBookId() == null &&entity.getBookId()!= null) {
			model.addAttribute("msg", "Book Stored Sucessfully");
		}else if(book.getBookId() != null && entity.getBookId() != null){
			model.addAttribute("msg", "Book Update Succesfully");
		}
		
		else {
			model.addAttribute("failmsg", "Failed to store book");
		}
		return "index";
	}
	
	@GetMapping("/view")
	public String viewBook(Model model) {
		
	List<BookEntity> findAll = bg.findAll();
	
	model.addAttribute("jook", findAll);	
		return "show";
		
	}
	@GetMapping("/editBook")
	public String editBook(@RequestParam("bid")Integer bookId, Model model) {
		Optional<BookEntity> findById = bg.findById(bookId);
		if(findById.isPresent()) {
			BookEntity bookEntity = findById.get();
			model.addAttribute("book",bookEntity);
			
		}
		return "index";
	}
	
	
	@GetMapping("/delete")
	public String deleteBook(@RequestParam("bid")  Integer bookId, RedirectAttributes rd) {
		bg.deleteById(bookId);
		rd.addFlashAttribute("msg", "Book delete Successfully");
		return "redirect:view";
	}

}
