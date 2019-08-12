class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int len=intervals.length;
        if(len==0)
        {
            return new int[][]{{newInterval[0],newInterval[1]}};
        }
        List<int[]> res=new ArrayList<int[]>();
        int start=0;
        for(int i=0;i<len;i++)
        {
            if(intervals[i][1]<newInterval[0])
                res.add(new int[]{intervals[i][0],intervals[i][1]});
            else 
            {
                start=i;
                break;
            }
        }
        for(int i=start;i<len&&intervals[i][0]<=newInterval[1]&&intervals[i][1]>=newInterval[0];i++)
        {
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            start=i+1;
        }
        res.add(new int[]{newInterval[0],newInterval[1]});
        for(int i=start;i<len&&intervals[i][0]>newInterval[1];i++)
        {
            res.add(new int[]{intervals[i][0],intervals[i][1]});
        }
        return res.toArray(new int[res.size()][2]);
    }
}