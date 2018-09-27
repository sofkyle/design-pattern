package per.kyle.chainofresponsibility.sampleone;

import per.kyle.chainofresponsibility.sampleone.askforleave.AskForLeaveChainProvider;
import per.kyle.chainofresponsibility.sampleone.askforleave.AskForLeaveRequest;

public class Main {
    public static void main(String[] args) {
        AskForLeaveRequest askForLeaveRequest = new AskForLeaveRequest();
        askForLeaveRequest.setDayOfAskForLeave(10);

        AskForLeaveChainProvider askForLeaveChainProvider = new AskForLeaveChainProvider();
        askForLeaveChainProvider.configHandleChain();
        askForLeaveChainProvider.start(askForLeaveRequest);
    }
}