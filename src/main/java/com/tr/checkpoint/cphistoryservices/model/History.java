package com.tr.checkpoint.cphistoryservices.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table
public class History {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column private Long userId;

  @Column private String userName;

  @Column private String type;

  @Column private String event;

  @Column private String information;

  @Column private Date searchedOn;
}
