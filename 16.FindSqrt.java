//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
//
//You must not use any built-in exponent function or operator.
//
//For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
//
//
//Example 1:
//
//Input: x = 4
//Output: 2
//Explanation: The square root of 4 is 2, so we return 2.
//Example 2:
//
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

class FindSqrt {
    public int mySqrt(int x) {
        int st=1;
        int end=x;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(mid<=x/mid){
                if(x%mid==0 && mid==x/mid){
                    return mid;
                }else{
                    st=mid+1;
                }
            }else{
                end=mid-1;
            }
        }
        return end;
    }
}
