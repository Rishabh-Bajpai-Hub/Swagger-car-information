package swagger.api.design.resource;


import swagger.api.design.Models.Car;
import swagger.api.design.Models.CarBuilder;
import swagger.api.design.Models.Response;
import swagger.api.design.Service.CarService;
import swagger.api.design.Utils.Message;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "car  Resource Rest Api", description = "shows Car information")
public class CarResource {


  @Autowired private CarService carService;

  @GetMapping(value = "/car")
  @ApiOperation(value = "Get All Cars Data")
  public List<Car> getCar() {
    CarBuilder carBuilder1 = new CarBuilder()
        .setId(1L)
        .setName("Mercedes-Benz E1")
        .setDescription("Redesigned in 2018")
        .setScore(7.5D)
        .setImageUrl(null)
        .setThumbnailUrl(null);
    CarBuilder carBuilder2 = new CarBuilder()
        .setId(2L)
        .setName("Mercedes-Benz E2")
        .setScore(6.5D)
        .setDescription("Redesigned in 2019")
        .setImageUrl(null)
        .setThumbnailUrl(null);

     return Arrays.asList(
        carBuilder1.build(), carBuilder2.build()
    );

  }

  @GetMapping(value = "/compare/cars")
  @ApiOperation(value = "Compare Cars Data")
  public Response compareCars(@RequestParam
  @Size(min = 2, message = "abd") Long[] carIds,
      HttpServletResponse httpServletResponse) {
    Response response = new Response();
    if (carIds.length < 2) {
      response.setMessage(Message.CAR_IDS_MINIMUM_REQUIRED_VALIDATION);
      response.setCode(400);
      response.setResult(null);
      httpServletResponse.setStatus(400);
      return response;
    }
    response.setResult(carService.getCarByIds(carIds));
    response.setCode(200);
    return response;
  }


}
