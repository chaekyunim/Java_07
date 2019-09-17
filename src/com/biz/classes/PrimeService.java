package com.biz.classes;

public class PrimeService {
    
	
	/*
	 * main() 메서드에서
	 * PrimeService.checkPrime(숫자) 형식으로 값을
	 * 보내면 num1 변수에 그 값을 받는다
	 * num1 변수에 잇는 값이 prime 인지 검사한다
	 * 
	 */

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 >> ");
		String strNum = scanner.nextLine();
		
		int num = Integer.valueOf(strNum);
		
		int intnum = 13;
		
		int indes;
		int index;
		for(index = 2 ; index < num ;index++) {
			if(num % index == 0) break;
		} 	
		if(index >= num) {
			System.out.println(num + "는 소수(Prime)이다!! ");
			
			else {
			System.out.println(num + "는 소수가 아니다!! ");
		}
		}
		

	}

	public void checkPrime(int num) {
		// TODO Auto-generated method stub
		
	}

}
