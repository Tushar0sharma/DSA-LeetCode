import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        
        for (int i = 0; i < path.length(); ++i) {
            if (path.charAt(i) == '/') {
                continue;
            }
            StringBuilder temp = new StringBuilder();
            while (i < path.length() && path.charAt(i) != '/') {
                temp.append(path.charAt(i));
                ++i;
            }
            if (temp.toString().equals(".")) {
                continue;
            } else if (temp.toString().equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(temp.toString());
            }
        }
        
        while (!st.isEmpty()) {
            res.insert(0, "/" + st.pop());
        }
        
        if (res.length() == 0) {
            return "/";
        }
        
        return res.toString();
    }
}
