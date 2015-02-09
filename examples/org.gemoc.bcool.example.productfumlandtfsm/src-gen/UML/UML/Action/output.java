package UML.UML.Action;

import UML.UML.Action.output.subsets;
import UML.UML.Action.output.union;

@SuppressWarnings("all")
public class output {
  private union union;
  
  private subsets subsets;
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}
