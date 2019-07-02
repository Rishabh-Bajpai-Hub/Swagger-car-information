package swagger.api.design.Models;

import io.swagger.annotations.ApiModelProperty;
import java.util.List;

public class Response {
  @ApiModelProperty(notes = "list of cars")
    private List<Car> result;
    @ApiModelProperty(notes = "Status code")
    private int code;
   @ApiModelProperty(notes = "Explicit Message ")
    private String message;

    public Object getResult() {
      return result;
    }

    public void setResult(List<Car> result) {
      this.result = result;
    }


    public int getCode() {
      return code;
    }

    public void setCode(int code) {
      this.code = code;
    }

    public String getMessage() {
      return message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
  }

