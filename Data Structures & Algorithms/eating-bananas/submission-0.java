class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;
        for (int pile: piles) {
            maxPile = Math.max(pile,maxPile);
        }
        
        int l = 1;
        int r = maxPile;
        int minHours = Integer.MAX_VALUE;
        while(l <= r) {
            int mid = (l+r) / 2;
            int sumHours = 0;
            for(int i=0; i < piles.length; i++) {
                sumHours += Math.ceil((double) piles[i] / mid);
            }

            if(sumHours <= h) {
                minHours = Math.min(mid,minHours);
                r = mid - 1;
            } else {
                l = mid+1;
            }

        } 

        return minHours;      
    }
    
}
