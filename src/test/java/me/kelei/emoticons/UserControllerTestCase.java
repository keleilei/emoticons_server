package me.kelei.emoticons;

import com.google.gson.Gson;
import me.kelei.emoticons.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureMockMvc
@SpringBootTest(classes = MainBoot.class)
public class UserControllerTestCase {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testSaveUser() throws Exception{
        User user = new User();
        user.setEmail("chaclus@gmail.com");
        user.setName("陈路");
        Gson gson = new Gson();
        String json = gson.toJson(user);
        this.mvc.perform(post("/user").contentType(MediaType.APPLICATION_JSON).content(json)).andDo(print())
                .andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
    }

}
