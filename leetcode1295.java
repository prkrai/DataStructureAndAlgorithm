public class leetcode1295 {
    public static void main(String[] args) {
        int arr[] = {12,345,2,6,7896};
        
        int c=0;
        
            System.out.println(findNumbers(arr,c));
    }
    static int findNumbers(int[] nums,int c)
    {
        for(int i=0;i<nums.length;i++)
        {
            
            int dig = digit(nums[i]);
            if(dig%2==0)
            {
                c++;
            }
        }

    return c;
        
    }
    static int digit(int num)
    {
        int dig=0;
        while(num>0)
        {
            dig++;
            num = num/10;
            
        }
        return dig;
    }
}
