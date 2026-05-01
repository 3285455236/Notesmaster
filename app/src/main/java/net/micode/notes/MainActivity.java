
package net.micode.notes;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
/**
 * 文件名：MainActivity.java
 * 功能：小米便签APP主界面，负责展示便签列表
 * 负责人：艾伟龙（代码注释）
 * 核心作用：初始化应用、跳转至便签列表页面
 */
public class MainActivity extends AppCompatActivity {
    /**
     * 页面创建初始化方法
     * 作用：加载布局、初始化控件、数据
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        // 加载主页面布局文件
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}