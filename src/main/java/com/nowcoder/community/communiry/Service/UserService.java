package com.nowcoder.community.communiry.Service;

import com.nowcoder.community.communiry.dao.UserMapper;
import com.nowcoder.community.communiry.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper usermapper;
    public User findById(int id)
    {
        return usermapper.selectById(id);
    }
}
