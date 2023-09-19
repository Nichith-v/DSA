class TrappingRainWater {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int leftmax=0, rightmax=0;
        int total = 0;
        // for storing left max in array
        for(int i=0; i<n; i++){
            if(height[i]>leftmax){
                leftmax = height[i];
            }
            left[i] = leftmax;
        }
        // for storing right max in arrary
        for(int i=n-1; i>=0; i--){
            if(height[i]>rightmax){
                rightmax = height[i];
            }
            right[i] = rightmax;
        }
        for(int i=0; i<n; i++){
            total = total + (Math.min(left[i], right[i]) - height[i]);
        }
        return total;
    }
}