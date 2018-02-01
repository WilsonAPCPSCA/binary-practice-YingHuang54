import java.util.Scanner;
public class BinaryConvertor {

	public static void main(String[] args) {
		System.out.print("Enter the number you would like to convert into binary: ");
		Scanner in = new Scanner(System.in);
		printBinary(in.nextInt());
		
	}
	public static void printBinary(int decimal){
		String binary="";
		int d = decimal;
		int length=0;
		while(d>=Math.pow(2, length)){
			length++;
		}
		for(int i= length;d>0||i>0;i--){
			if(d>=Math.pow(2, i-1)){
				binary=binary+"1";
				d-=Math.pow(2, i-1);
			}else binary=binary+"0";
		}
		System.out.println("The number "+decimal+" is equivalent to "+binary+" in binary.");
	}

}
