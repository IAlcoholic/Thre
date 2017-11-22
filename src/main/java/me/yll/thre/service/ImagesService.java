package me.yll.thre.service;
import me.yll.thre.model.Images;
import me.yll.thre.core.Service;

import java.util.List;


/**
 * Created by yll on 2017/11/19.
 */
public interface ImagesService extends Service<Images> {
    List<Images> getkeylist();//获取分组
    List<Images> getlist(String imagekeyword);
    List<Images> mylist(Integer userid);
}
