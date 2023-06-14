package Classes;

public class PromotionalClient extends Actor {
    private String NamePromo;
    private int idPC;
    private static int count= 0;
    
 
    /**
     * @param name
     * @param idPC
     * @param NamePromo
     */
    public PromotionalClient(String name, int idPC, String NamePromo) {
        super(name);
        this.idPC = idPC;
        this.NamePromo = NamePromo;
        count++;
    }


    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
      return this;
    }

      
    
    
}
