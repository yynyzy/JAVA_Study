package properties_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws IOException {
        //使用 Properties 类来创建 配置文件，修改配置文件内容
        Properties properties = new Properties();
        //1.如果该文件没有 key 就是创建
        // 2.如果该文件有 key ,就是修改
        properties.setProperty("user", "严一"); // 注意保存时，是中文的 unicode码值
        properties.setProperty("pwd", "66666");
        properties.store(new FileOutputStream("src\\main\\java\\properties_\\sql2.properties"), "yyn");
        System.out.println("配置保存完毕~");
    }
}
