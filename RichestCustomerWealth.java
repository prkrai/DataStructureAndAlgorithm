public class RichestCustomerWealth {
    public static void main(String[] args)
    {
        int [][] accounts = {{1,2,3},{3,2,4}};
        int wealth[]= new int[accounts.length];
        maximumWealth(accounts, wealth);
    }
    static int maximumWealth(int[][] accounts,int[] wealth) 
    {
        
        
        for(int i =0;i<accounts.length;i++)
        {
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++)
            {
                sum = sum + accounts[i][j];
            }
            wealth[i]=sum;
        }
        int ans = max(wealth);
        System.out.println(ans);
        
        return ans;
    }
    static int max(int[] wealth)
    {
        int max=wealth[0];
        for(int i =1;i<wealth.length;i++)
        {
            if (wealth[i]>max)
            {
                max = wealth[i];
            }
        }
        return max;
    }
}
