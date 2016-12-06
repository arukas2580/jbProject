package com.example.jorugiBoard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.jorugiBoard.model.JorugiTable;

/**
 * Created by maxwell on 2015-11-11.
 */
@Mapper
public interface JorugiTableMapper {
    List<JorugiTable> getJorugiAll();
}
