class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int n=box.length;
        int m=box[0].length;
        char [][]ans=new char[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=box[j][i];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<(n/2);j++){
                char t=ans[i][j];
                ans[i][j]=ans[i][n-j-1];
                ans[i][n-j-1]=t;
            }
        }
        for(int i=0;i<n;i++){
            int l=m-1;
            for(int j=m-1;j>=0;j--){
                if(ans[j][i]=='*'){
                    l=j-1;
                }
                else if(ans[j][i]=='#'){
                    ans[j][i]='.';
                    ans[l][i]='#';
                    l--;
                }
            }
        }
        return ans;
    }
}