package me.yll.thre.service.impl;

import me.yll.thre.dao.VideosMapper;
import me.yll.thre.model.Images;
import me.yll.thre.model.Videos;
import me.yll.thre.service.VideosService;
import me.yll.thre.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by yll on 2017/11/19.
 */
@Service
@Transactional
public class VideosServiceImpl extends AbstractService<Videos> implements VideosService {
    @Resource
    private VideosMapper videosMapper;

    @Override
    public List<Videos> getkeylist() {
        return videosMapper.getlistkey(  );
    }

    @Override
    public List<Videos> getlist(String videokeyword) {
        System.out.println( "查询字段"+videokeyword );
        return videosMapper.getlist(videokeyword);
    }

    @Override
    public List<Videos> mylist(Integer userid) {
        return videosMapper.mylist( userid );
    }


}
