package com.ssm.dao;

import com.ssm.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
        //增加一个Book
        int addBook(Book book);

        //根据id删除一个Book
        int deleteBookById(@Param("bId") int id);

        //更新Book
        int updateBook(Book books);

        //根据id查询,返回一个Book
        Book queryBookById(@Param("bId") int id);

        //查询全部Book,返回list集合
        List<Book> queryAllBook();

        Book queryBookByName(String bName);
}
