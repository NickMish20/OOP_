package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder { 
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isOrderReturned;

    /**
     * @param name
     */
     
    public Actor(String name) {
        this.name = name;
    }

    abstract public String getName();
    
    @Override
    public boolean isOrderReturned() {
        return isOrderReturned;
    }

    @Override
    public void setOrderReturned(boolean isOrderReturned) {
        this.isOrderReturned = isOrderReturned;
    }

    
}