public class Main
{
	public static void main(String[] args) {
		String str="b3c6d15";
		char alpha=0;int numVal=0;char ch;
		for(int i=0;i<str.length();i++){
		 ch=str.charAt(i);
		 
		   if((ch>=65 && ch<=90)||(ch>=97 && ch<=122)){
		    
		   if(alpha!=0){
		       for(int j=0;j<numVal;j++)
		           System.out.print(alpha);
		           numVal=0;
		       }
		          alpha=ch;
		  } else if(ch>=48 && ch<=57){
		        
		       numVal=((numVal*10)+ch)-48;
		   }
		}		       for(int j=0;j<numVal;j++)
		           System.out.print(alpha);
	}
}
