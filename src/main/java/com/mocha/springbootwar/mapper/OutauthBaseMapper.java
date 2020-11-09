package com.mocha.springbootwar.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mocha.springbootwar.bean.OutauthBaseInfo;

public interface OutauthBaseMapper extends BaseMapper<OutauthBaseInfo>{

    List<OutauthBaseInfo> getAllList();
  
}
