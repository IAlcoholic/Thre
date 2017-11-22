package me.yll.thre.dao;

import me.yll.thre.core.Mapper;
import me.yll.thre.model.Images;
import me.yll.thre.model.Videos;

import java.util.List;

public interface VideosMapper extends Mapper<Videos> {
    List<Videos> getlistkey();
    List<Videos> getlist(String videokeyword);
    List<Videos> mylist(Integer userid);
}