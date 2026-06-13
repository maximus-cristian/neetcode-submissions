class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxwater=0;
        while(left<right){
            int area =(right-left)* Math.min(heights[left], heights[right]);
            if(area > maxwater){maxwater=area;}
            if(heights[left]<heights[right]){left++;}
            else{right--;}
        }
        return maxwater;
    }
}
