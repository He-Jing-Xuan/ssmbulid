package com.He.Dao;

import com.He.pojo.Books;

import java.util.List;

public interface BookMapper {
    //增加
    int addBook(Books books);
    //删除
    int deleteBookById(int id);
    //修改
    int updateBook(Books books);
    //根据id查询
    Books queryBookById(int id);
    //查询全部
    List<Books> queryAllBook();
}
