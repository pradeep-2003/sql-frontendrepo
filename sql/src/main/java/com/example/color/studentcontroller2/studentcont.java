package com.example.color.studentcontroller2;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.color.studententity2.studentent;
import com.example.color.studentservice2.studentser;

@CrossOrigin
@RestController

public class studentcont {

	@Autowired
	studentser stuservice;
	
	@PostMapping("post")
	public studentent addInfo(@RequestBody studentent st) {
		return stuservice.saveDetails(st);
	}
	@GetMapping("get")
	public List<studentent> fetchDetails(){
		return stuservice.getDetails();
	}
	
	@PutMapping("update")
	public studentent updateInfo(@RequestBody studentent st1) {
		return stuservice.updateDetails(st1);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteInfo(@PathVariable("id") int id) {
		stuservice.deleteDetails(id);
		return "Deleted Details";
	}

}

