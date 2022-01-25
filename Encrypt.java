
public class Encrypt {
	public static void main(String[]args) {
		String password = "VMI123";
		int key = 8;
		 char[] chars = password.toCharArray();
		 
		 for(int i = 0; i<chars.length; i++) {
			 chars[i]+=key;
			 System.out.print(chars[i]);
		 }
		 System.out.println();
		 
		 for(int i=0; i<chars.length; i++) {
			 chars[i]-=key;
			 System.out.print(chars[i]);
		 }
	}
}
