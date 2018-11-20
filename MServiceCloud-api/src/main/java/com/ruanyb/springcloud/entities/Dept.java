package com.ruanyb.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable{
	
	private long deptNo;
	
	private String dname;
	
	private String dbSource;
	
}
