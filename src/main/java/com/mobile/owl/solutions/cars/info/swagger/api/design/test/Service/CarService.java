package com.mobile.owl.solutions.cars.info.swagger.api.design.test.Service;

import com.mobile.owl.solutions.cars.info.swagger.api.design.test.Models.Car;
import com.mobile.owl.solutions.cars.info.swagger.api.design.test.Models.CarBuilder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
