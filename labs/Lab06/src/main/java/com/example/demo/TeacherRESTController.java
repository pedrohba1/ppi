package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/teacher")
public class TeacherRESTController {
    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping
    public List<Teacher> findAllTeachers() {
        return (List<Teacher>) teacherRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Teacher> findTeacherById(@PathVariable(value = "id") long id) {
        Optional<Teacher> teacher = teacherRepository.findById(id);

        if(teacher.isPresent()) {
            return ResponseEntity.ok().body(teacher.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Teacher saverTeacher(@Validated @RequestBody Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTeacher(@PathVariable(value = "id") long id) {
        Optional<Teacher> Teacher = teacherRepository.findById(id);

        if(Teacher.isPresent()) {
            teacherRepository.deleteById(id);
            return ResponseEntity.ok().body("Deleted");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public Teacher putTeacher(@PathVariable(value = "id") long id, @RequestBody Teacher teacherData) {
        Optional<Teacher> teacher = teacherRepository.findById(id);


        if (teacherData.getName() != null) teacher.get().setName(teacherData.getName());
        if (teacherData.getSubject() != null) teacher.get().setSubject(teacherData.getSubject());
        if (teacherData.getEmail() != null)teacher.get().setEmail(teacherData.getEmail());
        return teacherRepository.save(teacher.get());

    }

}
