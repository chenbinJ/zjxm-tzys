package com.springboot.mapper;

import com.springboot.popj.ExceptionRecord;
import org.springframework.stereotype.Component;

@Component
public interface ExceptionRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(ExceptionRecord record);

    int insertSelective(ExceptionRecord record);

    ExceptionRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ExceptionRecord record);

    int updateByPrimaryKey(ExceptionRecord record);
}