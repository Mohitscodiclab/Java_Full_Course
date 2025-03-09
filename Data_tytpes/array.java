public class array {
    public static void main(String[] args) {
        // Array declaration process 
        // same type
        // fixed size 
        // arry

        int[] a = new int[5];
        // _,_,_,_,_ we created a object for array
        // 0,1,2,3,4  indexing starts from 0

        //inserting an element in the created array

        a[0] = 5;   // first element is 5
        a[1] = 56;  // second element is 56
        a[2] = 89;  // third element is 89
        a[3] = 45;  // fourth element is 45
        a[4] = 7;   // fifth element is 7
        //array : 5, 56, 89, 45, 7
        System.out.println(a[4]); // only desired element is print 
        System.out.println();

        
        // for print full array at a time we use for loop 
        
        for(int i = 0; i < 5 ;i++){
            System.out.println(a[i]);
        }
        System.out.println();
        
        // we are using for-each loop here
        
        for(int i : a){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("another array: ");
        System.out.println("----------------");

        // another way of inserting values

        int[] b = {4, 6, 80, 2, 5};

        for(int j : b){
            System.out.println(j);
        }
        
    }
    
}
