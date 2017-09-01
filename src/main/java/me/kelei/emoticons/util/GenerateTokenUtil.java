package me.kelei.emoticons.util;

import com.qiniu.util.Auth;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * 用于获取对象存储token
 */
public class GenerateTokenUtil {

    private static String ACCESS_KEY;

    private static String SECRET_KEY;

    private static String BUCKET_NAME;

    static{
        try {
            Properties properties = PropertiesLoaderUtils.loadProperties(new ClassPathResource("config.properties"));
            ACCESS_KEY = properties.getProperty("ACCESS_KEY");
            SECRET_KEY = properties.getProperty("SECRET_KEY");
            BUCKET_NAME = properties.getProperty("BUCKET_NAME");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getToken(){
        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        return auth.uploadToken(BUCKET_NAME);
    }

    public static void main(String[] args) {
        System.out.println(GenerateTokenUtil.getToken());
    }
}
