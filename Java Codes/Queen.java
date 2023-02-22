package learningJava;

public class Queen {

	public static void main(String[] args) {
		
		// find all prime no between two nu
		int a = 1,b=20;
		for(int i=a+1;i<)
		
		
		// find all armstrong numbers between two no
		
//		int a = 100,b=200;
//		for(int i=a+1;i<b;i++) {
//			int temp = i;
//			int sum = 0;
//			while(temp!=0) {
//				int rem = temp%10;
//				sum += rem*rem*rem;
//				temp/=10;
//			}
//			if(sum==i) {
//				System.out.println(i);
//			}
//		}
		
		
		// find gcd of a,b  
//		
//		int a=39,b=20;
//		
//		int temp;
//		
//		while(b!=0) {
//			temp=a;
//		    a=b;
//		    b=temp%b;
//		}
//		
//		a=Math.abs(a);
//		System.out.println(a);
		
		
		
//		Map<Integer, String> hm = new HashMap<>();
//		hm.put(2, "mno");
//		hm.put(12, "abc");
//		hm.put(42, "jkl");
//		hm.put(32, "ghi");
//		hm.put(22, "def");
//		System.out.println(hm);
//		System.out.println("......................................");

//		HashMap<Integer,String> hm2 = 
//				hm.entrySet()
//				.stream()
//		        .sorted(Map.Entry
//				.<Integer,String>comparingByValue()
//		         .reversed())
//				.collect(Collectors
//				.toMap(Map.Entry::getKey,
//						Map.Entry::getValue,(e1,e2)->e1
//				,LinkedHashMap::new));

		// Print all prime no which are below then given input no separated by comma 
//		int n = 20;
//		for(int i=2;i<n;i++) {
//			boolean isPrime = true;
//			for(int j=2;j<i;j++) {
//				if(i%j==0) {
//					isPrime=false;
//					break;
//				}
//			}
//			if(isPrime) {
//				System.out.println(i);
//			}
//		}
		
		// Program to count frequency of each element of array  
		// Input array elements: 5, 10, 2, 5, 50, 5, 10, 1, 2, 2 
		
//		int [] arr = {  5, 10, 2, 5, 50, 5, 10, 1, 2, 2 };
//		Arrays.sort(arr);
//		
//		int n = arr.length;
//		System.out.println(Arrays.toString(arr));
//		for(int i=0;i<n;i++) {
//			int count = 1;
//			int ele = arr[i];
//			for(int j=i+1;j<n && arr[j]==ele;j++,i++) {
//				count++;
//			}
//			System.out.println("Frequency of "+ele+" is : "+count);
//		}
		
		
		
//		for(int i=0;i<n;i++) {
//			int ele = arr[i];
//			int count = 1;
//			for(int j=i+1;j<n;j++) {
//				if(arr[j]==ele) {
//					++count;
//				}
//			}
//			System.out.println("Frequency of "+ele+" is : "+count);
//		}
		
		
		
	}
}
