package com.qf.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.BackUserMapper;
import com.qf.entity.BackUser;
import com.qf.service.IBackUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class BackUserImpl implements IBackUserService {

    @Autowired
    private BackUserMapper backUserMapper;


    @Override
    public List<BackUser> queryAll() {
        return backUserMapper.selectList(null);
    }

    @Override
    public int insertBackUser(BackUser backUser) {
        return backUserMapper.insert(backUser);
    }
}
