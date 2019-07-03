package swagger.api.design.Models;

import io.swagger.annotations.ApiModelProperty;

public class Car {

  @ApiModelProperty(notes = "The database generated product ID")
  private Long id;
  @ApiModelProperty(notes = "car name")
  private String name;
  @ApiModelProperty(notes = "car description")
  private String description;
  @ApiModelProperty(notes = "car score out of 10")
  private String score;
  @ApiModelProperty(notes = "Thumbnail Url of car")
  private String thumbnailUrl;
  @ApiModelProperty(notes = "Actual image Url of car")
  private String imageUrl;
  @ApiModelProperty(notes = "On Road Price of car")
  private String onRoadPrice;
  @ApiModelProperty(notes = "Fuel Type of car")
  private String fuelType;

   Car(Long id, String name, String description, String score, String thumbnailUrl,
      String imageUrl,String onRoadPrice,String fuelType) {
    this.id=id;
    this.name=name;
    this.description=description;
    this.score=score;
    this.thumbnailUrl=thumbnailUrl;
    this.imageUrl=imageUrl;
    this.onRoadPrice=onRoadPrice;
    this.fuelType=fuelType;
  }

  public Long getId() {
    return id;
  }


  public String getName() {
    return name;
  }


  public String getDescription() {
    return description;
  }


  public String  getScore() {
    return score;
  }


  public String getThumbnailUrl() {
    return thumbnailUrl;
  }


  public String getImageUrl() {
    return imageUrl;
  }

}
