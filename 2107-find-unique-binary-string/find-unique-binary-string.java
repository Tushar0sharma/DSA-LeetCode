class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        List<String> l = new ArrayList<>();
        for (String s : nums)
            l.add(s);
        return call("", l, n);
    }

    public String call(String s, List<String> l, int n) {
        if (s.length() == n) {
            if (!l.contains(s))
                return s;
            else
                return null;
        }
        for (char ch = '0'; ch <= '1'; ch++) {
            String res = call(s + ch, l, n);
            if (res != null)
                return res;
        }
        return null;
    }
}