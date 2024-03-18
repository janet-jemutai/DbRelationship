package com.Jemutai.DbRelationship.scholar;

import com.Jemutai.DbRelationship.customResponse.CustomResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/scholar")
public class ScholarController {

    private  final ScholarService scholarService;


    @PostMapping("/add-scholar")

    public  ResponseEntity<CustomResponse<?>> addScholar(@RequestBody Scholar scholar){
        CustomResponse<?> response = scholarService.addScholar(scholar);
        return ResponseEntity.status(response.getStatusCode()).body(response);

    }

    @GetMapping

    public  ResponseEntity<CustomResponse<?>>findScholars(){
        CustomResponse<?> response =scholarService.findAllScholars();
        return  ResponseEntity.status(response.getStatusCode()).body(response);
    }

//    public ResponseEntity<CustomResponse<?>> addEmployee(@RequestBody Employee employee) {
//        CustomResponse<?> response = employeeService.addEmployee(employee);
//        return ResponseEntity.status(response.getStatusCode()).body(response);
}
