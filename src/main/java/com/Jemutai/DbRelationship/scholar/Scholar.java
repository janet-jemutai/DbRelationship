package com.Jemutai.DbRelationship.scholar;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "scholar_details")
public class Scholar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public  Integer scholarCode;

    @Column(name = "name",nullable = false)
    public  String name;

    @Column(name = "school_name")
      public  String schoolName;


@Column (name = "form",nullable = false)
     @Enumerated(EnumType.ORDINAL)
      public  Form form;

//@Column(name = "results")
//      public  Results results;
//    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinTable(name = "student_subject",
//            joinColumns = @JoinColumn(name = "student_id"),
//            inverseJoinColumns = @JoinColumn(name = "subject_id"))
//    private Set<Subjects> subjects = new HashSet<>();

}
