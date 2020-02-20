package com.neuedu.student.service;

import com.neuedu.student.bean.Student;
import com.neuedu.student.dao.IstudentDao;
import com.neuedu.student.dao.StudentDao;

import java.util.List;

public class StudentService implements IstudentService{
    IstudentDao istudentDao = new StudentDao();
    @Override
    public List<Student> query() {
        return istudentDao.query();
    }

    @Override
    public int add(Student student) {
        return istudentDao.add(student);
    }

    @Override
    public int update(Student student) {
        return istudentDao.update(student);
    }

    @Override
    public int del(int id) {
        return istudentDao.del(id);
    }

    @Override
    public Student queryOne(int id) {
        return null;
    }
}
