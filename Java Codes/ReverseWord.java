package learningJava;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseWord {
	public static int buyMaximumProducts(int n, int k, int[] arr) {
		int ans = 0;
		Map<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < n; i++) {
			hm.put(i + 1, arr[i]);
		}
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());	
		Collections.sort(list, (a, b) -> a.getValue().compareTo(b.getValue()));
//		System.out.println(list);
		while (k > 0) {
			for(Map.Entry<Integer,Integer> entry : list) {
				if(entry.getValue()*entry.getKey() <= k) {
					ans = ans + entry.getKey();
					k=k-entry.getKey()*entry.getValue();
				}else {
					ans = ans + k/entry.getKey();				
				}
			}
		}
		System.out.println(ans+15);
		return ans;
		
	}
	public static void main(String[] args) {
		int k=45;
		System.out.println("hi");
		int n=3;
		int[] arr = {10,7,19};
//		int res = buyMaximumProducts(n,k,arr);
//		System.out.println(res);
		System.out.println(buyMaximumProducts(n,k,arr));
	}
}
