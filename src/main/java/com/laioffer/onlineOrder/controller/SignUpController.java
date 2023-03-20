package com.laioffer.onlineOrder.controller;


import com.laioffer.onlineOrder.entity.Customer;
import com.laioffer.onlineOrder.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;


@Controller
//也是一个component
public class SignUpController {


    private CustomerService customerService;


    @Autowired
    public SignUpController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void signUp(@RequestBody Customer customer) {
        customerService.signUp(customer);
    }
}

//@Controller
////在项目启动的时候，根据url和method可以找到这个@controller的class, 随即调用
//public class SignUpController {
//    @RequestMapping(value = "/signup", method = RequestMethod.POST)
//    //method = RequestMethod.POST 把一个http请求映射到method里面，这个url可以定义比如说value = signup, method可以定义为GET或者POST
//
//    //ResponseStatus 表示将来如果创建用户成功（前端发回来的请求已经在处理了）返回一个201给前端就可以了
//    //如果这个账号已经被占用，可以返回一个400
//    @ResponseStatus(value = HttpStatus.CREATED)
//    //这个input前端发送过来的Url是一个sign up， http method是一个post请求，我们可以调用Customer这个Model， 已经定义好了
//    //前端发送过来的是一个jason, 但是我们后端是用一个,Object,如果convert,只需要一个@RequestBody，就可以自动转化
//    public void signUp(@RequestBody Customer customer) {
//    }
//}
//
//
