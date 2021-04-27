package com.ssm.service;

import com.ssm.dao.BookMapper;
import com.ssm.pojo.Book;

import java.util.List;

/**
 * @author jitwxs
 * @date 2021��04��27�� 16:48
 */
public class BookServiceImpl implements BookService {

        //����dao��Ĳ���������һ��set�ӿڣ�����Spring����
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