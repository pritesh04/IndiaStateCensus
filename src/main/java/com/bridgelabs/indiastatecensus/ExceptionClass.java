package com.bridgelabs.indiastatecensus;
@SuppressWarnings("serial")
public class ExceptionClass extends Exception {	
		ExceptionType type;
		public ExceptionClass(String message,ExceptionType type) {
	        super(message);
	        this.type=type;
		}
		
		enum ExceptionType{
			Parse_Error,File_Not_Found
		}
}