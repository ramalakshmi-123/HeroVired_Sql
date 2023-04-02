class CheckPrime{
    public static void main(String args[])
    {
    	int n=23;
        int k=0;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                k=1;
                break;
            }
        }
        if(k==0)
        {
            System.out.println("The given number "+n+" is a Prime Number");
        }
        else
        {
            System.out.println("The given number "+n+" is NOT a Prime Number");
        }
    }
}