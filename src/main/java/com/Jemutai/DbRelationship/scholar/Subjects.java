//package com.Jemutai.DbRelationship.scholar;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Data
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//
//public class Subjects {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//
//    private  String  code;
//    private  String name;
//@Enumerated(EnumType.STRING)
//    private  Grade grade;
//    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "subjects")
//    private Set<Scholar> scholars = new HashSet<>();
//}
