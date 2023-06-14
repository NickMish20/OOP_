package Interfaces;

import Classes.Actor;

public interface iActorBehaviour { 
    /**
     * @param makeOrder
     */
    void setMakeOrder(boolean makeOrder);
    /**
     * @param pickUpOrder
     */
    void setTakeOrder(boolean pickUpOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
    Actor getActor();
}