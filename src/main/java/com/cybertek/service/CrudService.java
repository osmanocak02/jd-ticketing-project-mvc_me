package com.cybertek.service;

import com.cybertek.dto.RoleDTO;

import java.util.List;

public interface CrudService<T, ID> {

    List<T> findAll();
    T findByID(ID id);
    void delete(T object);
    void deleteByID(ID id);
    T save(T object);
}
