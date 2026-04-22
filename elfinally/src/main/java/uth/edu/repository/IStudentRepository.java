package uth.edu.repository;

import java.util.List;
import uth.edu.pojo.Student;

public interface IStudentRepository {
    void save(Student student);
    List<Student> findAll();
    void delete(int studentID);
    Student findById(int studentID);
    void update(Student student);
}
