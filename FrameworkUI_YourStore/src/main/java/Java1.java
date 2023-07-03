
public class Java1 {

	public static void main(String[] args) {
		String s1="Tech36ocr47edi5ts";
		 int digits=0;
		 for(int i=0;i< s1.length();i++) {
			 if(Character.isDigit(s1.charAt(i)))
			 {
				 digits++;
				 System.out.print(digits);
			 }
		 }
		 System.out.println(digits);
		 }
}

