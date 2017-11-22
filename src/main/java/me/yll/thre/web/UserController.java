package me.yll.thre.web;
import me.yll.thre.core.Result;
import me.yll.thre.core.ResultGenerator;
import me.yll.thre.model.User;
import me.yll.thre.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by yll on 2017/11/19.
*/
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/add")
    public Result add(User user) {
        if(user.getUsername().equals( "" )||user.getPassword().equals( "" )){
            System.out.println( "注册失败:"+user.getUsername() );
            return ResultGenerator.genFailResult( "注册失败,你的用户名或者密码不符合规则。" );
        }else {
            System.out.println( "注册成功" );
            userService.save(user);
            return ResultGenerator.genSuccessResult("注册成功");
        }
    }

    @RequestMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping("/update")
    public Result update(User user) {
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        User user = userService.findById(id);
        return ResultGenerator.genSuccessResult(user);
    }

    @RequestMapping("/test")
    public String test() {
        return "login";
    }

    @RequestMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
