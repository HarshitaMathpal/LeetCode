class Solution{
	int minSteps(String str) {
		//Write your code here
		int acount = 0;
		int bcount=0;
		char prev = '.';
		for(int i=0;i<str.length();i++){
		    if(prev==str.charAt(i))
		        continue;
		    
		    else if(str.charAt(i)=='a')
		        acount++;
		    else
		        bcount++;
		    prev = str.charAt(i);
		}
		
		return Math.min(acount,bcount)+1;
	}
}
