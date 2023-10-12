package org.task;

import org.testng.annotations.Test;

public class SumOfValues {

	@Test
	private void sum() {
		
		int a[]= {1,2,3,11,9,8,6,4,-1};
		int sum=10;
		int total=0;
		int combo=0;
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a.length-1;j++) {
				total=a[i]+a[j];
				if(sum==total) {
					System.out.println("Combination==>"+a[i]+","+a[j]);
					combo=combo+1;
				}
			}
		}	
		System.out.println("Total no.of Combinations is....\n"+combo);
		
		
//		int i=0;
//		int dot=0;
//        do {
//        	
//        	dot=a[0]+a[i];
//        	System.out.println("dot"+dot);
//       	    i++;
//        } 
//        while(i<=a.length-1);

		
	
	}
}

       






