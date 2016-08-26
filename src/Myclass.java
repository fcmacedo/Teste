
public class Myclass implements Solution{

	public int candy(int[] rating){
		
		int i,bonus=1,n=0,len = rating.length;
		int candy=len;
		sort(rating);
		
		for(i=0;i<len-1;i++){
			
			if(rating[i] < rating[i+1]){
				candy+=bonus++;
				n++;
			}
			if(rating[i] == rating[i+1]){
				candy+=bonus;
			}
			
		}
		
		return candy;
	}
	
	private void sort(int[]v){
		int i,j,aux,len=v.length;
		for(i=0;i<len-1;i++){
			for(j=0;j<len;j++){
			   	aux=v[i];
			   	v[i]=v[j];
			   	v[j]=aux;
			}
		}	
		
	}
	
	
}
