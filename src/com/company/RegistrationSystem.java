package com.company;

import com.company.Model.Course;
import com.company.Model.Student;
import com.company.Repository.CourseRepo;
import com.company.Repository.StudentRepo;
import com.company.Repository.TeacherRepo;

import java.util.List;

public class RegistrationSystem {
    private StudentRepo studentRepo;
    private TeacherRepo teacherRepo;
    private CourseRepo courseRepo;

    public RegistrationSystem(){
        this.studentRepo=new StudentRepo();
        this.teacherRepo=new TeacherRepo();
        this.courseRepo=new CourseRepo();
    }
    public boolean register(Course course, Student student){
        return false;
    }
    public List<Course> retrieveCoursesWithFreePlaces(){
        return null;
    }
    public List<Student> retrieveStudentsEnrolledForACourse(Course course){
        return null;
    }
    public List<Course> getAllCourses(){
        return null;
    }

}
