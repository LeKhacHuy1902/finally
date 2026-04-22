package uth.edu.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import uth.edu.pojo.Student;
import uth.edu.service.IStudentService;
import uth.edu.service.StudentService;

@Controller
public class HomeController {
    private IStudentService iStudentService;

    public HomeController() {
        iStudentService = new StudentService("JPAs");
    }

    @RequestMapping(value = "/")
    public ModelAndView showStudent(HttpServletResponse response) throws IOException {
        ModelAndView model = new ModelAndView("home");
        List<Student> studentList = iStudentService.findAll();
        model.addObject("studentList", studentList);
        return model;
    }

    @RequestMapping(value = "/manageStudent")
    public String manageStudent(HttpServletRequest request) throws IOException {
        String type = request.getParameter("btnManageStudent");
        int StudentID = Integer.parseInt(request.getParameter("txtID"));
        String firstName = request.getParameter("txtFirstName");
        String lastName = request.getParameter("txtLastName");
        int mark = Integer.parseInt(request.getParameter("txtMark"));
        
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setMarks(mark);

        switch (type) {
            case "add":
                iStudentService.save(student);
                break;
            case "update":
                student.setId(StudentID);
                iStudentService.update(student);
                break;
            case "delete":
                iStudentService.delete(StudentID);
                break;
        }
        return "redirect:/";
    }
}
