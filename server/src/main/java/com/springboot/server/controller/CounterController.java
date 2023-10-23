package com.springboot.server.controller;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CounterController {

    int count = 0;

    @RequestMapping("/counter")
    public int getCounter(HttpSession session){

        if(session.getAttribute("count") == null){
            session.setAttribute("count", 0);
        }
        else {
            session.setAttribute("count", count += 1);
        }
        count = (int) session.getAttribute("count");
        System.out.println(count);
        return count;
    }
}
