package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			for(int i=s.length()-1;i>=0;i--)
				System.out.println(s.charAt(i));
		},"backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			s=s.toLowerCase();
			for(int i=0;i<s.length();i++) {
				if(i%2==0)
					System.out.print((char)(s.charAt(i)-32));
				else
					System.out.print(s.charAt(i));
			}
		},"hello");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		System.out.println();
		printCustomMessage((s)->{
			for(int i=0;i<s.length();i++) {
				System.out.print(s.charAt(i)+".");
			}
		},"period");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		System.out.println();
		printCustomMessage((s)->{
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)!='e' && s.charAt(i)!='o' && s.charAt(i)!='i' && s.charAt(i)!='a' && s.charAt(i)!='u')
					System.out.print(s.charAt(i));
			}
		},"no vowels here");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
