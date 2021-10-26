package Selectionsort;


public class selectionSort1 {
    public static void main(String[] args){
        
         int nilai[] ={95, 72, 100, 60, 75, 68, 88, 70,92, 80};
         selectionSortInt(nilai);
    }
    public static void selectionSortInt( int[] bilangan ){
        //tampilkan sebelum
        System.out.println("---SEBELUM---");
        for( int b: bilangan ){
            System.out.print(b + ", ");
        }
        
        //logic selection sort for integer
        for( int i = 0; i< bilangan.length; i++ ){
            
            int indexArray = i;
            for( int j = i; j< bilangan.length; j++ ){
                if( bilangan[indexArray] > bilangan[j] ){
                    indexArray = j;
                }
            }
            
            //swap
            int tampungan = bilangan[i];
            bilangan[i] = bilangan[indexArray];
            bilangan[indexArray] = tampungan;
        }
        
        //
        //tampilkan setelah
            System.out.println("\n---SESUDAH---");
        for( int b: bilangan ){
            System.out.print(b + ", ");
        }
    }
}
