
// 229. Majority Element II 
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int minSize = n / 3;
        List<Integer> ans = new ArrayList<>();
         for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.size() > 2) {
                Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<Integer, Integer> entry = iterator.next();
                    if (entry.getValue() - 1 == 0) {
                        iterator.remove();
                    } else {
                        map.put(entry.getKey(), entry.getValue() - 1);
                    }
                }
            }
        }


        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > minSize) {
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}
