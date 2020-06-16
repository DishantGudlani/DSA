class Solution {

    private double[] probs;
	
    public Solution(int[] w) {
        double sum = 0;
        this.probs = new double[w.length];
        for(int weight: w)
            sum += weight;
        
        for(int i = 0; i < w.length; i++)
        {
            w[i] += (i==0) ? 0 : w[i - 1];
		System.out.println(w[i]);
            probs[i] = w[i] / sum;
		System.out.println(probs[i]);
        }
    }
    
    public int pickIndex() {
        return Math.abs(Arrays.binarySearch(this.probs, Math.random())) - 1;
    }



}
