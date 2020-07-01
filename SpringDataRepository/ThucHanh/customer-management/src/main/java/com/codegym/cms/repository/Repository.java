package com.codegym.cms.repository;

import java.util.List;

public interface Repository <T> {
    List<T> findAll ();
    void save(T t);
    T findById(Long id);
    void remove(Long id);
    void update(Long id,T t);


}
