public class Reflectionattributes {
    public static void main(String[] args){
        //literal class
        Class student = Student.class;
        //use get.declared methods to return the method object
        Method[] methods = student.getDeclaredMethods();
        
        
        ArrayList<String> methodList = new ArrayList<>();
        //for each loop to iterate through Method class
        for(Method method : methods){
            //for every name, add them to arraylist
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}