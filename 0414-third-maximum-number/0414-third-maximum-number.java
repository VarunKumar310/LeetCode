class Solution {
    public int thirdMax(int[] nums) {
        Long first=null;
        Long second=null;
        Long third=null;
        for(int i:nums){
            if((first!=null && i==first) || (second!=null &&i==second)||(third!=null &&i==third)){
                continue;
            }
            if((first==null)||(i>first)){
                third=second;
                second=first;
                first=(long)i;
            }
              else  if((second==null)||(i>second)){
                        third=second;
                        second=(long)i;
                }
               else  if((third==null)||(i>third)){
                    third=(long)i;
                }
        }
        return third==null? first.intValue():third.intValue();
    }
}