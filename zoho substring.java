public class Main
{
	public static void main(String[] args) {
	 String str1="testing12";
	 String str="13";
	 int count=0;
	 int k=-1;

	for(int i=0;i<str.length();i++){
	    for(int j=0;j<str1.length();j++){
	   if(str.charAt(i)==str1.charAt(j)){
	       count++;
	   }if(count==1){
	       k=j;
	   }
	    
	}}
	if(count==str.length()){
	  System.out.println(k);
	}else{
	    System.out.println("-1");
	}
	
	}
}
