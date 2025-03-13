package com.advpro.profiling.tutorial.repository;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author muhammad.khadafi
 */
@Repository
public interface StudentCourseRepository extends JpaRepository<StudentCourse, Long> {
    @Query("SELECT scou FROM StudentCourse scou "
            + "LEFT JOIN FETCH scou.student "
            + "LEFT JOIN FETCH scou.course")
    List<StudentCourse> findAllWithStudentAndCourse();
}