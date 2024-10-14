package com.ait.in;

import java.util.Optional;

public class User {
	public Optional<String> getUserName(int Id){
	   String name =null;
	   if(Id ==100) {
		   name ="Raju";
	   } else if (Id ==101) {
		   name = "Rani";
	   }else if(Id ==102) {
		   name ="John";
	   }
	   return Optional.ofNullable(name);
	}
}
