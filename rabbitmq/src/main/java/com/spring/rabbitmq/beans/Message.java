package com.spring.rabbitmq.beans;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class Message 
{
   private String Id;
   private String message;
   private Date meassageDate;
   
  public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public Date getMeassageDate() {
	return meassageDate;
}
public void setMeassageDate(Date meassageDate) {
	this.meassageDate = meassageDate;
}
 //this bean class  
   
}
