package com.aaa.yzq.springcloud.ftpconfig;

import java.util.Random;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2019/11/25 13:58
 * @Version     : 1.0
 */
public class FileNameUtil {
    public static String getFileName(){
        //获取当前系统时间的毫秒数
        long timeMillis = System.currentTimeMillis();
        //生成随机数
        Random random = new Random();
        int ran = random.nextInt(999);
        // %:占位符   03:三位(如果不足三位往前补0)  d:数字
        String fileName=timeMillis+String.format("%03d",ran);
        return fileName;
    }
}
