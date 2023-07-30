package com.ClassSchedulingBackendRestApi.classScheduling.repository;

import com.ClassSchedulingBackendRestApi.classScheduling.model.Student;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentsRepository extends JpaRepository<Student, Long> {

    @Query("SELECT S FROM Student S WHERE S.section=:section")
    List<Student> getAllStudent(@Param("section") int section);

    @Query(value = "SELECT S FROM Student S")
    List<Student> findAllTEST(Sort sort);

    @Query("SELECT S FROM Student S WHERE S.section=:section ORDER BY S.lastName")
    List<Student> getAllSortByLastnameASC(@Param("section") int section);

    @Query("SELECT S FROM Student S WHERE S.section=:section ORDER BY S.lastName DESC")
    List<Student> getAllSortByLastnameDESC(@Param("section") int section);



    @Query("SELECT S FROM Student S WHERE S.section=:section ORDER BY S.firstName ASC")
    List<Student> getAllSortByFirstnameASC(@Param("section") int section);
    @Query("SELECT S FROM Student S WHERE S.section=:section ORDER BY S.firstName DESC")
    List<Student> getAllSortByFirstnameDESC(@Param("section") int section);



    @Query("SELECT S FROM Student S WHERE S.section=:section ORDER BY S.email ASC")
    List<Student> getAllSortByEmailASC(@Param("section") int section);
    @Query("SELECT S FROM Student S WHERE S.section=:section ORDER BY S.email DESC")
    List<Student> getAllSortByEmailDESC(@Param("section") int section);
//    List<Student> findAllById(int i);
}
