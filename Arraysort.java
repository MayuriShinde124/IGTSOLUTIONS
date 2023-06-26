class ArraySort
{
public static void main(String[] args) 
    {
       
	int a[]={1,4,2,5,67,3,6,3,56,6,88};
	int n=a.length, temp;
	System.out.println("Original Array:");	
	 for (int i = 0; i < n; i++) 
        {
		System.out.print(a[i] + ",");
	}
	System.out.println();
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++==");

        System.out.println("Ascending Order:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
       
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a[i] + ",");
        }

	System.out.println();
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++==");
	System.out.println("Descending Order:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] < a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
   }
            }
        }
	 for (int i = 0; i < n; i++) 
        {
            System.out.print(a[i] + ",");
        }


    }
}