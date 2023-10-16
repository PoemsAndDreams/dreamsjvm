/**
 * @author PoemsAndDreams
 * @date 2023-10-11 23:33
 * 解析参数
 */
public class JvmArguments {

    /**
     * help帮助
     */
    private String help;

    /**
     * 查看版本
     */
    private String version;

    /**
     * classPath路径
     */
    private String classpath;


    /**
     * 解析参数
     * @param args
     */
    public static void parseJVM(String[] args){
        //暂时如此输出
        System.out.println(args[1]);
    }


}
