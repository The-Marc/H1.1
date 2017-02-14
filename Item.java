public class Item{
  //The name of the flower
  private String itemName;
  //The weight of the item
  private String itemWeight;
  //The description of the item
  private String itemDescription;
    
  
    
  /*Accessor method to get name
  *@return the name of item
  */
  public String getName(){
    return itemName;
  }
  //Mutator for the name
  public void setName(String name){
    itemName = name;
  }
  
  /*
   * Constructor to initialize itemName
   * @param none
   */
  public Item(String name){
    itemName = name;
  }
  public Item(){
  }
  
}

