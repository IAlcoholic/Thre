package me.yll.thre.service;
import me.yll.thre.model.Images;
import me.yll.thre.model.Videos;
import me.yll.thre.core.Service;

import java.util.List;


/**
 * Created by xubo on 2017/11/19.
 */
public interface VideosService extends Service<Videos> {
    List<Videos> getkeylist();//获取分组
    List<Videos> getlist(String videokeyword);
}
