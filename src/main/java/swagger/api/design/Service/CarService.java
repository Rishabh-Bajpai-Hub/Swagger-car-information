package swagger.api.design.Service;

import swagger.api.design.Models.Car;
import swagger.api.design.Models.CarBuilder;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import swagger.api.design.Models.CarFeatures;
import swagger.api.design.Models.CompareCarResponse;

@Service
public class CarService {

  public CompareCarResponse getCarByIds(Long[] carIds) {
   List<Car> carList=new ArrayList<>();
   List<CarFeatures> carFeatures=new ArrayList<>();
    CarFeatures onRoadPricefeature=new CarFeatures("onRoadPrice");
    CarFeatures fuelTypeFeature=new CarFeatures("fuelType");
    List<String> onRoadPricefeatureValues=new ArrayList<>();
    List<String> fuelTypeFeatureValues=new ArrayList<>();
fuelTypeFeature.setValues(fuelTypeFeatureValues);
onRoadPricefeature.setValues(onRoadPricefeatureValues);
    carFeatures.add(onRoadPricefeature);
    carFeatures.add(fuelTypeFeature);
    for(Long carId:carIds) {
      CarBuilder carBuilder = new CarBuilder()
          .setId(carId)
          .setName("Mercedes-Benz E1")
          .setDescription("Redesigned in 2018")
          .setScore("7.5")
          .setImageUrl(null)
          .setThumbnailUrl(null)
          .setFuelType("PETROl")
          .setOnRoadPrice("28 Lakhs");

      carList.add(carBuilder.build());
      fuelTypeFeatureValues.add("PETROl");
      onRoadPricefeatureValues.add("28 Lakhs");
    }
    CompareCarResponse compareCarResponse=new CompareCarResponse();
    compareCarResponse.setCarList(carList);
    compareCarResponse.setFeatures(carFeatures);
    return compareCarResponse;
  }
}
