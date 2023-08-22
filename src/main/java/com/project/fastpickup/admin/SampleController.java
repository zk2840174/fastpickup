package com.project.fastpickup.admin;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2

@RequestMapping("/admin")
public class SampleController {


    @GetMapping("/ex1")
    public void ex1() {

        log.info("-----------------------------------");
    }
}
