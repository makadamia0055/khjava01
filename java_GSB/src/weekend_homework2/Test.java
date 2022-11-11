package weekend_homework2;

import interfacePractice01.SampleInplementsClass;

public class Test {

	public static void main(String[] args) {
		/* 가계부 프로그램을 작성하세요.
		 * 메뉴
		 * 1. 내역 추가
		 * 2. 내역 확인
		 * 3. 내역 수정
		 * 4. 내역 삭제
		 * 5. 종료
		 * 
		 * 
		 * 1. 내역 추가 
		 * 구분 : 수입/지출
		 * 분류 : 식비/통신비/교통비/생활비/용돈/ 기타 등등
		 * 내용 : 편의점/식당/전철비
		 * 금액 : 5000
		 * 일시 : 년, 월, 일
		 * 
		 * 2. 내역 확인
		 * | 구분 | 일시 | 분류 | 내용 | 금액 | 순으로
		 * 
		 * 2-1 전체 내역 확인
		 * 2-2 년 내역 확인
		 * 2-3 월 내역 확인
		 * 2-4 일 내역 확인
		 *   
		 * 
		 *   
		 * 3. 내역 수정
		 * 년, 월, 일로 검색 후 내역 출력  
		 * 번호를 입력받아 
		 * 입력받은 번호에 맞는 내열을 수정
		 * - 구분/일시/분류/내용/금액 순으로 입력받아 수정(혹은 수정할 부분 선택)
		 * 
		 * 4. 내역 삭제
		 * 년, 월, 일로 검색 후 내역 출력
		 * 번호를 입력
		 * 입력받은 번호에 맞는 내역을 삭제
		 * 
		 * 
		 * 추가 - 가계부를 년, 월, 일로 정렬
		 *   
		 *   
		 * */
		SampleInplementsClass SIC = new SampleInplementsClass();
		int menu = 0;
		int min = 1, max = 5;
		do {
			SIC.printMenu("1. 내역 추가\n"
					+ "2. 내역 확인\n"
					+ "3. 내역 수정\n"
					+ "4. 내역 삭제\n"
					+ "5. 종료");
			
			menu=SIC.selectMenu(min, max);
			runMenu(menu);
		}while(menu!=5);
		
		
		
		

	}

	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
			default:
		}
		
	}

	

}
