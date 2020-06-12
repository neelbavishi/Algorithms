package com.interview.random.Arithmetic;

public class TowerOfHanoi {
	private static void hanoi (int disks) {  
        hanoi (disks, "Pole 1", "Pole 3", "Pole 2");  
   }  

    private static void hanoi (int disks, String from, String to, String using) {  
     if (disks != 0) {  
         hanoi (disks -1, from, using, to) ;   
         System.out.println("Move disk" + disks + "from" + from + "to" + to);  
         hanoi (disks -1, using, to, from);  
     }  
}  
    
    public static void main (String[] arg) throws Exception {  
         hanoi(1);
}  
}
