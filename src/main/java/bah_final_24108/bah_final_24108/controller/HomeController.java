package bah_final_24108.bah_final_24108.controller;
import bah_final_24108.bah_final_24108.model.Course;
import bah_final_24108.bah_final_24108.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.HttpSession;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    private final CourseService courseService;

    @Autowired
    public HomeController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public String createStudentForm(Model model, HttpSession session) {
        List<Course> courseList = courseService.getAllCourses();
        model.addAttribute("courseList", courseList);
        model.addAttribute("session", session);
        return "index";
    }
}
