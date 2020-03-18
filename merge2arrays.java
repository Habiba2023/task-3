import java.util.Scanner;


public class merge2arrays {

	public static void main(String[] args) {
		int[] a={1,2,3,0,0,0};
		int[] b={2,5,6};
		int[] c=merge[a,b];
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]);
		}
	}
	public static int[] merge(int[]a,int[]b){
		int[] result=new int[a.length+b.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length&&j<b.length){
		if(a[i]<=b[j]){
			result[k]=a[i];
			i++;
			k++;
		}
		else{
			result[k]=b[j];
			j++;
		k++;
		}
		while(i<a.length){
			result[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length){
			result[k]=b[j];
			j++;
			k++;
		}
		System.out.print("The result="+result);

	}
		return result;

	}
	}
