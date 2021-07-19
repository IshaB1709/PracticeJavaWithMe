import java.util.ArrayList;

// TODO Auto-generated method stub
		class Solution {
			public static void main(String[] args)  {
				int []num= {1,1,0,0,1,1};
		    ArrayList<Integer> al= new ArrayList<Integer>();
			 int   count=0;
			int fc=0;
			    for(int i=0;i<num.length;i++) {
			
			    	
			    	if(num[i]==1) {
			    		
			    		al.add(i);
			    	
			    	}
			    	
			    	
			    }
		if(al.size()==0){
		    count=0;
		}
			    for(int i=0;i<al.size()-1;i++) {
			    	
			    	int j=al.get(i+1);
			    	int k=al.get(i);
			    	if(j-k==1) {
			    		fc++;
			    		
			    	}
			    	else {
			    		fc=0;
			    	}
			    	if(count<fc) {
			    		count=fc;
			    	}
			    }
			count=count+1;
		    }
		}
	


