package com.labspringjpa.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/lab5")
public class LabController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    TeacherRepository teacherRepository;

    @GetMapping(path="/add") //
    public @ResponseBody String addUser (@RequestParam  String name, @RequestParam String
email) {
        User n = new User();
        n.setName (name);
        n.setEmail(email);
        userRepository.save(n);
        return "User Saved";
    }

    @GetMapping (path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }



    @GetMapping(path="/addTeacher") //
    public @ResponseBody String addTeacher (@RequestParam  String name,
        @RequestParam String email,
        @RequestParam String subject
    ) {
        Teacher t = new Teacher();
        t.setName(name);
        t.setEmail(email);
        t.setSubject(subject);
        teacherRepository.save(t);
        return "Teacher saved";
    }

    @GetMapping (path="/all/teacher")
    public @ResponseBody Iterable<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }



}