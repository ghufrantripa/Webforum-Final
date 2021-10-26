/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Selectionsort;

public final class selectionSort {

    int[] angka={95, 72, 100, 60, 86, 75, 68, 88, 70, 84, 92, 80};
    public selectionSort()
    {

        tampilkanAngka();
        urutkanAngka();
        tampilkanAngka();
       
    }

    void tampilkanAngka()
    {
        System.out.println("\n-----------------------");
        for (int i=0;i<angka.length;i++)
        {
            System.out.print(angka[i]+" ");
             
        }
    }

    void urutkanAngka()
    {
        int tampung;
        for (int i=0;i<angka.length-1;i++)
        {
            int minindek=i;
            for(int j=i+1;j<angka.length;j++)
            {
                if(angka[j]<angka[minindek])
                    minindek=j;

                if(minindek!=i)
                {

                    tampung=angka[i];
                    angka[i]=angka[minindek];
                    angka[minindek]=tampung;
                }           
            }
           
         //tampilkanAngka();
        }

    }

    public static void main(String[] aksi)
    {
        selectionSort urut = new selectionSort();
    }
}
