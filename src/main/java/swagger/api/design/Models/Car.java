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
  private double score;
  @ApiModelProperty(notes = "Thumbnail Url of car")
  private String thumbnailUrl;
  @ApiModelProperty(notes = "Actual image Url of car")
  private String imageUrl;

   Car(Long id, String name, String description, double score, String thumbnailUrl,
      String imageUrl) {
    this.id=id;
    this.name=name;
    this.description=description;
    this.score=score;
    this.thumbnailUrl=thumbnailUrl;
    this.imageUrl=imageUrl;
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


  public double getScore() {
    return score;
  }


  public String getThumbnailUrl() {
    return thumbnailUrl;
  }


  public String getImageUrl() {
    return imageUrl;
  }

}
