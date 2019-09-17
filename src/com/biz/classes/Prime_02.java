package com.biz.classes;

public class Prime_02 {

	public static void main(String[] args) {
		
		PrimeService pService = new PrimeService();
		
		
		/*
		 * 키보드로 숫자를 입력받아서
		 * 입력한 숫자가 -1이면 게임을 조료하고
		 * 그렇지 않으면 입력한 숫자를
		 * PrimeService.checkPrime() 메서드에게 보내서
		 * 소수인지 판별하는 게임
		 */
		while(true) {
		
		
		Scanner scanner = new Scanner(System.in); 
		System.out.print("숫자(-1 : 종료) >>");
		
		//정수로 변환
		String strNum = scanner.nextLine();
		
		
		int num = Integer.valueOf(strNum);
		
		//입력한숫자가 0보다 작으면 반복문 종료
		if(num < 0) break;
		
		pService.checkPrime (num);
		System.out.println("============================");
		
		

	}

}
