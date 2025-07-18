class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1>n2){
            return findMedianSortedArrays(nums2,nums1);
        }
        int N=n1+n2;
        int st=0;
        int end=n1;
        while(st<=end){
            int cut1=st+(end-st)/2;
            int cut2=N/2-cut1;
            int l1=(cut1==0)?Integer.MIN_VALUE:nums1[cut1-1];
            int l2=(cut2==0)?Integer.MIN_VALUE:nums2[cut2-1];
            int r1=(cut1==n1)?Integer.MAX_VALUE:nums1[cut1];
            int r2=(cut2==n2)?Integer.MAX_VALUE:nums2[cut2];
            if(l2<=r1 && l1<=r2){
                if(N%2==0){
                    return (Math.min(r1,r2)+Math.max(l1,l2))/2.0;
                }else{
                    return (double)Math.min(r1,r2);
                }
            }else if(l1>r2){
                end=cut1-1;
            }else{
                st=cut1+1;
            }
        }
        return 0.0;
    }
}
