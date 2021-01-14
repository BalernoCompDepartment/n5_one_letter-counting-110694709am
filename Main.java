class Main {
  public static void main(String[] args) {
    
   String name = "";
   String output = "";
   name = Keyboard.getText("please enter your name"); 
    int length = name.length();
    
   output = output + "your name has " + length + " in it"; 
   
   Screen.display(output, "name");

  }
}
