import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double[][] arr = new double[12][12];

        String calc = br.readLine();
        double calculo = 0;
        int v = arr.length - 1;
        for(int i = 0; i < arr.length; i++){
            for(int k = 0; k < arr[i].length; k++){
                double a = Double.parseDouble(br.readLine());
                arr[i][k] = a;
            }
        }

        for(int i = 0; i < arr.length;i++){
            for(int k = 11; k > v; k--){
                calculo = calculo+ arr[i][k];
                
            }
            v--;
        }
        
        if(calc.equals("S")){
            DecimalFormat decimal = new DecimalFormat("0.0");
            System.out.println(decimal.format(calculo));
        }
        else if(calc.equals("M")){
            DecimalFormat decimal = new DecimalFormat("0.0");
            calculo = calculo/66;
            System.out.println(decimal.format(calculo));
        }
        
    }
}