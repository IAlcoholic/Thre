package me.yll.thre.web;

import me.yll.thre.core.Result;
import me.yll.thre.core.ResultGenerator;
import me.yll.thre.model.User;
import me.yll.thre.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Message: created by yll on 2017/11/19
 * @Description:
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @Resource
    private UserService userService;

    @RequestMapping("/login")
    @Test
    public Result login(User user) {

        String username = user.getUsername();
        String password = user.getPassword();

        if (username.equals( "")||password.equals( "" )){
            return ResultGenerator.genFailResult( "请填写完你的登陆信息！" );
        }else{
            User me = userService.findBy( "username",user.getUsername() );
            if (me.equals( null )){
                return ResultGenerator.genFailResult( "不好意思，登陆失败,你的用户名或者密码不正确。" );
            }else{
                System.out.println( me.getUsername()+me.getPassword() );
                if (username.equals( me.getUsername())&&password.equals( me.getPassword() )){
                    return ResultGenerator.genSuccessResult(me);
                }else {
                    return ResultGenerator.genFailResult( "登陆失败,你的用户名或者密码不正确。" );
                }
            }

        }

    }

}
