package com.ssm.controller;

import com.ssm.pojo.Book;
import com.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

/**
 * @author jitwxs
 * @date 2021年04月27日 17:01
 */
@Controller
@RequestMapping("/book")
public class BookController {

        @Autowired
        @Qualifier("BookServiceImpl")
        private BookService bookService;

        @RequestMapping("/allBook")
        public String list(Model model) {
                List<Book> list = bookService.queryAllBook();
                model.addAttribute("list", list);
                return "allBook";
        }

        @RequestMapping("/toAddBook")
        public String toAddBook(){
                return "addBook";
        }

        @RequestMapping("/addBook")
        public String addBook(Book book){
                bookService.addBook(book);
                //重定向回首页
                return  "redirect:/book/allBook";
        }

        @RequestMapping("/toUpdateBook")
        public String toUpdateBook(int id,Model model){
              Book book = bookService.queryBookById(id);
              model.addAttribute("qBook",book);
                return "updateBook";
        }

        @RequestMapping("/updateBook")
        public String upadteBook(Book book){
                bookService.updateBook(book);
                return "redirect:/book/allBook";
        }

        @RequestMapping("/deleteBook/{bId}")
        public String deleteBook(@PathVariable("bId") int id){
                bookService.deleteBookById(id);
                return "redirect:/book/allBook";
        }

        @RequestMapping("/queryBook")
        public String queryBook( String bName, Model model){
              Book book=  bookService.queryBookByName(bName);
              List<Book> list=new ArrayList<Book>();
              if (book==null){
                      model.addAttribute("erro","未查询到相关图书");
              }
              list.add(book);
              model.addAttribute("list" ,list);
              return "allBook";

        }
}