package com.example.color.studentservice2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.color.studententity2.studentent;
import com.example.color.studentrepos2.studentrep;
	@Service
	public class studentser {
		@Autowired
		studentrep stRepo;
		
		public studentent saveDetails(studentent e) {
			return stRepo.save(e);
		}
		
		public List<studentent> getDetails(){
			return stRepo.findAll();
		}
		
		public studentent updateDetails(studentent e1) {
			return stRepo.saveAndFlush(e1);
		}
		
		public void deleteDetails(int id) {
			stRepo.deleteById(id);
		}

	}

