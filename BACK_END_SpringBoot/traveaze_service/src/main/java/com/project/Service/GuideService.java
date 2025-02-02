package com.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Entity.Guide;
import com.project.repo.GuideRepository;

@Service
public class GuideService {

    @Autowired
    private GuideRepository guideRepository;

    public List<Guide> getAllGuides() {
        return guideRepository.findAll();
    }
    

	public Guide getGuideByName(String name) {
		// TODO Auto-generated method stub
		return guideRepository.findByName(name);
	}
}

