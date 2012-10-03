package com.knowledgecoast.demo;

import com.google.gson.Gson;

public class PrimitiveExample {

	public static void main(String[] args) {
		PrimitiveExample primitive = new PrimitiveExample();
		System.out.println("serialize to json");
		System.out.println("--------------------------------");
		primitive.serialize();
		
		System.out.println("\n\ndeserialize to objects");
		System.out.println("--------------------------------");
		primitive.dezerialize();

	}


	public void serialize(){

		// instantiate Gson
		Gson gson = new Gson();

		// convert int/Integer to JSON
		System.out.println( gson.toJson(100) );
		System.out.println( gson.toJson(new Integer(100)) );

		// convert Float to JSON
		System.out.println( gson.toJson(12.34f) );
		System.out.println( gson.toJson(new Float(12.34)) );

		// convert Double to JSON
		System.out.println( gson.toJson(56.78) );
		System.out.println( gson.toJson(new Double(56.78)) );

		// convert String to JSON
		System.out.println( gson.toJson( "knowledgecoast" ) );
		System.out.println( gson.toJson(new String("knowledgecoast")) );

		// convert boolean to JSON
		System.out.println( gson.toJson( true ) );
		System.out.println( gson.toJson(new Boolean(false) ));

		// convert null values to JSON
		Object obj = null;
		System.out.println( gson.toJson( obj ) );
		System.out.println( gson.toJson( null ));

	}


	public void dezerialize(){

		// instantiate Gson
		Gson gson = new Gson();

		// convert JSON string to int
		String jsonStr = "100";
		Integer intValue = gson.fromJson(jsonStr, Integer.class);
		System.out.println(intValue);

		// convert JSON string to Float
		jsonStr = "12.34";
		Float floatValue = gson.fromJson(jsonStr, Float.class);
		System.out.println(floatValue);

		// convert JSON string to Double
		jsonStr = "56.78";
		Double doubleValue = gson.fromJson(jsonStr, Double.class);
		System.out.println(doubleValue);

		// convert JSON string to String object
		jsonStr = "knowledgecoast";
		String strValue = gson.fromJson(jsonStr, String.class);
		System.out.println(strValue);

		// convert JSON string to boolean 
		jsonStr = "true";
		Boolean boolValue = gson.fromJson(jsonStr, Boolean.class);
		System.out.println(boolValue);
		
		// convert JSON string to null 
		jsonStr = "null";
		Object nullRef = gson.fromJson(jsonStr, Object.class);
		System.out.println(nullRef);
	}

}
