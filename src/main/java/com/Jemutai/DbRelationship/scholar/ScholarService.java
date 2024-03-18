package com.Jemutai.DbRelationship.scholar;

import com.Jemutai.DbRelationship.customResponse.CustomResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScholarService {

    private  final  ScholarRepo scholarRepo;

public CustomResponse<?> addScholar(Scholar scholar){
   CustomResponse<Scholar> response = new CustomResponse<>();

   try {

       scholar = scholarRepo.save(scholar);

       response.setMessage("Scholar added succesfully");
       response.setStatusCode(HttpStatus.CREATED.value());
       response.setSuccess(true);
       response.setPayLoad(scholar);

   }
   catch (Exception e){

       response.setMessage("Scholar not added succesfully"+e.getMessage());
       response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
       response.setSuccess(false);
       response.setPayLoad(null);
   }
   return  response;
}

    public CustomResponse<?> findAllScholars() {
    CustomResponse<List<Scholar>>response = new CustomResponse<>();

    try {
        List<Scholar>scholars = scholarRepo.findAll();

        response.setMessage("List of students is as shown");
        response.setPayLoad(scholars);
        response.setSuccess(true);
        response.setStatusCode(HttpStatus.FOUND.value());
    }
    catch (Exception e){

        response.setMessage("an error occured "+e.getMessage());
        response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        response.setPayLoad(null);
        response.success =false;
    }

    return  response;


    }
}
