
public class RemoveDuplicate {

	public String removeDuplicates(String s) {
        StringBuffer sb= new StringBuffer(s);
	    	for(int i=0;i<sb.length()-1;i++) {
	    		if(sb.charAt(i)== sb.charAt(i+1)) {
	    			sb=sb.deleteCharAt(i+1);
	    			sb=sb.deleteCharAt(i);
	    			if(i>0)
	    			{i=i-2;
	    			}
                    else {
	    				i=-1;
	    			}
	    			}
	    		}
	    		return sb.toString();

	}

}
