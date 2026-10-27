class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans =new ArrayList<>();

        com(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }
   public void com(int i, int[] candidates, int target, List<Integer> list, List<List<Integer>> ans){
        if(i==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(candidates[i]<=target){
            list.add(candidates[i]);
         
            com(i, candidates, target-candidates[i], list, ans);
            list.remove(list.size()-1);   
        }
        com(i+1, candidates, target, list, ans);
    }
}