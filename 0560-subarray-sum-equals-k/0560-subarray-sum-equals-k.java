class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int pref=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            pref+=nums[i];
            int extra=pref-k;
            if(map.containsKey(extra)){
                 cnt+=map.get(extra);  
                // map[extra]++;   
                       }
        
        map.put(pref,map.getOrDefault(pref,0)+1);
        }
    return cnt;
}
}