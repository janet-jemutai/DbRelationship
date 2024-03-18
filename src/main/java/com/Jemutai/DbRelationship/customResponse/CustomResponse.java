package com.Jemutai.DbRelationship.customResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomResponse <T>{

    public  String message;
    public  int statusCode= HttpStatus.OK.value();
    public  boolean success=true;
    T payLoad;
}
