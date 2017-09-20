package com.by.source.func;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 文件操作
 * 
 * @author zwp
 *
 */
public class ZOperationFile {

    // 分割线
    private final String HR = "# ==================================================================\n";
    // 待写入文件串
    private StringBuilder sb = new StringBuilder();
    // 编码
    private final String ENCODE = "UTF-8";
    
    public static void main(String[] args) {
        
        String dir = "E:/javaSource";
        String f = "E:/javaSource/f.log";
        try {
            ZOperationFile a = new ZOperationFile();
            StringBuilder sb = a.recursionFileFolder(dir);
            a.writerStringToFile(f, sb);
        } catch(ZFileException zfe) {
            zfe.printStackTrace();
        }
    }
    
    /**
     * 递归
     * 
     * @param dir 路径
     * @return StringBuilder sb 『待写入文件串』
     * @throws ZFileException
     */
    public StringBuilder recursionFileFolder(String dir) throws ZFileException {
        File $dir = new File(dir);
        if($dir.exists()) { //判断此抽象路径是否存在
            File[] files = $dir.listFiles();
            if(files.length == 0) {
                System.out.println("路径下面为空！");
                return null;
            } else {
                for (File file : files) {
                    if(file.isDirectory()) { //若为路径
                        sb.append(HR + "类型：『文件夹』" + file.getAbsolutePath() + "\n" + HR);
                        System.out.print(HR);
                        System.out.println("类型：『文件夹』" + file.getAbsolutePath());
                        System.out.print(HR);
                        recursionFileFolder(file.getAbsolutePath());
                    } else {
                        sb.append("类型：『文　件』" + file.getAbsolutePath() + "\n");
                        System.out.println("类型：『文　件』" + file.getAbsolutePath());
                    }
                }
            }
        } else {
            throw new ZFileException("抽象路径不存在！");
        }
        
        return sb;
    }
    
    /**
     * 写入文件
     * 
     * @param f 文件『File』或者路径『String』
     * @param sb
     * @throws ZFileException 
     */
    public void writerStringToFile(Object f, StringBuilder sb) throws ZFileException {
        File $f;
        if(f instanceof File) {
            $f = (File) f;
        } else if(f instanceof String) {
            $f = new File((String) f);
        } else {
            throw new ZFileException("传参有误：『" + f.getClass() + "』");
        }
        FileOutputStream fo = null;
        OutputStreamWriter osw = null;
        try {
            fo = new FileOutputStream($f);
            osw = new OutputStreamWriter(fo, ENCODE);
            osw.write(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(osw != null) {
                    osw.close();
                }
                if(fo != null) {
                    fo.close();
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * 文件操作异常
 * 
 * @author zwp
 *
 */
class ZFileException extends Exception{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    public ZFileException(String message) {
        super(message);
    }
}


//String 字符串常量
//StringBuffer 字符串变量（线程安全）
//StringBuilder 字符串变量（非线程安全）


// # 异常 『流关闭的顺序引起的 ： 后开启的先关闭』
//java.io.IOException: Stream Closed
//at java.io.FileOutputStream.writeBytes(Native Method)
//at java.io.FileOutputStream.write(FileOutputStream.java:326)
//at sun.nio.cs.StreamEncoder.writeBytes(StreamEncoder.java:221)
//at sun.nio.cs.StreamEncoder.implClose(StreamEncoder.java:316)
//at sun.nio.cs.StreamEncoder.close(StreamEncoder.java:149)
//at java.io.OutputStreamWriter.close(OutputStreamWriter.java:233)
//at com.by.test.A.writerStringToFile(A.java:104)
//at com.by.test.A.main(A.java:31)
