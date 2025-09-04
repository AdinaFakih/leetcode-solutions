class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> friendsSet = new HashSet<>();
        for (int f : friends) {
            friendsSet.add(f);
        }

        List<Integer> resultList = new ArrayList<>();
        for (int participant : order) {
            if (friendsSet.contains(participant)) {
                resultList.add(participant);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i<resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}
