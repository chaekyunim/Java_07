package com.biz.classes.student;

public class StudentVO {
	
	public String strNum;
//	public string strName;
	public int intYear;
	public String strDept;
	
	
	public void view(int intCurYear) {
		
		System.out.println("학번 : " + strNum);
//		System.out.println("이름 : " + strName);
		System.out.println("생년 : " + intYear);
		System.out.println("전공 : " + strDept);
		System.out.println("나이 : " 
		             + (intYear - intCurYear) );
	}

}
