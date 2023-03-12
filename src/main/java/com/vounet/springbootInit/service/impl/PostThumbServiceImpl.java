package com.vounet.springbootInit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vounet.springbootInit.domain.entity.PostThumb;
import com.vounet.springbootInit.service.PostThumbService;
import com.vounet.springbootInit.mapper.PostThumbMapper;
import org.springframework.stereotype.Service;

/**
* @author HIM198
* @description 针对表【post_thumb(帖子点赞)】的数据库操作Service实现
* @createDate 2023-03-12 18:22:07
*/
@Service
public class PostThumbServiceImpl extends ServiceImpl<PostThumbMapper, PostThumb>
    implements PostThumbService{

}




