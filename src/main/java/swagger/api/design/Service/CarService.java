package swagger.api.design.Service;

import swagger.api.design.Models.Car;
import swagger.api.design.Models.CarBuilder;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CarService {

  public List<Car> getCarByIds(Long[] carIds) {
   List<Car> carList=new ArrayList<>();
    for(Long carId:carIds)
    {
      CarBuilder carBuilder = new CarBuilder()
          .setId(carId)
          .setName("Mercedes-Benz E1")
          .setDescription("Redesigned in 2018")
          .setScore(7.5D)
          .setImageUrl(null)
          .setThumbnailUrl(null);
      carList.add(carBuilder.build());
    }
    return carList;
  }
}
