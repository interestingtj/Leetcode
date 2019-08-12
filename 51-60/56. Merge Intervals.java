class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0||intervals.length==1)
            return intervals;
        //Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0])); //(x,y) sorted by x
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0]-b[0];
            }
        });
        List<int[]> res=new ArrayList<int[]>();
        int i=0;
        int len=intervals.length;
        int[] temp=new int[2];
        temp[0]=intervals[0][0];
        temp[1]=intervals[0][1];
        while(i<len-1)
        {
            if(temp[0]==intervals[i+1][0]||temp[1]>=intervals[i+1][0]||temp[1]>=intervals[i+1][1])
            {
                temp[1]=Math.max(temp[1],intervals[i+1][1]);
                i++;
                continue;
            }
            else
            {
                res.add(new int[]{temp[0],temp[1]});
                temp[0]=intervals[i+1][0];
                temp[1]=intervals[i+1][1];
                i++;
            }
        }
        res.add(new int[]{temp[0],temp[1]});
        return res.toArray(new int[res.size()][2]);
    }
}