package com.techsonnet.pojo;

import lombok.Data;

import java.util.List;
@Data
public class Classes {
    public Integer classesNum;
    private String classesName;
    private List<Student> students;
}
