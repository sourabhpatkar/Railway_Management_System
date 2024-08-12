package com.app.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "railways")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Railway {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Rid")
	private Long id;
	
	@Column(unique = true)
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Category category;
	
	private Time departueTime;
	
	private Time ArrivalTime;
	
	private String source;
	
	private String destination;
	
	private int stationCode;
	
	private int distance;
	
	private int frequency;


}
