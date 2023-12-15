import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

class User {
    public String name;
    public Integer age;
}

public class JacksonLearn {
    public static void main(String[] args) throws JsonProcessingException {
        User u1 = new User();
        u1.name = "Tom";
        u1.age = 12;
        ObjectMapper objectMapper = new ObjectMapper();
        // 序列化
        String s1 = objectMapper.writeValueAsString(u1);
        System.out.println(s1);
        // 反序列化
        String a2 = "{\"name\":\"Tom\",\"age\":12}";
        User u2 = objectMapper.readValue(a2, User.class);
        System.out.println(u2);


    }
}
