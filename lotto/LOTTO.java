package lotto;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
public class LOTTO {

	public static void main(String[] args) {
		
		//45°³ ¸¸µé±â
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i=1; i<=45; i++) {
			numbers.add(i);
		}
		//¼¯±â
		Collections.shuffle(numbers);
		
		
		//»Ì±â
		int[] picked = new int[6];
		for(int i=0; i<6; i++) {
			picked[i] = numbers.get(i);
		}
		
		System.out.println(Arrays.toString(picked));
		
	}

}
