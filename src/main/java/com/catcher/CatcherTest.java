package com.catcher;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class CatcherTest {
    public static void get_html(String url){
        try {
            Document doc = Jsoup.connect(url).get();
            System.out.println(doc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String url = "https://www.google.com/search?q=fifa+%E8%B3%BD%E7%A8%8B&ei=T76MY853y6uYBfHRg8gM&ved=0ahUKEwiO24SXpeD7AhXLFaYKHfHoAMkQ4dUDCA8&uact=5&oq=fifa+%E8%B3%BD%E7%A8%8B&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIKCAAQgAQQRhD9ATIECAAQAzoKCAAQRxDWBBCwAzoKCC4QgwEQsQMQQzoLCAAQgAQQsQMQgwE6CggAELEDEIMBEEM6CAgAELEDEIMBOgoILhCxAxCDARBDOgUIABCABDoFCAAQogQ6BwgAEB4QogRKBAhBGABKBAhGGABQwQVY-RJghhVoAnABeACAATGIAccCkgEBOJgBAKABAcgBCsABAQ&sclient=gws-wiz-serp#sie=lg;/m/0fp_8fm;2;/m/030q7;mt;fp;1;;;";
        get_html(url);
    }


}
