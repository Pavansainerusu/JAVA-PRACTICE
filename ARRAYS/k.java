class A rray{
	public static void main(String args[]){
		
		int a[] = new int[]{4, 32, 9, 15, 17, 56, 2, 5, 49,1,18};
		
		int k = 3;
		System.out.println("Array length is: " + a.length);

		for(int x = 0; x <= a.length - 1; x++){
			for(int y = x+1; y <= a.length-1; y++){
				if(a[x] + a[y] == k){
					System.out.println(a[x] +" "+ a[y]);
					break;
					}
				}	
			}
		}
	}