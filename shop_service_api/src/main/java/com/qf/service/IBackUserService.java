package com.qf.service;

import com.qf.entity.BackUser;

import java.util.List;

public interface IBackUserService {

    List<BackUser> queryAll();
    int insertBackUser(BackUser backUser);
}
