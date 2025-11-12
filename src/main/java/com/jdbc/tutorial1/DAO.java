package com.jdbc.tutorial1;

import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {
    T get(int id) throws SQLException;

    List<T> getAll();

    int save(T t);

    int insert(T t) throws SQLException;

    int update(T t);

    int delete(T t) throws SQLException;
}
