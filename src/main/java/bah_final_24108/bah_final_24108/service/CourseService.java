package bah_final_24108.bah_final_24108.service;

import bah_final_24108.bah_final_24108.model.Course;
import bah_final_24108.bah_final_24108.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    // new course
    public void createCourse(Course course) {
        courseRepository.save(course);
    }
    // find all courses
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
    // find one course
    public Course getOneCourse(Long courseId) {
        return courseRepository.findCourseByCourseId(courseId);
    }
    // update course
    public void modifyCourse(Course course) {
        courseRepository.save(course);
    }
    // delete course
    public void removeCourse(Long courseId) {
        courseRepository.deleteById(courseId);
    }
}
