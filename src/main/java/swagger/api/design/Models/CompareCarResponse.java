package swagger.api.design.Models;

import java.util.List;

public class CompareCarResponse {

  private List<Car> carList;
 private  List<CarFeatures> features;

  public List<Car> getCarList() {
    return carList;
  }

  public void setCarList(List<Car> carList) {
    this.carList = carList;
  }

  public List<CarFeatures> getFeatures() {
    return features;
  }

  public void setFeatures(List<CarFeatures> features) {
    this.features = features;
  }
}
