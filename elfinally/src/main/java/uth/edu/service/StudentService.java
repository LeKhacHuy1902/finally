package uth.edu.service;

import java.util.List;
import uth.edu.dao.StudentDAO;
import uth.edu.pojo.Student;

public class StudentService implements IStudentService {
    private StudentDAO studentDAO;

    public StudentService(String persistenceName) {
        studentDAO = new StudentDAO(persistenceName);
    }

    @Override
    public void save(Student student) {
        studentDAO.save(student);
    }

    @Override
    public List<Student> findAll() {
        return studentDAO.getStudents();
    }

    @Override
    public void update(Student student) {
        studentDAO.update(student);
    }

    @Override
    public void delete(int studentId) {
        studentDAO.delete(studentId);
    }
}