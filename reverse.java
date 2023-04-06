package array;

public class reverse {
	public static void reverse(int number[]) {
		int first = 0,last = number.length-1;
		
		while(first<last) {
			//swape
			int temp = number[last];
			number[last] = number[first];
			number[first] = temp;
			
			first++;
			last--;
			
		}
	}
	

	public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
		
        reverse(number);
        
        //print
        for(int i = 0;i<number.length;i++) {
        System.out.print(number[i]+" ");
        }
        System.out.println();
	}

}
