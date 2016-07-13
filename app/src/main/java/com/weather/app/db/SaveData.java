package com.weather.app.db;


import com.weather.app.util.HttpCallbackListener;
import com.weather.app.util.HttpUtil;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.List;


/**
 * Created by Administrator on 2016/7/12.
 */
public class SaveData {
    public static void main(String[] args) {
        String address = "http://mobile.weather.com.cn/js/citylist.xml";
        HttpUtil.sendHttpRequest(address, new HttpCallbackListener() {
            @Override
            public void onFinish(String response) {
                System.out.println(response);

                try {
                    Document doc = DocumentHelper.parseText(response);
                    Element el = doc.getRootElement();

                    Element base = el.element("c");

                    List<Element> list = base.elements("d");
                    int i = 0;
                    for (Element node : list) {
                        i++;
                        Attribute attr_d1 = node.attribute("d1");
                        Attribute attr_d2 = node.attribute("d2");
                        Attribute attr_d4 = node.attribute("d4");
                        System.out.println(attr_d1.getData());
                        if(i == 2) {
                            break;
                        }
                    }


                    if("") {

                    }
                } catch (DocumentException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onError(Exception e) {

            }
        });
    }
}
