package com.mocha.springbootwar.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mocha.springbootwar.bean.OutauthBaseInfo;

public interface OutauthBaseService extends IService<OutauthBaseInfo>{

    
    List<OutauthBaseInfo> getAllList();
    
  
}
