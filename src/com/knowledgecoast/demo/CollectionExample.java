package com.knowledgecoast.demo;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class CollectionExample {

	public static void main(String[] args) {
       CollectionExample colEx = new CollectionExample();
       colEx.serialize();
	}
	
	
	public void serialize(){
		
		// instantiate Gson
		Gson gson = new Gson();

		// convert list of strings to JSON
		List<String> strList = new  ArrayList<String>();
	}
	
	
	public void deserialize(){
		
	}

}
