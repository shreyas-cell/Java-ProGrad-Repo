package com.p;

public class CustomWrapperClassEx {
	
private int i; 

CustomWrapperClassEx(){
	
}  

CustomWrapperClassEx(int i){  
	this.i=i;  
}  

public int getValue(){  
	return i;  
}  

public void setValue(int i){  
	this.i=i;  
}  

@Override  
public String toString() {  
	  return Integer.toString(i);  
} 

}
