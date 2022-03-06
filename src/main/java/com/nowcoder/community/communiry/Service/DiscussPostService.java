package com.nowcoder.community.communiry.Service;

import com.nowcoder.community.communiry.dao.DiscussPostMapper;
import com.nowcoder.community.communiry.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {
    @Autowired
    private DiscussPostMapper discusspostmapper;
    public List<DiscussPost> findDiscussPost(int user_id, int offset, int limit)
    {
        return discusspostmapper.selectDiscussPost(user_id,offset,limit);
    }
    public int findDiscussRows(int user_id)
    {
        return discusspostmapper.selectDiscussPostRows(user_id);
    }

}
