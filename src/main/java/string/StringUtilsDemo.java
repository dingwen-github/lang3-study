package string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.commons.lang3.StringUtils;

import java.sql.SQLOutput;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @program:
 * @description: StringUtils Demo
 * @author: dingwen
 * @create: 2020/12/22 14:16
 **/
public class StringUtilsDemo {
    public static void main(String[] args) {
        String str = "reflect";

        //缩短到某长度，以...结尾
//        System.out.println(StringUtils.abbreviate(str,6));
        //缩短到某长度，中间以指定字符替代
//        System.out.println(StringUtils.abbreviateMiddle(str,"***",5));

        //字符串结尾的后缀是否与你要的后缀匹配，若不匹配则添加后缀
//        System.out.println(StringUtils.appendIfMissing(str,"t"));
//        System.out.println(StringUtils.appendIfMissingIgnoreCase(str,"T"));


        //首字母大小写转换
//        System.out.println(StringUtils.capitalize(str));
//        System.out.println(StringUtils.uncapitalize(str));

        //字符串扩充至指定大小且居中（若扩充大小少于原字符大小则返回原字符，若扩充大小为负数则按照0计算）
//        System.out.println(StringUtils.center(str,-1));
//        System.out.println(StringUtils.center(str,10));
//        System.out.println(StringUtils.center(str,20,"."));

        //去除字符串中的 \n \r,只能去除结尾的 \r \n
//        System.out.println(str);
//        String handleStr = StringUtils.chomp(str);
//        System.out.println(handleStr);

        //判断字符串是否包含另一字符串
//        System.out.println(StringUtils.contains(str, 'f'));
//        System.out.println(StringUtils.containsIgnoreCase(str, "F"));

        //统计字符串在另一字符串中出现的次数
//        System.out.println(StringUtils.countMatches(str,"f"));

        //删除字符串中的所有空格
//        System.out.println(StringUtils.deleteWhitespace(str));

        //比较两个字符串返回不同的地方
//        System.out.println(StringUtils.difference(str,"dingwen"));

        //检查字符串结尾后缀是否匹配
//        System.out.println(StringUtils.endsWith(str,"ect"));
//        System.out.println(StringUtils.endsWithIgnoreCase(str,"ECT"));
//        System.out.println(StringUtils.endsWithAny(str,new String[] {null,"ect"}));

        //判断两字符串是否相同
//        System.out.println(StringUtils.equals(str,"reflect"));
//        System.out.println(StringUtils.equalsIgnoreCase(str,"reflect"));

        //比较字符串数组内的所有元素的字符序列，其实一直则返回一致的字符串，否则返回“”。回文。
//        System.out.println(StringUtils.getCommonPrefix(new String[] {"fdakfdksafhkdlsafh","fda"}));

        //正向查找字符在字符串中出现的位置
//        System.out.println(StringUtils.indexOf("andafndfafdafdfa","a"));
//        System.out.println(StringUtils.indexOf("andafndfafdafdfa","a",4));
//        System.out.println(StringUtils.ordinalIndexOf("fdafdafdafda","a",4));

        //判断字符串大小小写
//        System.out.println(StringUtils.isAllLowerCase("fdaf"));
//        System.out.println(StringUtils.isAllUpperCase("ABC"));

        //大小写转换
//        System.out.println(StringUtils.upperCase("aNs"));
//        System.out.println(StringUtils.lowerCase("FAfsdaf"));
//        System.out.println(StringUtils.swapCase("fdaFDAFADf"));

        //判空
        //对于 isEmpty ，若字符串为 null 或者 ""，则返回 true。否则返回 false
//        System.out.println(StringUtils.isEmpty(null));
//        System.out.println(StringUtils.isEmpty(""));
//        System.out.println(StringUtils.isEmpty("\n"));
//        System.out.println(StringUtils.isEmpty(" "));
//        System.out.println(StringUtils.isNotEmpty(""));

        //判空白
        //如果字符串为null、空字符串（""）、或者由于空白字符组成，则返回 true，否则返回 false
//        System.out.println(StringUtils.isBlank(null));
//        System.out.println(StringUtils.isBlank(""));
//        System.out.println(StringUtils.isBlank("\r\n\t"));


        //判断字符串数字
//        System.out.println(StringUtils.isNumeric("123"));
//        System.out.println(StringUtils.isNumeric("12 3"));
//        System.out.println(StringUtils.isNumericSpace("  55 555  5"));


        //字符串替换内容
//        System.out.println(StringUtils.replace("aba","a","z"));

//        System.out.println(StringUtils.overlay("abcdef", "zz", 2, 4));
        //---"abzzef"(指定区域)


        //多组指定替换
        //ab -> x
        // d -> y
//        System.out.println(StringUtils.replaceEach("abcd",new String[] {"ab","d"},new String[] {"x","y"}));


        //重复
//        System.out.println(StringUtils.repeat("dingwen",100));

        //反转字符
//        System.out.println(StringUtils.reverse("tab"));


        //删除
//        System.out.println(StringUtils.remove("aadfdaffafaaffaaa","a"));

        //分隔字符串
//        Consumer<String> action = System.out::println;
//        Stream.of(StringUtils.split("a.b.c", '.')).forEachOrdered(action);
        //---["a", "b", "c"]
//        Stream.of(StringUtils.split("ab:cd:ef", ":", 2)).forEachOrdered(action);

        //---["ab", "cd:ef"]
//        StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-", 2);//---["ab", "cd-!-ef"]
//        StringUtils.splitByWholeSeparatorPreserveAllTokens("ab::cd:ef", ":");//-["ab"," ","cd","ef"]


        //空格
//        System.out.println(StringUtils.stripAll(" aa f f  f  "));
        //音节
//        StringUtils.stripAccents()
//        System.out.println(StringUtils.stripToEmpty(null));
//        System.out.println(StringUtils.stripToNull(null));


            //截取字符串
//        System.out.println(StringUtils.substring("fafdaf",1,3));
//        StringUtils.left()
//        StringUtils.right()

    }

}
