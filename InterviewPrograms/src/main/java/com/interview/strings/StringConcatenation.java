package com.interview.strings;


public class StringConcatenation {
	
	public String concat(){
	String aStudent = "James Bond";
	String aGrade = "A";
	StringBuffer strBuf = new StringBuffer();
	strBuf.append(aStudent);
	strBuf.append("received a grade of");
	strBuf.append(aGrade);
	System.out.println (strBuf);
	
	return strBuf.toString();
	}
}
