package uth.edu.service;

import java.util.List;
import uth.edu.pojo.Student;

public interface IStudentService {
    public List<Student> findAll();
    
    public void save(Student student);

    public void update(Student student);

    public void delete(int studentId);

    public Student findById(int studentId);
}