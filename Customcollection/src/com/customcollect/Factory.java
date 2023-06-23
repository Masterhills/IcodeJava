package com.customcollect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Factory {
//	Factory
	Collection<Bike> coll = new ArrayList();
	Collection<Bike> produceBike(int items){
		try {
			for(int i = 0; i < items; ++i) {
				Bike obj = new Bike();
				coll.add(obj);
		}
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer exception thrown");
		}
		return coll;
	}
	void printin(Collection ofc) {
		System.out.println(ofc);
	}

}
