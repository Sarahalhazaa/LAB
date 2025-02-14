package com.example.lab10.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class JobApplication {

   @NotEmpty
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(columnDefinition = "not null")
    private Integer id ;

    @NotEmpty
  //  @Column(columnDefinition = "not null")
    private Integer userId ;

    @NotEmpty
  //  @Column(columnDefinition = "not null")
    private Integer jobPostId ;


}
