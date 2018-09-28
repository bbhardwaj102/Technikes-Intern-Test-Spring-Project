package com.basespringproject.utils;

import java.util.Comparator;

import com.basespringproject.entities.MyProduct;

public class SortMyProductByPIdAsc implements Comparator<MyProduct> {
	@Override
	public int compare(MyProduct p1, MyProduct p2){
		return Long.compare(p1.getPid(), p2.getPid());
	}
}
 
