public class pair_inarray {

    public static void arraypair(int number[]){
        int toltal_pair=0;
        for(int i=0;i<number.length-1;i++){
            int current=number[i];    
            for(int j=i+1;j<=number.length-1;j++){
                System.out.print("(" +current+ "," +number[j] +")");
                toltal_pair++;
            }
            System.out.println();
        }
        System.out.println("Total number of pair are :" +toltal_pair);
    }
    public static void main(String[]args){
        int number[]={2,4,6,8,10,12,14,16,18,20};
        arraypair(number);
        


    }
    
}
