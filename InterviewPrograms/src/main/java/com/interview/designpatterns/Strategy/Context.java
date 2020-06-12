package com.interview.designpatterns.Strategy;

import java.io.File;
import java.util.ArrayList;

public class Context {
	
	
     private CompressStratergy stratergy;
     
     ArrayList<File>filelists;
     
     public void typeOfStratergy(CompressStratergy stratergy){
     
       this.stratergy=stratergy;
     }
     
     public void compressStart(){
    	 stratergy.compress(filelists);
     }


}
