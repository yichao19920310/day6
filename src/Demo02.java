

public class Demo02 {

	public static void main(String[] args) {
		int [][] arr = new int[10][7];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j==arr[i].length-1) {
					int a = (int)(Math.random()*16+1);
					arr[i][j] = a;
				}else {
					int a = (int)(Math.random()*33+1);
					arr[i][j] = a;
					for(int k = 0; k<j; k++) {
						if(arr[i][k]==arr[i][j]) {
							j--;
							break;
						}else {
							;
						}
					}
				}
				
			}
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print("第"+(i+1)+"期双色球为:");
			for(int j = 0; j<arr[i].length; j++) {
				
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println();
		}
		

	}

}
