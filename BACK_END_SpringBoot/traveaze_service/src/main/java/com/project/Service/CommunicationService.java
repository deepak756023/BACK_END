package com.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.Entity.Communication;

import com.project.repo.CommunicationRepository;


@Service
public class CommunicationService {

	@Autowired
	private CommunicationRepository communicationRepository;
	
	public List<Communication> getAllCommunications(){
		return this.communicationRepository.findAll();
	}
	
//	public Communication getAllCommunication(int id){
//		return this.communicationRepository.findByComId(id);
//	}
	
	 public List<String> getCommunicationNamesByCityId(int cityId) {
	        return communicationRepository.findNameByCityId(cityId);
	    }
	
}
