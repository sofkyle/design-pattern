package per.kyle.chainofresponsibility.sampleone.askforleave;

import per.kyle.chainofresponsibility.sampleone.corbase.*;

public abstract class AbstractManager implements IHandler {
    /**
     * 上级
     */
    private AbstractManager superior;

    /**
     * 处理请求
     */
    public abstract void handleRequest(AbstractHandleRequest abstractHandleRequest);

    /**
     * 设定上级
     */
    public void setNextHandler(IHandler handler) {
        superior = (AbstractManager) handler;
    }

    /**
     * 获取上级
     */
    public AbstractManager nextHandler() {
        return superior;
    }

    /**
     * 是否有上级
     */
    public boolean haveNextHandler() {
        return superior != null;
    }
}