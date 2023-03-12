package com.vounet.springbootInit.mapper;

import com.vounet.springbootInit.domain.entity.PostThumb;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author HIM198
* @description 针对表【post_thumb(帖子点赞)】的数据库操作Mapper
* @createDate 2023-03-12 18:22:07
* @Entity com.vounet.springbootInit.domain.entity.PostThumb
*/
@Mapper
public interface PostThumbMapper extends BaseMapper<PostThumb> {

}




