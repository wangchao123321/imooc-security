package com.wangchao.security;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void whenQuerySuccess() throws Exception {
        String result=mockMvc.perform(MockMvcRequestBuilders.get("/user")
                .param("username","jojo")
                .param("age","16")
                .param("ageTo","60")
                .param("xxx","yyy")
                .param("size","15")
                .param("page","3")
                .param("sort","age,desc")
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(3))
                .andReturn().getResponse().getContentAsString();
        System.out.println(result);
    }


    @Test
    public void whenGenInfoSuccess() throws Exception {
        String result=mockMvc.perform(MockMvcRequestBuilders.get("/user/1")
//                .param("username","jojo")
//                .param("age","16")
//                .param("ageTo","60")
//                .param("xxx","yyy")
//                .param("size","15")
//                .param("page","3")
//                .param("sort","age,desc")
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.userName").value("tom"))
                .andReturn().getResponse().getContentAsString();
        System.out.println(result);
    }

        public static void main(String[] args) throws Exception {// 本程序内部异常过多为了简便，不一Try，直接抛给虚拟机
            long StartTime = System.currentTimeMillis();
            System.out.println("--     欢迎使用小刘简易网页爬虫程序      --");
            System.out.println("");
            System.out.println("--请输入正确的网址如http：//www.baidu.com--");
            Scanner input = new Scanner(System.in);// 实例化键盘输入类

            String webaddress = input.next();// 创建输入对象
            File file = new File("E:" + File.separator + "爬虫邮箱统计文本.txt");// 实例化文件类对象

            // 并指明输出地址和输出文件名


            Writer outWriter = new FileWriter(file);// 实例化outWriter类

            URL url = new URL(webaddress);// 实例化URL类。

            URLConnection conn = url.openConnection();// 取得链接

            BufferedReader buff = new BufferedReader(new InputStreamReader(

                    conn.getInputStream()));// 取得网页数据

            String line = null;
            int i=0;
            String regex = "\\w+@\\w+(\\.\\w+)+";// 声明正则，提取网页前提

            Pattern p = Pattern.compile(regex);// 为patttern实例化

            outWriter.write("该网页中所包含的的邮箱如下所示:\r\n");
            while ((line = buff.readLine()) != null) {

                Matcher m = p.matcher(line);// 进行匹配

                while (m.find()) {
                    i++;
                    outWriter.write(m.group() + ";\r\n");// 将匹配的字符输入到目标文件
                }
            }
            long StopTime = System.currentTimeMillis();
            String UseTime=(StopTime-StartTime)+"";
            outWriter.write("--------------------------------------------------------\r\n");
            outWriter.write("本次爬取页面地址："+webaddress+"\r\n");
            outWriter.write("爬取用时："+UseTime+"毫秒\r\n");
            outWriter.write("本次共得到邮箱："+i+"条\r\n");
            outWriter.write("****谢谢您的使用****\r\n");
            outWriter.write("--------------------------------------------------------");
            outWriter.close();// 关闭文件输出操作
            System.out.println(" —————————————————————\t");
            System.out.println("|页面爬取成功，请到E盘根目录下查看test文档|\t");
            System.out.println("|                                         |");
            System.out.println("|如需重新爬取，请再次执行程序,谢谢您的使用|\t");
            System.out.println(" —————————————————————\t");
        }

}
