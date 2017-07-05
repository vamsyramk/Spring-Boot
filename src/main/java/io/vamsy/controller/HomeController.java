package io.vamsy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vamsyramk on 7/4/2017.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "It is the home page of the application";
    }
}
