package com.example.demo.RestApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class empController {
    @Autowired
    demoRepo repo;
    @GetMapping(path = "/getdetails")
    public ResponseEntity<demoModel> empDetails(){
        List<demoModel> demoModel=repo.findAll();
        return new ResponseEntity<demoModel>((demoModel) demoModel,HttpStatus.OK);
    }
    @GetMapping(path="/getbyid/{id}")
    public ResponseEntity<demoModel> getbyid(@PathVariable("id") int id){
        Optional<demoModel> demoModel=repo.findById(id);
        return new ResponseEntity<demoModel>(demoModel.get(),HttpStatus.OK);
    }
    @PostMapping(path="/postEmp")
    public ResponseEntity<demoModel> saveEmp(@RequestBody demoModel demo){
       repo.save(demo);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(path="/putemp/{id}")
    public ResponseEntity<demoModel> editEmp(@PathVariable("id") int id, @RequestBody demoModel demo){
       Optional<demoModel> exisiting= repo.findById(id);
        demoModel d = exisiting.get();
       d.setName(demo.getName());
       d.setMarks(demo.getMarks());
       repo.save(d);
       return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(path="/delete/{id}")
    public ResponseEntity<demoModel> deletebyID(@PathVariable("id") int id){
        repo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(path = "/deleteall")
    public ResponseEntity<demoModel> delete(@RequestBody demoModel model){
        repo.delete(model);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}


