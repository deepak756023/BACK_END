package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.Entity.Communication;
import com.project.Service.CommunicationService;

@RestController
public class CommunicationController {

	@Autowired
	private CommunicationService communicationService;
	
	@GetMapping("/communications")
	public List<Communication> getCommunications(){
		List<Communication> communications = communicationService.getAllCommunications();
		return communications;
	}
	
//	@GetMapping("/communications_city")
//	public Communication getCommunication(@RequestParam int id){
//		Communication communication = communicationService.getAllCommunication(id);
//		return communication;
//	}
	
	@GetMapping("/names")
    public List<String> getCommunicationNamesByCityId(@RequestParam int cityId) {
        return communicationService.getCommunicationNamesByCityId(cityId);
    }
}
