package me.yll.thre.service.impl;

import me.yll.thre.dao.ImagesMapper;
import me.yll.thre.model.Images;
import me.yll.thre.service.ImagesService;
import me.yll.thre.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by xubo on 2017/11/19.
 */
@Service
@Transactional
public class ImagesServiceImpl extends AbstractService<Images> implements ImagesService {
    @Resource
    private ImagesMapper imagesMapper;


    @Override
    public List<Images> getkeylist() {
        return imagesMapper.getlistkey(  );
    }

    @Override
    public List<Images> getlist(String imagekeyword) {
        System.out.println( "查询字段"+imagekeyword );
        return imagesMapper.getlist(imagekeyword);
    }
}
