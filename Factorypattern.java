import java.util.*;
import java.security.*;
interface Food {
	 public String getType();
	}
	class Pizza implements Food {
	 public String getType() {
	 return "Someone ordered a Fast Food!";
	 }
	}

	class Cake implements Food {

	 public String getType() {
	 return "Someone ordered a Dessert!";
	 }
	}
	class FoodFactory {
		public Food getFood(String order) {
//order is string from the class foodFactory
if(order.equals("pizza")) {
    //use food interface to return pizza instance
    Food food = new Pizza();
    return food;
    } else {
        //else use food interface to return Cake instance
        Food dessert = new Cake();
        return dessert;
    }
  }//End of getFood method

	}//End of factory class

	public class Factorypattern {

        public static void main(String args[]){
               Do_Not_Terminate.forbidExit();
   
           try{
   
               Scanner sc=new Scanner(System.in);
               //creating the factory
               FoodFactory foodFactory = new FoodFactory();
       
               //factory instantiates an object
               Food food = foodFactory.getFood(sc.nextLine());
       
               
               System.out.println("The factory returned "+food.getClass());
               System.out.println(food.getType());
           }
           catch (Do_Not_Terminate.ExitTrappedException e) {
               System.out.println("Unsuccessful Termination!!");
           }
        }
   
       }
       class Do_Not_Terminate {
            
           public static class ExitTrappedException extends SecurityException {
   
               private static final long serialVersionUID = 1L;
           }
        
           public static void forbidExit() {
               final SecurityManager securityManager = new SecurityManager() {
                   @Override
                   public void checkPermission(Permission permission) {
                       if (permission.getName().contains("exitVM")) {
                           throw new ExitTrappedException();
                       }
                   }
               };
               System.setSecurityManager(securityManager);
           }
       }	
    


