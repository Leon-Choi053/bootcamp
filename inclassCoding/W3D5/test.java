package inclassCoding.W3D5;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr = new int[128];

        // 统计每个字符出现的次数
        for (char c : s.toCharArray()) {
            arr[c]++;
        }

        // 检查所有字符的出现次数是否相同
        int freq = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (freq == 0) {
                    freq = arr[i];
                } else if (arr[i] != freq) {
                    return false;
                }
            }
        }
        return true;
    }
}
