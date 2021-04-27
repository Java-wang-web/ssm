package com.ssm.dao;

import com.ssm.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
        //����һ��Book
        int addBook(Book book);

        //����idɾ��һ��Book
        int deleteBookById(@Param("bId") int id);

        //����Book
        int updateBook(Book books);

        //����id��ѯ,����һ��Book
        Book queryBookById(@Param("bId") int id);

        //��ѯȫ��Book,����list����
        List<Book> queryAllBook();

        Book queryBookByName(String bName);
}
