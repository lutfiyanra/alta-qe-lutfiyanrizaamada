public class DrawXYZ
{
    private static void DrawXYZ(int n){
        int counter = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(counter % 3 == 0){
                    System.out.print("X ");
                }
                else if(counter % 2 != 0){
                    System.out.print("Y ");
                }
                else{
                    System.out.print("Z ");
                }
                counter = counter + 1;
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
	public static void main(String[] args) {
		DrawXYZ(3);
		DrawXYZ(5);
        DrawXYZ(1);
	}
}
