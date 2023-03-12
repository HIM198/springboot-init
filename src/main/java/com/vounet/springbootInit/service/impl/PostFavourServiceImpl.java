package com.vounet.springbootInit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vounet.springbootInit.domain.entity.PostFavour;
import com.vounet.springbootInit.service.PostFavourService;
import com.vounet.springbootInit.mapper.PostFavourMapper;
import org.springframework.stereotype.Service;

/**
* @author HIM198
* @description 针对表【post_favour(帖子收藏)】的数据库操作Service实现
* @createDate 2023-03-12 18:22:07
*/
@Service
public class PostFavourServiceImpl extends ServiceImpl<PostFavourMapper, PostFavour>
    implements PostFavourService{

}




