package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entity.CountDetails;
import com.project.repo.CountDetailsRepository;

import java.util.List;

@Service
public class CountDetailsService {

    @Autowired
    private CountDetailsRepository countDetailsRepository;

    public List<CountDetails> getCountDetails() {
        return countDetailsRepository.findAll();
    }
}

