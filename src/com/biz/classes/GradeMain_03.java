package com.biz.classes;

import com.biz.classes.grade.GradeNew;

public class GradeMain_03 {

	public static void main(String[] args) {
		
		// ************************************************************
		// 성적처리를 위하여 학생 7명의 객체를 선언, 생성,초기화하는 부분
		// ------------------------------------------------------------
		GradeNew grade01 = new GradeNew();
		GradeNew grade02 = new GradeNew();
		GradeNew grade03 = new GradeNew();
		GradeNew grade04 = new GradeNew();
		GradeNew grade05 = new GradeNew();
		GradeNew grade06 = new GradeNew();
		GradeNew grade07 = new GradeNew();
		
		
		
		// ********************************
		// 결과를 gradeList()로 출력하는 부분
		// ---------------------------------
	    // grade01 객체의 맴버변수에 값을 setting(할당) 한다
		// 변수에 값을 저장한다.
		grade01.strNum ="001";
		grade01.strName ="홍길동";
		
		grade01.intKor = 90;
		grade01.intEng = 88;
		grade01.intMath = 77;
			
	    grade02.strNum = "002";
		grade02.strName = "이몽룡";
		
		grade02.intKor = 90;
		grade02.intEng = 78;
		grade02.intMath = 68;
		
		grade03.strNum = "003";
		grade03.strName = "성춘향";
		
		grade03.intKor = 90;
		grade03.intEng = 78;
		grade03.intMath = 68;
		
		grade04.strNum = "004";
		grade04.strName = "4번학생";
		
		grade04.intKor = 44;
		grade04.intEng = 44;
		grade04.intMath = 44;
		
		grade05.strNum = "005";
		grade05.strName = "5번학생";
		
		grade05.intKor = 55;
		grade05.intEng = 55;
		grade05.intMath = 55;
		
		grade06.strNum = "006";
		grade06.strName = "6번학생";
		
		grade06.intKor = 66;
		grade06.intEng = 66;
		grade06.intMath = 66;
		
		grade07.strNum = "007";
		grade07.strName = "7번학생";
		
		grade07.intKor = 77;
		grade07.intEng = 77;
		grade07.intMath = 77;
		
		// ********************************
		// 결과를 gradeList()로 출력하는 부분
		// ---------------------------------
		System.out.println("===============================");
        System.out.println("응용SW반 성정표");
        System.out.println("--------------------------------");
        System.out.println("학번|t이름|t국어|t영어|t수학|t총점");
        System.out.println("----------------------------------")
        grade01.gradeList();
        grade02.gradeList();
        grade03.gradeList();
        grade04.gradeList();
        grade05.gradeList();
        grade06.gradeList();
        grade07.gradeList();
		System.out.println("======================================");
		
		
		// int intsum =grade01.intKor. + grade01.intEng + grade01.intMath;
		
		 // for(int i = 0; i < 3 ; i++) {
         // System.out.println("00" + i+1 + "학생의 성적");
         // System.out.println("국어" + grade01.intKor");
		 // System.out.println("수학" + grade01.intEng");
		 // System.out.println("영어" + grade01.intMath");
		 // }
			
		
				
