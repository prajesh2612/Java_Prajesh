/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int lb=1,ub=n;
        while(lb<=ub)
        {
            int p=lb+(ub-lb)/2;
            if(guess(p)==1)
            {
                lb=p+1;
            }
            else if(guess(p)==-1)
            {
                ub=p-1;
            }
            else if(guess(p)==0)
            {
                return p;
            }
        }
        return 0;
    }
}