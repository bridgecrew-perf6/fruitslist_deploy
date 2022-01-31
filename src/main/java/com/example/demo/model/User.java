package com.example.demo.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
	
	@NotNull
	@Min(1)
	@Max(100)
	private Integer id;
	public int getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@NotBlank
	@Length(min = 1, max = 20)
	private String name;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@NotNull
	@Min(1)
	@Max(1000)
	private Integer price;
	public int getPrice() {
		return price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
}
