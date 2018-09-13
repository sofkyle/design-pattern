package per.kyle.chainofresponsibility.sampleone.askforleave;

import per.kyle.chainofresponsibility.sampleone.corbase.*;

public abstract class Manager implements IHandler {
    /**
     * 上级
     */
    private Manager superior;

    /**
     * 处理请求
     */
    public abstract void handleRequest(HandlerRequest handlerRequest);

    /**
     * 设定上级
     */
    public void setNextHandler(IHandler handler) {
        superior = (Manager) handler;
    }

    /**
     * 获取上级
     */
    public Manager nextHandler() {
        return superior;
    }

    /**
     * 是否有上级
     */
    public boolean hasSuperior() {
        return superior != null;
    }
}