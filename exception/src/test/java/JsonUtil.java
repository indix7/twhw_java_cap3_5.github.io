import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

  private JsonUtil() {
  }
  private static final ObjectMapper objectMapper = new ObjectMapper();

  public static String convertToJson(Object object) {
    try {
      return objectMapper.writeValueAsString(object);
    } catch (Exception exception) {
      System.out.println("出现异常 ： "+exception);
    }
    return "读取失败";

  }
}
