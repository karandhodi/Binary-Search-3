// Time Complexity : O(log n) 
// Space Complexity : O(log n), recursive stack space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/* We use binary search with recursion to split our power by 2. If n > 0 we return result * result * x else we return
   result * result * (1/x). Base case would be when n = 0 we return 1. In this way using BS we can reduce our TC to
   log n
*/

class Solution {
    public double myPow(double x, int n) {
        if(n == 0)
            return 1;

        double result = myPow(x, n / 2);
        if(n % 2 == 0)
            return result * result;
        else {
            if(n > 0)
                return result * result * x;
            else    
                return result * result * (1 / x);
        }
    }
}