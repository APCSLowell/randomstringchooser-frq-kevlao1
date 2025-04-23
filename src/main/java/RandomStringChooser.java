import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> chooser = new ArrayList<String>();
  public RandomStringChooser(String[] a){
for(int i = 0; i < a.length; i++){
chooser.add(a[i]);
}
  }
  public String getNext(){
   int random = (int)(Math.random()*chooser.size());
    if(chooser.size() == 0){return "NONE";}
    else return chooser.remove(random);
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
