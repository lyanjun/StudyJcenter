package android.lyan.helloutils.toast;

import android.content.Context;
import android.widget.Toast;

/**
 * Author LYJ
 * Created on 2016/11/1.
 * Time 14:57
 */

public class ToastUtils {

    /**
     * 吐司“Hello world”
     * @param context
     */
    public static void toastHello(Context context){
        Toast.makeText(context, "Hello Android", Toast.LENGTH_SHORT).show();
    }

    /**
     * 获取一个字符串
     * @return
     */
    public static String getStringTxt(){
        return "使用bintray-release插件将Moudle上传到Jcenter库中";
    }
}
