package me.yll.thre.dao;

import me.yll.thre.core.Mapper;
import me.yll.thre.model.Images;

import java.util.List;

public interface ImagesMapper extends Mapper<Images> {
    List<Images> getlistkey();
    List<Images> getlist(String imagekeyword);
}