package com.mocha.springbootwar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mocha.springbootwar.bean.OutauthBaseInfo;
import com.mocha.springbootwar.mapper.OutauthBaseMapper;
import com.mocha.springbootwar.service.OutauthBaseService;

@Service
public class OutauthBaseServiceImpl extends 
               ServiceImpl<OutauthBaseMapper, OutauthBaseInfo> implements OutauthBaseService {

    @Autowired
    private OutauthBaseMapper mapper;
    
    @Override
    public List<OutauthBaseInfo> getAllList() {
      return mapper.getAllList();
    }
    
 
}
