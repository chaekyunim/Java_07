package com.biz.classes.grade;

public class StaticGrade {

/*
 * 어떤 class를 만들고
 * 맴버변수, 메서드에
 * 한개라도 static 이라는 키워드를 붙이면
 * class가 static class가 된다.
 * static class가 된다는 것
 * - 프로젝트를 RUM(컴파일 후 실행)하면
 *   JVM이 자도으로 클래스르 선언, 생성, 초기화하여
 *   사용할수 있도록 미리 준비시켜준다느 개념
 */
	// 맴버변수 들
	public static String strNum; 
	public static String strName; 
	public static int intKor;
	public static int intEng;
	public static int intMath;

	public static void sum() {
		// StaticGrade 클래스의
		// sum() 메서드의 몸체부분
		
		// int sum = intKor + intEng + intMath
	    
				
	}
}
