package UML.UML.Action;

import UML.UML.Action.input.subsets;
import UML.UML.Action.input.union;

@SuppressWarnings("all")
public class input {
  private union union;
  
  private subsets subsets;
  
  public java.lang.String toString() {
    String result = new org.eclipse.xtext.xbase.lib.util.ToStringHelper().toString(this);
    return result;
  }
}
