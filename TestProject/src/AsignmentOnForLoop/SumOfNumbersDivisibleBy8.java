package AsignmentOnForLoop;

public class SumOfNumbersDivisibleBy8 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=100; i++)
		{
			if(i%8==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
