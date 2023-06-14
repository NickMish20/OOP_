package Classes;

public class OrdinaryClient extends Actor {

    /**
     * @param name
     */

    public OrdinaryClient(String name) {
      super(name);
    }

    @Override
    public String getName() { //get name client
        return super.name;
    }

    public boolean isTakeOrder() { //flag take order
      return super.isTakeOrder;
    }

    public boolean isMakeOrder() { //flag make order
      return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) { // status take order
      super.isMakeOrder = makeOder;
    }
    
    public void setMakeOrder(boolean pikUpOrder) { // status make order
      super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() { // 
      return this;
    }
  }