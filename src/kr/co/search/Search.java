package kr.co.search;

public class Search {

	public Search () {
		
	}
	
	// 스캐닝 과정
	static int firstSearch(int[] arr, int n, int key) {
		for(int a = 0; a< n; a++) {
			if(arr[a] == key) {
				return a;	// 찾고자 하는 값을 찾았을 경우 해당 배열의 인덱스 리턴
			}
		}
		return -1;		// 찾고자 하는 값이 없을 경우 -1을 리턴
	}
	
	static int secondSearch(int[] arr, int key) {
		int low = 0 ;
		int high = arr.length - 1;
		int mid = 0;
		while(low <= high) {
			mid = (low + high) /2;
			
			if (arr[mid] == key) {
				return mid;
			}
			if(arr[mid]<key) {
				low = mid +1;
			} else {
				high = mid +1;
			}
		}
		return -1;
	}
	
	static int binSearchX(int[] arr, int n, int key) {
		int low = 0 ;
		int high = arr.length - 1;
		int mid = 0;
		while(low <= high) {
			mid = (low + high) /2;
			
			if (arr[mid] == key) {
				break;
			}
			if(arr[mid]<key) {
				low = mid +1;
			} else {
				high = mid +1;
			}
		}
		for(int a = mid; a > 0; a--) {
			if(arr[a] != key) {
				a++;
				return a;
			}
		}
		
		
		return -1;
	}
	
}
