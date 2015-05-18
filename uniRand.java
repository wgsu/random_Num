//generate non-repeating number 0 to 999
package uniRand;

import java.util.Random;
public class uniRand {
	public static void main (String args[]){
		int [] num_To_Pick= new int[1000];
		for(int i =0;i<1000;i++){
			num_To_Pick[i]=i;
			//put all the number in a array
			
			
		}
			pick_And_SwitchArray(num_To_Pick);
	}
	static void pick_And_SwitchArray(int[] fys)
	{
	  Random rand = new Random();
	  for (int i = fys.length - 1; i > 0; i--)//from back to front, i is store the last index position 
	  {
	    int index = rand.nextInt(i + 1);//pick a random index positionfrom 0 to i+i, store that in index
	    

	    int temp = fys[index];//use int temp as a temp, store the number in the last index position
	    fys[index] = fys[i];//swap with the the random number
	   
	    fys[i] = temp;
	    System.out.println("the ranom number is "+ fys[i]);

	  }
	}
}
