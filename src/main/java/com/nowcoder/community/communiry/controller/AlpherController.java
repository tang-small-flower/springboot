package com.nowcoder.community.communiry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@Controller
@RequestMapping("/hello")
public class AlpherController {
    @RequestMapping("/world")
    @ResponseBody
    public String sayhello()
    {
        return "hello,world";
    }
    @RequestMapping("/find_job")
    public void find_job(HttpServletRequest request, HttpServletResponse response)
    {
        System.out.println(request.getMethod());
        System.out.println(request.getServletPath());
        Enumeration<String> em= request.getHeaderNames();
        while(em.hasMoreElements())
        {
            String key=em.nextElement();
            String value=request.getHeader(key);
            System.out.println(key+" "+value);
        }
        response.setContentType("text/html;charset=utf-8");
        try( PrintWriter ptw=response.getWriter();) {
            ptw.write("<h1>you will find a job</h1>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    @RequestMapping(value = "/student",method = RequestMethod.GET)
//    @ResponseBody
//    public String student(@RequestParam(name = "id",required = false,defaultValue = "1") int id ,@RequestParam(name="page",required = false,defaultValue ="20") int page)
//    {
//        System.out.println(id+" "+page);
//        return "success";
//    }
//    @RequestMapping(value = "/students/{id}",method = RequestMethod.GET)
//    @ResponseBody
//    public String students(@PathVariable("id") int id)
//    {
//        System.out.println(id);
//        return "success";
//    }
//    @RequestMapping(value="/jobs",method = RequestMethod.POST)
//    public void jobs(int find,int job)
//    {
//
//    }

//    @RequestMapping("/html")
//    public ModelAndView view()
//    {
//        ModelAndView mav=new ModelAndView();
//        mav.addObject("name","zhangsan");
// //       mav.setView();
//        return mav;
//    }
//
//    @RequestMapping("html1")
//    public String viewer(Model model)
//    {
//        model.addAttribute("name","hello");
//        return "/hello";
//    }

}
