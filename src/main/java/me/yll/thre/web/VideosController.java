package me.yll.thre.web;
import me.yll.thre.core.Result;
import me.yll.thre.core.ResultGenerator;
import me.yll.thre.model.Images;
import me.yll.thre.model.Videos;
import me.yll.thre.service.VideosService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
* Created by yll on 2017/11/19.
*/
@RestController
@RequestMapping("/videos")
public class VideosController {
    @Resource
    private VideosService videosService;

    @RequestMapping("/add")
    public Result add(Videos videos) {
        int i = 1;
        while (i<20){
            SimpleDateFormat   formatter   =   new   SimpleDateFormat   ("yyyy/MM/dd/ HH:mm:ss     ");
            Date   curDate   =   new   Date(System.currentTimeMillis());//获取当前时间
            String   str   =   formatter.format(curDate);
            videos.setCreatetime( str );
            videos.setDownload( 0 );
            videos.setVideodescription( "我的生日视频" );
            videos.setVideokeyword( "生日" );
            videos.setVideoname( "work_3.mp4" );
            videos.setState( 0 );
            videos.setUserid( 1 );
            videos.setVideourl( "uservideo" );
            videosService.save(videos);
            i++;
        }

        return ResultGenerator.genSuccessResult();
    }
@Test
public void  test(){
    SimpleDateFormat   formatter   =   new   SimpleDateFormat   ("yyyy年MM月dd日   HH:mm:ss     ");
    Date   curDate   =   new   Date(System.currentTimeMillis());//获取当前时间
    String   str   =   formatter.format(curDate);
    System.out.println( "时间："+str );
}
    @RequestMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        videosService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping("/update")
    public Result update(Videos videos) {
        videosService.update(videos);
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Videos videos = videosService.findById(id);
        return ResultGenerator.genSuccessResult(videos);
    }

    @RequestMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        List<Videos> list = videosService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @RequestMapping("/finduserid")
    public Result finduserid(@RequestParam Integer userid) {
//        Videos videos = new Videos();
//        videos.setUserid( Integer.parseInt( userid ) );
        System.out.println( "用户id:"+userid );
        return ResultGenerator.genSuccessResult(videosService.mylist( userid ));
    }

    /**
     * 根据关键字查询首页视频
     * @param page
     * @param size
     * @return
     */
    @RequestMapping("/lists")
    public Result lists(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "9") Integer size,@RequestParam String videokeyword) {
        return ResultGenerator.genSuccessResult(videosService.getlist( videokeyword ));
    }

    @RequestMapping("/listkey")
    public List<Videos> listkey() {
        return videosService.getkeylist();
    }
}
