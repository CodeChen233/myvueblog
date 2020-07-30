package com.gychen.service.impl;

import com.gychen.entity.User;
import com.gychen.mapper.UserMapper;
import com.gychen.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gychen
 * @since 2020-07-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
