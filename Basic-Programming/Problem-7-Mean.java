public class Mean
{
    private static float Mean(float[] numbers){
        float total = 0;
        int n = numbers.length;
        
        for(int i=0; i<n; i++){
            total = total + numbers[i];
        }
        
        return total / n;
    }
    
	public static void main(String[] args) {
		float[] value = {1, 2, 3,4};
		
		System.out.println(Mean(value));
	}
}