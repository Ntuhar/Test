import java.util.*;

public class Test1 {
	public static void main(String args[]) {
		assign1();		
		assign2();
		assign3();
		assign4();
	}

	static void assign1() {
		Integer a = (int) (Math.random() * 10);
		Integer b = (int) (Math.random() * 10);
		Integer c = (int) (Math.random() * 10);
		Integer d = (int) (Math.random() * 10);
		List<Integer> ls = new ArrayList<>();
		ls.add(a);
		ls.add(b);
		ls.add(c);
		ls.add(d);
		System.out.println(ls + " \n\n " + Collections.max(ls) + " : " + Collections.min(ls));
	}

	static void assign2() {
		Integer a = (int) (Math.random() * 10);
		Integer b = (int) (Math.random() * 10);
		Integer c = (int) (Math.random() * 10);
		Integer d = (int) (Math.random() * 10);
		List<Integer> ls = new ArrayList<>();
		ls.add(a);
		ls.add(b);
		ls.add(c);
		ls.add(d);
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println("Third Max" + ls.get(ls.size() - 3));
	}

	static void assign3() {
		Integer a = (int) (Math.random() * 10);
		Integer b = (int) (Math.random() * 10);
		Integer c = (int) (Math.random() * 10);
		Integer d = (int) (Math.random() * 10);
		List<Integer> ls = new ArrayList<>();
		ls.add(a);
		ls.add(b);
		ls.add(c);
		ls.add(d);
		System.out.println(ls);
		int count = 0;
		for (Integer i : ls)
			if (i % 2 == 0)
				count++;
		System.out.println(count);
	}

	static void assign4() {
		int a = (int) (Math.random() * 10000);
		System.out.println(a);
		String number = a + "", inWords = "";
		for (int i = 0; i < number.length(); i++) {
			String tmp = "";
			switch (number.charAt(i)) {
			case '1':
				tmp = "One";
				break;
			case '2':
				tmp = "Two";
				break;
			case '3':
				tmp = "Three";
				break;
			case '4':
				tmp = "Four";
				break;
			case '5':
				tmp = "Five";
				break;
			case '6':
				tmp = "Six";
				break;
			case '7':
				tmp = "Seven";
				break;
			case '8':
				tmp = "Eight";
				break;
			case '9':
				tmp = "Nine";
				break;
			default:
				tmp = "Zero";
			}
			inWords += tmp + " ";

		}
		System.out.println(inWords);
	}

	static void assign5() {
		int a = (int)(Math.random() * 1000);
		if(a == 0)
			System.out.println("Zero");
		else {
			int twoDigits = a % 100;
			String tail = "";
			if(twoDigits < 20) {
				
				switch(twoDigits) {
				case 11 : tail = "Eleven";
				break;
				case 12 : tail = "Tweleve";
				break;
				case 13 : tail = "Thirteen";
				break;
				case 14 : tail = "Fourteen";
				break;
				case 15 : tail = "Fifteen";
				break;
				case 16 : tail = "Sixteen";
				break;
				case 17 : tail = "Seventeen";
				break;
				case 18 : tail = "Eighteen";
				break;
				case 19 : tail = "Nineteen";
				}
			}
		}
	}
//	static void assign5(){
//
//		int a = (int) (Math.random() * 10000);
//		System.out.println(a);
//		if(a == 0)
//			System.out.println("Zero");
//		else {
//		String number = a + "", inWords = "";
//		for (int i = 0; i < number.length(); i++) {
//			String tmp = "";
//			switch (number.charAt(i)) {
//			case '1':
//				tmp = "One";
//				break;
//			case '2':
//				tmp = "Two";
//				break;
//			case '3':
//				tmp = "Three";
//				break;
//			case '4':
//				tmp = "Four";
//				break;
//			case '5':
//				tmp = "Five";
//				break;
//			case '6':
//				tmp = "Six";
//				break;
//			case '7':
//				tmp = "Seven";
//				break;
//			case '8':
//				tmp = "Eight";
//				break;
//			case '9':
//				tmp = "Nine";
//				break;
////			default:
////				tmp = "Zero";
//			}
//			switch(i) {
//			case 0  : tmp += " Thousand ";
//			break;
//			case 1  : tmp += " Hundred ";
//			break;
//			case 2 : switch(tmp) {
//			case "One" : 
//				break;
//			case "Two" : tmp = "Twenty";
//				break;
//			case "Three" : tmp = "Thirty";
//				break;
//			case "Four" : tmp = "Fourty";
//				break;
//			case "Five" : tmp = "Fifty";
//				break;
//			case "Six" : tmp = "Sixty";
//				break;
//			case "Seven" : tmp = "Seventy";
//				break;
//			case "Eight" : tmp = "Eighty";
//				break;
//			case "Nine" : tmp = "Ninety";
//				break;
//			
//			}
//			inWords += tmp + " ";
//			}
//		}
//		}
//		System.out.println(inWords);
//	}
}
