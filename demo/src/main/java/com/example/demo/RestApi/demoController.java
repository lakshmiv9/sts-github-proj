package com.example.demo.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class demoController {
	@Autowired
	demoRepo repo;
	
@GetMapping("/api/welcome")
public String testmethod() {
	String abc="WELCOME";
	return abc;
}
@GetMapping("/api/entitylist")
public ResponseEntity<demoModel> getList(){
	demoModel getall=(demoModel) repo.findAll();
	return new ResponseEntity<demoModel>(getall,HttpStatus.OK);
}

@GetMapping("/api/normallist")
public List<demoModel> getnormalList(){
	List<demoModel> getall= repo.findAll();
	return getall;
}

@GetMapping("/api/normalselectlist/{id}")
public List<demoModel> getnormalselectList(@PathVariable("id") int id){
	List<demoModel> getall= (List<demoModel>) repo.getById(Integer.valueOf(id));
	return getall;
}

@PostMapping("/api/normalpostlist")
public demoModel postid(@RequestBody demoModel demo) {
	demo.setId(1);
	demo.setName("lakshmi");
	demo.setMarks(100);
	return repo.save(demo);
}
@PostMapping("/api/normalputemp/{id}")
public demoModel putvalue(@PathVariable("id") int id, @RequestBody demoModel model) {
	
	demoModel demo=repo.getById(Integer.valueOf(id));
	demo.setMarks(model.getMarks());
	demo.setName(model.getName());
	
	return repo.save(demo);
}

@DeleteMapping("/api/deletermp/{id}")	
public void deletebyID(@PathVariable("id") int id) {
	
	repo.deleteById(Integer.valueOf(id));
}
@DeleteMapping("/api/deletermp/")	
public void deletebyID(@RequestBody demoModel demo) {
	
	repo.delete(demo);
	
}
}
