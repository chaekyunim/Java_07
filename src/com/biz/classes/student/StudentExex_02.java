package com.biz.classes.student;

public class StudentExex_02 {

	public static void main(String[] args) {
		
		StudentVO stVO = new StudentVO();
		
		stVO.strNum = "001";
//		stVO.strName = "홍길동";
		
		stVO.intYear = 2012;
		stVO.strDept = "법학";
		
		// view() 메서드를 홎\출할때
		// (올해)연도를 포함하면
		// 연도에따라 나이를 
		// 자동 계산해서 보여주면 좋겠다.
//		stVO.view(2020);		
		

	}

}
