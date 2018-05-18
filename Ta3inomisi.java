
public class Ta3inomisi {
	
	
	public static void SiriakiAnazitisi(Employee[] e,String ln){
		for (int i=0;i<e.length;i++){
			if (e[i].getLastname().equals(ln)){
				System.out.println(e[i].toString());
				}
		}
	}
	
	public static Employee[] BubbleSort(Employee []arr){
		int n = arr.length;
		 
		for (int i=0; i<n; i++){
			for (int j=1; j < (n-i); j++){
				if (arr[j-1].getCode() > arr[j].getCode()){
					Employee temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static Employee[] InsertionSort(Employee []ar){
		for(int i= 1; i< ar.length; i++) {
			for(int j = i; j > 0 ; j--){
				if(ar[j].getCode() < ar[j-1].getCode()){
				Employee temp = ar[j];
				ar[j] = ar[j-1];
				ar[j-1] = temp;
				}
			}
		}
		return ar;
	}

	public static Employee[] SelectionSort(Employee []A){

		int pos;
		for (int i = 0; i < A.length-1; i++){
			pos=i;
			for (int k=i+1; k<A.length; k++){
				if ( A[k].getCode() < A[pos].getCode()) {
				pos=k;
				Employee temp = A[pos];
				A[pos] = A[i];
				A[i] = temp;
				}
				
			} 
			
		}
		return A;
	}
	
	public static void DiadikiAnazitisi(Employee []A,int x ,int sort){
		switch(sort){
		case 1:
			BubbleSort(A);
			break;
		case 2:
			InsertionSort(A);
			break;
		case 3:
			SelectionSort(A);
			break;
		}
		int left = 0, right = A.length-1;
		int mid = 0, found = -1;
		while (found == -1 && left <= right) { mid = (left + right) / 2;
			if (x < A[mid].getCode()) {
				right = mid-1;
			}
			else if (x > A[mid].getCode()) {
				left = mid + 1;
			}
			else {
				found = mid; 
			}
			
		} 
		System.out.println(A[mid].toString());
	}
}

