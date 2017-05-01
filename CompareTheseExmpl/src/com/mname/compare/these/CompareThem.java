package com.mname.compare.these;

import java.util.Comparator;

public interface CompareThem extends Comparator<String> {

	@Override
	int compare(String a, String b);
}
