class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(int i : m.keySet()){
            if(m.get(i)>(n/3)){
                res.add(i);
            }
        }
        return res;
    }
}