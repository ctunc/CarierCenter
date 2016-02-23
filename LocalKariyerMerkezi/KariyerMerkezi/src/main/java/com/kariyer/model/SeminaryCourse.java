package com.kariyer.model;

import java.util.Date;

import lombok.Data;

@Data
public class SeminaryCourse {

	private String name;
	private Date startDate;
	private Date endDate;
	private String explanation;
	private Long sumHours;
	
}
