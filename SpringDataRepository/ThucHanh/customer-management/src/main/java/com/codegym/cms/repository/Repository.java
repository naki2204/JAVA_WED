package com.codegym.cms.repository;

import java.util.List;

public interface Repository <T> {
    List<T> findAll ();
    void save(T t);
    T findById(int id);
    void remove(int id);
    void update(int id,T t);


}
