public class Main
{
	public static void main(String[] args) {
	int n=4;
	for(int i=0;i<n-1;i++){
	    for(int j=n-1;j>i;j--){
	          System.out.print(" ");
	    }
	 for(int x=0;x<=i;x++){
	          System.out.print("*");
	      }
	      for(int y=0;y<i;y++){
	          System.out.print("*");
	      }
	 	System.out.println();
	    }
	    
	    for(int i=0;i<n;i++){
	    for(int j=0;j<i;j++){
	          System.out.print(" ");
	    }
	 for(int x=i;x<n;x++){
	          System.out.print("*");
	      }
	     for(int y=i+1;y<n;y++){
	          System.out.print("*");
	      }
	 	System.out.println();
	    }
	}
}
