class ArrayMax
{	public static void main(String arg[])
	{
		int arr[]={1,4,2,5,67,3,6,3,56,6,88};
		int max=0;
		
 		for(int i=0;i<arr.length;i++)
		{
			 if (arr[i] > max)
			{
               			 max = arr[i];
			}
			
			
		}
		System.out.println("Maximum of Array : "+max);
		
			
	}
}

