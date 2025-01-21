public class Main
{
	public static void main(String[] args) {
	int arr[]={13,2, 4,15,12,10,5};
int n=0;
	for(int i=0;i<arr.length;i++){
	   for(int j=i;j<arr.length;j++){
	       if(i%2==0){
	       if(arr[i]<arr[j] && j%2==0){
	           n=arr[i];
	           arr[i]=arr[j];
	           arr[j]=n;
	    }}else{
	         if(arr[i]>arr[j]  && j%2!=0){
	           n=arr[i];
	           arr[i]=arr[j];
	           arr[j]=n;
	    }
	    }
	       }
	   }
	for(int i=0;i<arr.length;i++){
	    System.out.print(arr[i]+" ");
	}
	}
}
