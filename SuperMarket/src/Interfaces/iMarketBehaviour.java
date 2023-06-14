package Interfaces;

import java.util.List;
import Classes.Actor;


public interface iMarketBehaviour { //Market Behaviour
    /**
     * @param actor
     */
    void acceptToMarket(iActorBehaviour actor);
    /**
     * @param actors
     */
    void releaseFromMarket(List<Actor> actors);
    void update();    
}