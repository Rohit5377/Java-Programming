
//HARD
class ElementFoundInMountaionArray {
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int st=0;
//        int n=mountainArr.length();
//        int end=n-1;
//        int mid=0;
//        while(st<=end){
//            mid=st+(end-st)/2;
//            int curr=mountainArr.get(mid);
//            if(mid>0 && mid<n-1 && curr>mountainArr.get(mid-1) && curr>mountainArr.get(mid+1)){
//                if(curr==target){
//                    return mid;
//                }
//                break;
//            }else if(mid>0 && curr>mountainArr.get(mid-1)){
//                st=mid+1;
//            }else{
//                end=mid-1;
//            }
//        }
//        st=0;
//        end=mid;
//        while(st<=end){
//            int m=st+(end-st)/2;
//            int curr=mountainArr.get(m);
//            if(curr==target){
//                return m;
//            }else if(target>curr){
//                st=m+1;
//            }else{
//                end=m-1;
//            }
//        }
//
//        st=mid+1;
//        end=n-1;
//        while(st<=end){
//            int m=st+(end-st)/2;
//            int curr=mountainArr.get(m);
//            if(curr==target){
//                return m;
//            }else if(curr>target){
//                st=m+1;
//            }else{
//                end=m-1;
//            }
//        }
//        return -1;
//    }
}
