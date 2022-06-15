// https://leetcode.com/problems/generate-random-point-in-a-circle

class Solution {
    double radius;
    double x_center;
    double y_center;

    public Solution(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
        
        
    }
    
    public double[] randPoint() {
        double sqx = x_center - radius;
        double sqy = y_center - radius;
        while(1==1){
            double px = sqx + Math.random()*2*radius;
            double py = sqy + Math.random()*2*radius;
            if (radius*radius >= (px-x_center)*(px-x_center) + (py-y_center)*(py-y_center)){
                return new double[]{px, py};
            }
        }
        
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */