package api.util.array;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		
		int[] arr = {4 ,3 ,6 ,3 ,1 ,7};
		
		// sort
		
		Arrays.sort(arr);
		
		// toString
		
		System.out.println(Arrays.toString(arr));
		
		// binarySearch - 값의 유무 확인 (선행조건: 정렬)
		
		int a = Arrays.binarySearch( arr , 7);
		System.out.println("7이 있는 인덱스 위치" + a); // 없는 값이면 음수값을 반환
		
		// copyOf, copyOfRange
		
		int[] arr1 = Arrays.copyOf( arr , arr.length);
		
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = Arrays.copyOfRange( arr , 3, 5); // 3~5미만 인덱스 까지만
		System.out.println(Arrays.toString(arr2));
		
		// equals - 배열의 내부요소가 동일한지 확인
		
		if(Arrays.equals(arr, arr1)) {
			System.out.println("내부 값이 동일함");
		}
	}
}
