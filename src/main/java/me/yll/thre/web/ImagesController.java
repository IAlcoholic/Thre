package me.yll.thre.web;
import me.yll.thre.core.Result;
import me.yll.thre.core.ResultGenerator;
import me.yll.thre.model.Images;
import me.yll.thre.model.Videos;
import me.yll.thre.service.ImagesService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* Created by yll on 2017/11/19.
*/
@RestController
@RequestMapping("/images")
public class ImagesController {
    @Resource
    private ImagesService imagesService;

    @RequestMapping("/add")
    public Result add(Images images) {
        System.out.println( "执行了——" );
        SimpleDateFormat   formatter   =   new   SimpleDateFormat   ("yyyy/MM/dd/ HH:mm:ss     ");
        Date   curDate   =   new   Date(System.currentTimeMillis());//获取当前时间
        String   str   =   formatter.format(curDate);
        int i = 1;
        while (i<20){
            images.setCreatetime( str );
            images.setDownload( 0 );
            images.setImagedescription( "我拍摄的风景照" );
            images.setImagekeyword( "风景" );
            images.setImagename( "work_3.jpg" );
            images.setState( 0 );
            images.setUserid( 1 );
            images.setImageurl( "userimg" );
            imagesService.save(images);
            i++;
        }

        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        imagesService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping("/update")
    public Result update(Images images) {
        imagesService.update(images);
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Images images = imagesService.findById(id);
        return ResultGenerator.genSuccessResult(images);
    }

    @RequestMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Images> list = imagesService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @RequestMapping("/finduserid")
    public Result finduserid(@RequestParam Integer userid) {
        System.out.println( "用户id:"+userid );
        return ResultGenerator.genSuccessResult(imagesService.mylist( userid ));
    }

    /**
     * 根据关键字查询首页图片
     * @param page
     * @param size
     * @return
     */
    @RequestMapping("/lists")
    public Result lists(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "9") Integer size,@RequestParam String imagekeyword) {
        return ResultGenerator.genSuccessResult(imagesService.getlist( imagekeyword ));
    }

    @RequestMapping("/listkey")
    public List<Images> listkey() {
        return imagesService.getkeylist();
    }
}
