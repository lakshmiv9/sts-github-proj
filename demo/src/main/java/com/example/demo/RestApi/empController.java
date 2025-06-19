package com.example.demo.RestApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.module.ResolutionException;
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
            if (id <= 0) { //below error redirects to globalexception handler and then handled
                throw new InvalidInputException("Invalid ID: ID must be a positive number");
            }
            Optional<demoModel> demoModel = repo.findById(id);
            return new ResponseEntity<demoModel>(demoModel.get(), HttpStatus.OK);

    }
    @PostMapping(path="/postEmp")
    public ResponseEntity<demoModel> saveEmp(@RequestBody demoModel demo){
       repo.save(demo);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(path="/putemp/{id}")
    public ResponseEntity<demoModel> editEmp(@PathVariable("id") int id, @RequestBody demoModel demo){
       Optional<demoModel> exisiting= repo.findById(id);
        if (!exisiting.isPresent()) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        demoModel d = exisiting.get();
       d.setName(demo.getName());
       d.setMarks(demo.getMarks());
       repo.save(d);
       return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(path="/delete/{id}")
    public ResponseEntity<?> deletebyID(@PathVariable("id") int id){
        try{
        repo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
        }catch(InvalidInputException e){ //below error is handled directly- not recommended
            ErrorResponse error=new ErrorResponse("invalid input",e.getMessage());
            return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);

        }
    }

    @DeleteMapping(path = "/deleteall")
    public ResponseEntity<String> delete(@RequestBody demoModel model){
        repo.delete(model);
        return new ResponseEntity<>("Deleted", HttpStatus.valueOf(200));
    }

}


