
public class stringReverse {
	   public void reverseString(char[] s) {
		   int k=s.length/2;

		   char temp;
		   for(int i=0;i<k;i++) {
		   	temp= s[i];
		   	s[i]=s[s.length-(i+1)];
		   	s[s.length-(i+1)]=temp;
		   }
}
}
