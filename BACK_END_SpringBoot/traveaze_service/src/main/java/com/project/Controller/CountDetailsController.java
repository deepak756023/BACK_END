package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entity.CountDetails;
import com.project.Service.CountDetailsService;

import java.util.List;

@RestController
public class CountDetailsController {

    @Autowired
    private CountDetailsService countDetailsService;

    @GetMapping("/count-details")
    public List<CountDetails> getCountDetails() {
        return countDetailsService.getCountDetails();
    }
}

