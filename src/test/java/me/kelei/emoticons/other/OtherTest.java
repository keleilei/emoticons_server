package me.kelei.emoticons.other;

import com.google.gson.Gson;
import me.kelei.emoticons.entity.User;
import org.junit.Test;

public class OtherTest {

    @Test
    public void testGson(){
        User user = new User();
        user.setEmail("chaclus@gmail.com");
        user.setName("陈路");
        Gson gson = new Gson();
        gson.toJson(user, System.out);
    }
}
