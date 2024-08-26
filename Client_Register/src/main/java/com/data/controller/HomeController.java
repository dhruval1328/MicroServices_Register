package com.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.model.Student;
import com.data.serviceI.StudentI;

@RestController
public class HomeController {

	@Autowired
	StudentI si;
	
	@PostMapping("/reg")
	public String regdata(@RequestBody Student s) {
		
		si.saveStudent(s);
		return "success";
	}
	
	@PostMapping("/update/{pid}")
	public String updatedata(@PathVariable("pid")int p,@RequestBody Student s) {
		
		String pname = s.getPname();
		si.updatedata(p,pname);
		return "updated.";
	}
	
	@DeleteMapping("/del/{pid}")
	public String deldata(@PathVariable("pid") int p) {
		
		si.deleteData(p);
		return "delete success";
	}
}
