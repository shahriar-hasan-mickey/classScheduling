package com.ClassSchedulingBackendRestApi.classScheduling.controller;

import com.ClassSchedulingBackendRestApi.classScheduling.model.Student;
import com.ClassSchedulingBackendRestApi.classScheduling.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin (origins = "*" , exposedHeaders = "*")
@RequestMapping(method = {RequestMethod.GET, RequestMethod.OPTIONS})
@RestController
public class JwtProjectController {

    @Autowired
    private StudentsRepository studentsRepository;


    @CrossOrigin(origins = "*")
//    @GetMapping({"/jwtProject"})
    @RequestMapping(value = "/jwtProject", method = {RequestMethod.GET, RequestMethod.OPTIONS})
    public String firstPage(){
        return "Hello World from JWT PROJECT";
    }

    @GetMapping("/View_Class_Schedule_With_Enrollment")
    List<Student> getAll(){
        return studentsRepository.findAll();
    }

    @GetMapping(path="/filterbySection/{section}")      //TODO:    https://www.youtube.com/watch?v=J8Q0wNL9xVU&pp=ygUqaG93IHRvIHRha2UgdmFsdWUgZnJvbSB1cmwgaW4gc3ByaW5nIGJvb3Qg
    List<Student> getAllST(@PathVariable int section){
        return studentsRepository.getAllStudent(section);
    }


    @GetMapping(path="/filterbySection/sortByLastnameASC/{section}")
    List<Student> getAllSortByLastnameASC(@PathVariable int section){
        return studentsRepository.getAllSortByLastnameASC(section);
    }

    @GetMapping(path="/filterbySection/sortLastnameDESC/{section}")
    List<Student> getAllSortByLastnameDESC(@PathVariable int section){
        return studentsRepository.getAllSortByLastnameDESC(section);
    }

    @GetMapping(path="/filterbySection/sortByFirstnameASC/{section}")
    List<Student> getAllSortByFirstnameASC(@PathVariable int section){
        return studentsRepository.getAllSortByFirstnameASC(section);
    }

    @GetMapping(path="/filterbySection/sortByFirstnameDESC/{section}")
    List<Student> getAllSortByFirstnameDESC(@PathVariable int section){
        return studentsRepository.getAllSortByFirstnameDESC(section);
    }

    @GetMapping(path="/filterbySection/sortByEmailASC/{section}")
    List<Student> getAllSortByEmailASC(@PathVariable int section){
        return studentsRepository.getAllSortByEmailASC(section);
    }

    @GetMapping(path="/filterbySection/sortByEmailDESC/{section}")
    List<Student> getAllSortByEmailDESC(@PathVariable int section){
        return studentsRepository.getAllSortByEmailDESC(section);
    }





    @GetMapping("/sortByLastnameASC")
    List<Student> findBySortingLastnameASC(){ return studentsRepository.findAll(Sort.by(Sort.Direction.ASC, "lastName")); }

    @GetMapping("/sortByFirstnameASC")
    List<Student> findBySortingFirstnameASC(){ return studentsRepository.findAll(Sort.by(Sort.Direction.ASC, "firstName")); }



    @GetMapping("/sortByLastnameDESC")
    List<Student> findBySortingLastnameDESC(){ return studentsRepository.findAll(Sort.by(Sort.Direction.DESC, "lastName")); }

    @GetMapping("/sortByFirstnameDESC")
    List<Student> findBySortingFirstnameDESC(){ return studentsRepository.findAll(Sort.by(Sort.Direction.DESC, "firstName")); }



    @GetMapping("/sortByEmailASC")
    List<Student> findBySortingEmailASC(){ return studentsRepository.findAll(Sort.by(Sort.Direction.ASC, "email")); }

    @GetMapping("/sortByEmailDESC")
    List<Student> findBySortingEmailDESC(){ return studentsRepository.findAll(Sort.by(Sort.Direction.DESC, "email")); }



    @GetMapping("/sortBySidASC")
    List<Student> findBySortingSidASC(){ return studentsRepository.findAll(Sort.by(Sort.Direction.ASC, "sid")); }

    @GetMapping("/sortBySidDESC")
    List<Student> findBySortingSidDESC(){ return studentsRepository.findAll(Sort.by(Sort.Direction.DESC, "sid")); }



    @GetMapping("/sortBySectionASC")
    List<Student> findBySortingSectionASC(){ return studentsRepository.findAll(Sort.by(Sort.Direction.ASC, "section")); }

    @GetMapping("/sortBySectionDESC")
    List<Student> findBySortingSectionDESC(){ return studentsRepository.findAll(Sort.by(Sort.Direction.DESC, "section")); }


    @GetMapping("/test")
    List<Student> find(){return studentsRepository.findAllTEST(Sort.by("lastName"));}

}
