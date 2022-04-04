package com.example;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface TestMapper {
    List<portfolio> getAllDataList();
}