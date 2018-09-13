package per.kyle.chainofresponsibility.sampleone.askforleave;

import per.kyle.chainofresponsibility.sampleone.corbase.HandlerRequest;

/**
 * AskForLeaveRequest
 */
public class AskForLeaveRequest extends HandlerRequest {
    private Integer dayOfAskForLeave;

    /**
     * @return the dayOfAskForLeave
     */
    public Integer getDayOfAskForLeave() {
        return dayOfAskForLeave;
    }

    /**
     * @param dayOfAskForLeave the dayOfAskForLeave to set
     */
    public void setDayOfAskForLeave(Integer dayOfAskForLeave) {
        this.dayOfAskForLeave = dayOfAskForLeave;
    }
}