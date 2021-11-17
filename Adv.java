package com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Adv {

	public static void main(String[] args) throws Exception  {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter text Data  ");
    String data = br.readLine();
    
    System.out.println("Enter the same text data again ");
    int val = br.read();
    
    System.out.println("readline()  "+data);
    System.out.println("read()  "+val+"["+(char)val+"]");
	}

}
