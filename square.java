package com.umeshsanjana.shape;

public class square extends shape {
    square(int dim1){
        super(dim1,-1);
    }    
    public int area(){
        return this.dim1 * this.dim2;
    }
}

