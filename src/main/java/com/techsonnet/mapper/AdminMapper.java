package com.techsonnet.mapper;

import com.techsonnet.pojo.Admin;

import java.util.List;

public interface AdminMapper {
    public int save(Admin admin);
    public int deleteById(int id);
    public int update(Admin admin);
    public Admin findById(Integer id);
    public List<Admin> findAll();
}
