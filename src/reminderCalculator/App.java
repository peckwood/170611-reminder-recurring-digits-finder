package reminderCalculator;

import java.math.BigDecimal;

public class App {
	public static void main(String[] args) {
		BigDecimal a = new BigDecimal(28.274334);
		BigDecimal b = new BigDecimal(9.0000000376);
		//BigDecimal a = new BigDecimal(2);
		//BigDecimal b = new BigDecimal(13);
		String result = a.divide(b, 1000, BigDecimal.ROUND_HALF_UP).toString();
		String digitsAfterPoint = result.substring(result.lastIndexOf(".")+1);
		System.out.println("digitsAfterPoint "+digitsAfterPoint);
		boolean found = false;
		for(int positionAfterDecimalPoint=1;positionAfterDecimalPoint<=digitsAfterPoint.length();positionAfterDecimalPoint++){
			if(found){
				break;
			}
			for(int lengthOfTheLoopingDigits = 2;lengthOfTheLoopingDigits<=(digitsAfterPoint.length()-positionAfterDecimalPoint)/3;lengthOfTheLoopingDigits++){
				int s1Start = positionAfterDecimalPoint-1;
				int s1End = s1Start+lengthOfTheLoopingDigits;
				int s2Start = s1End;
				int s2End = s2Start+lengthOfTheLoopingDigits;
				int s3Start = s2End;
				int s3End = s3Start+lengthOfTheLoopingDigits;
				String string1 = digitsAfterPoint.substring(s1Start, s1End);
				String string2 = digitsAfterPoint.substring(s2Start, s2End);
				String string3 = digitsAfterPoint.substring(s3Start, s3End);
				System.out.println("=====================================");
				System.out.println("string1 "+string1);
				
				
				System.out.println("string2 "+string2);
				System.out.println("string3 "+string3);
				if(string1.equals(string2) && string2.equals(string3)){
					System.out.println("found");
					System.out.println("result "+result);
					System.out.println("digitsAfterPoint "+digitsAfterPoint);
					System.out.println("positionAfterDecimalPoint "+positionAfterDecimalPoint);
					System.out.println("lengthOfTheLoopingDigits "+lengthOfTheLoopingDigits);
					System.out.println("string "+string1);
					found = true;
					break;
				}
			}
		}
		System.out.println("not found");
	}
}
