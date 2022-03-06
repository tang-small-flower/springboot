package com.nowcoder.community.communiry.controller;

import com.nowcoder.community.communiry.Service.DiscussPostService;
import com.nowcoder.community.communiry.Service.UserService;
import com.nowcoder.community.communiry.entity.DiscussPost;
import com.nowcoder.community.communiry.entity.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.objenesis.instantiator.annotations.Instantiator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    private DiscussPostService discusspostservice;
    @Autowired
    private UserService userservice;
    @RequestMapping(path="index",method = RequestMethod.GET)
    public String getIndexPage(Model model,Page page)
    {
        page.setRows(discusspostservice.findDiscussRows(0));
        page.setPath("/index");
        List<DiscussPost> list=discusspostservice.findDiscussPost(0,page.getoffset(), page.getLimit());
        List<Map<String,Object>> discussposts=new ArrayList<>();
        if(list!=null)
        {
            for(DiscussPost d:list)
            {
                Map<String,Object> map=new HashMap<>();
                map.put("post",d);
                map.put("user",userservice.findById(d.getUser_id()));
                discussposts.add(map);
            }
        }
        model.addAttribute("discusspost",discussposts);
        return "index";
    }
}
