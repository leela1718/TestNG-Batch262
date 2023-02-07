package runner;

import classes.EqualOperatorsService;

public class TestEqualOperators {

	public static void main(String[] args) {
		EqualOperatorsService eos = new EqualOperatorsService();
		eos.equalOperators(10, 20);
		eos.equalsOperatorsForBoolean(true, false);

	}

}
