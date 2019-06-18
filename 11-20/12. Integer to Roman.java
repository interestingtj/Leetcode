class Solution {
    public String intToRoman(int num) {
        int c=0;
        String roman="";
        int temp=num;
        int[] a={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] ro={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        
        while(temp>0)
        {
            for(int i=12;i>=0;i--)
            {
                if(temp>=a[i])
                {
                    roman=roman+ro[i];
                    temp=temp-a[i];
                    break;
                }
            }
        }
        return roman;
        
    }
}
