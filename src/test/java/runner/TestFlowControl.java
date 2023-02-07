package runner;

import classes.FlowControlService;

public class TestFlowControl {

	public static void main(String[] args) {
		FlowControlService fcs = new FlowControlService();
		fcs.checkEvenOrOdd(4);
		fcs.checkEvenOrOdd(5);
	}
}
