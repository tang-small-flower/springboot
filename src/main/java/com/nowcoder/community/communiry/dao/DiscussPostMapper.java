package com.nowcoder.community.communiry.dao;

import com.nowcoder.community.communiry.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPost(int user_id,int offset,int limit);
    int selectDiscussPostRows(@Param(("user_id")) int user_id);
}
