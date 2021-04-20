import java.util.Random;

public class Main {

    static public void main(String[] args){
        int d =6;
        if(args.length>0){
            d = Integer.parseInt(args[0]);
        }
        var random = new Random();
        float num = random.nextFloat();
        float delta = (float) 1/(float) d;
        int res =1;
        float counter =delta;
        for(int i =0;i<d;++i){
            if(num<=counter){
                break;
            }
            res++;
            counter+=delta;
        }
        System.out.printf("Dice result: %d\n\trandom is: %f\n\tdelta is: %f\n\tdice is: %d\n",res,num,delta,d);
        System.out.printf("%f --> %f - %f\n",num,counter-delta,counter);
    }

}
