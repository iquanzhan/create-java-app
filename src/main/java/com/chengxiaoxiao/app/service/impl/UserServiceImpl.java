package com.chengxiaoxiao.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chengxiaoxiao.app.entity.User;
import com.chengxiaoxiao.app.mapper.UserMapper;
import com.chengxiaoxiao.app.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2020/5/1 3:48 下午
 * @Description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
