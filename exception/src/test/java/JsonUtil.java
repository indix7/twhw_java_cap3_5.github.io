import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

  private JsonUtil() {
  }
  private static final ObjectMapper objectMapper = new ObjectMapper();

  public static String convertToJson(Object object) {
    try {
      String str = objectMapper.writeValueAsString(object);
      return str;
    } catch (Exception e) {
      System.out.println(e);
    }
    return "";

  }
}
