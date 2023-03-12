package com.vounet.springbootInit.mapper;

import com.vounet.springbootInit.domain.entity.PostFavour;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author HIM198
* @description 针对表【post_favour(帖子收藏)】的数据库操作Mapper
* @createDate 2023-03-12 18:22:07
* @Entity com.vounet.springbootInit.domain.entity.PostFavour
*/
@Mapper
public interface PostFavourMapper extends BaseMapper<PostFavour> {

}




