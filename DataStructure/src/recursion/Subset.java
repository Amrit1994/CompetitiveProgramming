package recursion;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Subset {
	
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
	    int t= scan.nextInt();
	    List<Integer> inputArr = new ArrayList<>();
	    while(t--!=0){
	        int n = scan.nextInt();
	        for(int i = 0; i<n; i++){
	           int k = scan.nextInt();
	           inputArr.add(k);
	        }
	    }
	    int[] nums = new int[inputArr.size()];
	    for(int j = 0; j<inputArr.size(); j++){
	        nums[j] = inputArr.get(j);
	    }
	    List<List<Integer>> list = subsetsWithDup(nums);
		for(List<Integer> li : list){
//		    for(Integer itr : li){
		    System.out.println("("+li+ ")");
//		    }
		}
		
		
	}
	
	 public static List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
                     
    }
    
    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i =start; i<nums.length; i++){
            if(i>start && nums[i] == nums[i-1]) continue;
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i+1);
            tempList.remove(tempList.size()-1);
        }
    }

}
