class Solution {
public:
    int climbStairs(int n) {
        // fucking fibonacci sequence
        if(n==1) return n;
        if(n==2) return n;
        int a=1,b=2;
        for(int i=3; i<=n; i++){
            int t = a;
            a = b;
            b = t+b;
        }
        return b;
    }
};