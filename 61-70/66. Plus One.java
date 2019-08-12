class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        if(digits[len-1]!=9)
        {
            digits[len-1]+=1;
            return digits;
        }
        else
        {
            digits[len-1]+=1;
            for(int i=len-1;i>0;i--)
            {
                if(digits[i]==10)
                {
                    digits[i]=0;
                    digits[i-1]+=1;
                }
            }
            if(digits[0]==10)
            {
                int[] new_digits=new int[len+1];
                digits[0]=0;
                for(int i=0;i<len;i++)
                    new_digits[i+1]=digits[i];
                new_digits[0]=1;
                return new_digits;
            }
            return digits;
        }
    }
}