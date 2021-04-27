package com.ssm.service;

import com.ssm.pojo.Book;


import java.util.List;

public interface BookService {
        //����һ��Book
        int addBook(Book book);

        //����idɾ��һ��Book
        int deleteBookById( int id);

        //����Book
        int updateBook(Book books);

        //����id��ѯ,����һ��Book
        Book queryBookById( int id);

        //��ѯȫ��Book,����list����
        List<Book> queryAllBook();

        Book queryBookByName(String bName);
}
