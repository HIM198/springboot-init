package com.vounet.springbootInit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vounet.springbootInit.domain.entity.Post;
import com.vounet.springbootInit.service.PostService;
import com.vounet.springbootInit.mapper.PostMapper;
import org.springframework.stereotype.Service;

/**
* @author HIM198
* @description 针对表【post(帖子)】的数据库操作Service实现
* @createDate 2023-03-12 18:22:07
*/
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post>
    implements PostService{

}




