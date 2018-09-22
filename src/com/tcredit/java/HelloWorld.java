/**
 * FileName: HelloWorld
 * Author:   jiancheng.zhang
 * Date:     2018/9/22 11:46
 * Description: HelloWorld
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名         修改时间          版本号             描述
 */
package com.tcredit.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉
 * 〈HelloWorld〉
 *
 * @author jiancheng.zhang
 * @create 2018/9/22
 * @since 1.0.0
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        List<String> list1 = new ArrayList<String>();
        try {
            Date date = new Date();
        } catch (Exception e) {
            e.printStackTrace();
        }
        list1.add("a");
    }

}