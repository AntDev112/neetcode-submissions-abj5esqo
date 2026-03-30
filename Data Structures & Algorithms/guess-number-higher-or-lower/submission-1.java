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
        int start = 1;
        int end = n;
        while(start <= end) {
        int midPoint = start + (end - start) / 2;
        if (guess(midPoint) > 0) {
            start = midPoint+1;
        } else if(guess(midPoint) < 0) {
            end = midPoint - 1;
        } else {
            return midPoint;
        }
    }

        return -1;
    }   
}