package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.Service.GuideService;
import com.project.Entity.Guide;

import java.util.List;

@RestController
public class GuideController {
	
	@Autowired
	private GuideService guideService;
	
	@GetMapping("/guides")
	public List<Guide> getGuides(){
		List<Guide> guides = this.guideService.getAllGuides();
		return guides;
	}
	
	@GetMapping("/guide")
	public Guide getGuide(@RequestParam String name){
		Guide guide = this.guideService.getGuideByName(name);
		return guide;
	}


}
