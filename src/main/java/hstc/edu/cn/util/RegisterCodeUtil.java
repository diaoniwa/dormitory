package hstc.edu.cn.util;

/**
 * Created by win8 on 2017/6/8.
 */

import java.util.LinkedList;
import java.util.Random;

/**
 * 生成随机注册码工具类
 * @Author wuyifengdashuaige
 * @Time 2017-6-5 14:28
 */
public class RegisterCodeUtil {
    private static LinkedList<String> strList = new LinkedList<String>();
    private static Random random = new Random();

    public static String RegisterCode(){
        strList.clear();
        putRandomStrToList(strList);
        String str = "";
        for(int i = 0; i<strList.size(); i++){
            str+=strList.get(i);
        }

        return str;

    }

    public static void putRandomStrToList(LinkedList<String> list){
        for(int i = 0; i < 10; i++){
            String insertStr = createRandomString();
            while(true){
                if(!(list.contains(insertStr))){
                    list.add(insertStr);
                    break;
                }else{
                    insertStr = createRandomString();
                }

            }
        }
    }
    public static String createRandomString(){
        StringBuilder randomStr = new StringBuilder("");
        int len = random.nextInt(10);

        for(int i = 0; i < len; i++){
            int choice = random.nextInt(3);
            switch(choice){
                case 0:
                    randomStr.append(createDigite());
                    break;
                case 1:
                    randomStr.append(createUpperLetter());
                    break;
                case 2:
                    randomStr.append(createLowerLetter());
            }
        }

        return randomStr.toString();

    }
    public static int createDigite(){
        return random.nextInt(10);
    }
    public static String createUpperLetter(){
        char c = 'A';
        c = (char) (c+random.nextInt(26));
        return String.valueOf(c);   }
    public static String createLowerLetter(){
        char c = 'a';
        c = (char) (c+random.nextInt(26));
        return String.valueOf(c);
    }
}
