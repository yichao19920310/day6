import java.util.Scanner;
public class demo01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] arr = new String[10];
		String temp = "";
		for(int i = 0; i<arr.length; i++) {
			System.out.println("ÇëÊäÈëµÚ"+(i+1)+"¸ö×Ö·û´®");
			String str = input.nextLine();
			arr[i] = str;					
		}
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = 0; j<arr.length-1-i; j++) {
				if(arr[j].length()<arr[j+1].length()) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}else {
					;
				}				
			}			
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		input.close();
	}
}
