package com.sda.advanced.solution.zad29;

import java.util.function.Predicate;

public class GreaterThan3Predicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer integer) {
		if(integer > 3){
			return true;
		}
		return false;
	}
}
