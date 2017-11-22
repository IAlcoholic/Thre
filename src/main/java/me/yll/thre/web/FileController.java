package me.yll.thre.web;

import me.yll.thre.model.Images;
import me.yll.thre.model.Videos;
import me.yll.thre.service.ImagesService;
import me.yll.thre.service.VideosService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @Message: created by yll on 2017/11/19
 * @Description:
 */
@RestController
@RequestMapping("/file")
public class FileController {
    @Resource
    private VideosService videosService;
    @Resource
    private ImagesService imagesService;
    /**
     * 实现文件上传
     * */
    @RequestMapping("imgupload")
    @ResponseBody
    public String fileUpload(@RequestParam("file") MultipartFile file){
        if(file.isEmpty()){
            return "false";
        }
        String fileName = file.getOriginalFilename();
        int size = (int) file.getSize();
        System.out.println(fileName + "-->" + size);

        String path = "H:/项目种子/thre/src/main/resources/static/images/userimg" ;
        File dest = new File(path + "/" + fileName);
        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            return "true";
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        }
    }

    /**
     * 实现多文件上传
     * */
    @RequestMapping(value="upload",method= RequestMethod.POST)
    public @ResponseBody String multifileUpload(HttpServletRequest request) throws UnsupportedEncodingException {

        List<MultipartFile> files = ((MultipartHttpServletRequest)request).getFiles("file");
//        request.setCharacterEncoding("UTF-8");
//
        String leixin = request.getParameter("leixin");
        String keyword = request.getParameter("keyword");
        int state = Integer.parseInt( request.getParameter("state") );
        int userid = Integer.parseInt( request.getParameter("userid") );

        if(files.isEmpty()){
            return "<h1>上传失败</h1><a href=\"#\" onclick=\"javascript:history.back(-1);\">返回</a>";
        }

        String path = "H:/项目种子/thre/src/main/resources/static/images/userimg" ;

        if (leixin.equals( "图片" )){

            path = "H:/项目种子/thre/src/main/resources/static/images/userimg" ;

        }else if (leixin.equals( "视频" )){

            path = "H:/项目种子/thre/src/main/resources/static/images/uservideo" ;

        }


        for(MultipartFile file:files){
            String fileName = file.getOriginalFilename();
            int size = (int) file.getSize();
            System.out.println(fileName + "-->" + size);

            if(file.isEmpty()){
                return "<h1>上传失败</h1><a href=\"#\" onclick=\"javascript:history.back(-1);\">返回</a>";
            }else{
                File dest = new File(path + "/" + fileName);
                if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
                    dest.getParentFile().mkdir();
                }
                try {
                    file.transferTo(dest);

                    if (leixin.equals( "图片" )){

                        Images images = new Images();
                        images.setUserid( userid );
                        images.setImagekeyword( keyword );
                        images.setState( state );
                        images.setImagename( fileName );
                        images.setImageurl( fileName );
                        imagesService.save(images);

                    }else if (leixin.equals( "视频" )){

                        Videos videos = new Videos();
                        videos.setUserid( userid );
                        videos.setVideokeyword( keyword );
                        videos.setState( state );
                        videos.setVideoname( fileName );
                        videos.setVideourl( fileName );
                        videosService.save(videos);

                    }
                    System.out.println( "信息："+userid+leixin+keyword+state+fileName );
                }catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    return "<h1>上传失败</h1><a href=\"#\" onclick=\"javascript:history.back(-1);\">返回</a>";
                }
            }
        }
        return "<h1>上传成功</h1><a href=\"#\" onclick=\"javascript:history.back(-1);\">返回</a>";
    }
}
