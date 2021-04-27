package com.ssm.service;

import com.ssm.dao.BookMapper;
import com.ssm.pojo.Book;

import java.util.List;

/**
 * @author jitwxs
 * @date 2021年04月27日 16:48
 */
public class BookServiceImpl implements BookService {

        //调用dao层的操作，设置一个set接口，方便Spring管理
        private BookMapper bookMapper;

        public void setBookMapper(BookMapper bookMapper) {
                this.bookMapper = bookMapper;
        }

        public int addBook(Book book) {
                return bookMapper.addBook(book);
        }

        public int deleteBookById(int id) {
                return bookMapper.deleteBookById(id);
        }

        public int updateBook(Book books) {
                return bookMapper.updateBook(books);
        }

        public Book queryBookById(int id) {
                return bookMapper.queryBookById(id);
        }

        public List<Book> queryAllBook() {
                return bookMapper.queryAllBook();
        }

        public Book queryBookByName(String bName) {
                return bookMapper.queryBookByName(bName);
        }
}