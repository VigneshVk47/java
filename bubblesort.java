public class Main
{
	public static void main(String[] args) {
		int a[]={8,3,2,4,5,6};
		int n=a.length;
		int z=0;
		for(int i=0;i<n-1;i++){
		    for(int j=0;j<n-i-1;j++){
		        if(a[j]>a[j+1]){
		            z=a[j];
		            a[j]=a[j+1];
		            a[j+1]=z;
		        }
		    }
		}
		for(int k=0;k<n;k++){
		    System.out.print(a[k]);
		}
	}
}
