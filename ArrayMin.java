class ArrayMin
{	public static void main(String arg[])
	{
		int arr[]={9,4,2,5,67,3,6,3,56,6,88};
		int min=arr[0];
		
 		for(int i=0;i<arr.length;i++)
		{
			 if (arr[i] < min)
			{
               			 min = arr[i];
			}
			
			
		}
		System.out.println("Maximum of Array : "+min);
		
			
	}
}

