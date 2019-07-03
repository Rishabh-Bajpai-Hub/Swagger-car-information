package swagger.api.design.Models;

import java.util.List;

public class CarFeatures {

  private String name;
  private List<String> values;

 public CarFeatures(String name)
  {
    this.name=name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }
}
