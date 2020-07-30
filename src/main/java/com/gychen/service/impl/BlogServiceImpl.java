package com.gychen.service.impl;

import com.gychen.entity.Blog;
import com.gychen.mapper.BlogMapper;
import com.gychen.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
