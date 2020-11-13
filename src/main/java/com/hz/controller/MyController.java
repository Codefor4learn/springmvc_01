package com.hz.controller;

import com.hz.domain.Student;
import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/my")
public class MyController {

    @RequestMapping(value = {"/some.do" , "/first.do"} , method = RequestMethod.GET)
    public ModelAndView doSome(){

        ModelAndView mv = new ModelAndView();
        mv.addObject("msg" , "欢迎使用springmvc做web开发");
        mv.addObject("fun","执行的是doSome方法");

        // 框架对视图执行forword操作，request.getRequestDispather("show.jsp")
        mv.setViewName("show");

        //  返回mv
        return mv;
    }

    @RequestMapping(value = {"/other.do" , "/second.do"} , method = RequestMethod.POST)
    public ModelAndView doOther(){

        ModelAndView mv = new ModelAndView();
        mv.addObject("msg" , "欢迎使用springmvc做web开发");
        mv.addObject("fun","执行的是doOther方法");

        mv.addObject("tip","消除横线");
        // 框架对视图执行forword操作，request.getRequestDispather("show.jsp")
        mv.setViewName("show");

        //  返回mv
        return mv;
    }

    /*
        1.RequestParam 逐个接收参数，解决请求中参数名 和 形参名不一样的问题
        @RequestParam("rname") String name , @RequestParam("rage") Integer age

     */
    @RequestMapping(value = "testParam.do" )
    public ModelAndView testParam(HttpServletRequest request, HttpServletResponse httpResponse, HttpSession session){

        String name = request.getParameter("name");
        int age = Integer.valueOf(request.getParameter("age"));

        ModelAndView mv = new ModelAndView();

        mv.addObject("name",name);
        mv.addObject("age",age);

        mv.setViewName("param");

        //  返回mv
        return mv;
    }

    /*
        2.对象接收
          这个对象的 参数名和请求参数名一致
          框架会创建形参的java对象，给属性赋值，调用set方法
     */
    @RequestMapping(value = "testParam2.do" )
    public ModelAndView testParam2(Student student){


        ModelAndView mv = new ModelAndView();

        mv.addObject("name",student.getName());
        mv.addObject("age",student.getAge());

        mv.setViewName("param");

        //  返回mv
        return mv;
    }

}
