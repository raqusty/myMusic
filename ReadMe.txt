搭建框架

--  创建一个最新项目，用24sdk构建
    gradle:2.2.0 ,  2.14.1

一： 划分好各个模块，分好各个包: 1、common, 2、module 3、util  4、widget

    1: common
        1.1：
           --  引入之前做好的基础activity ，Fragment
        1.2: util
        1.3: widget
        1.4: net 一个okhttp网络框架，别人封装好的，支持多种格式，暂时先看过一遍，之后再研究
            (有两个地方存在内存泄漏，但不知道怎么改好。)

    2: module
        1.通用的Dialog             music.hayasi.android.com.mymusic.module.Dialog
        2.MaterialDesign相关界面   music.hayasi.android.com.mymusic.module.MaterialDesign
        3.仿iphone下拉控件         music.hayasi.android.com.mymusic.module.QQReFresh
        4.TextView相关             music.hayasi.android.com.mymusic.module.TextViewActivity
        5.footerAdapter           music.hayasi.android.com.mymusic.module.Footer
        6.新手指引模块             music.hayasi.android.com.mymusic.module.Guide
        7.贝塞尔曲线工具           music.hayasi.android.com.mymusic.module.Path
        8.Scrollable panel        music.hayasi.android.com.mymusic.module.Panel
        9.DesignActivity           实现懒加载


二：配置文件
    1：  bulid.gradle
         --  添加 multidex ，解决65K方法
         --  引入ButterKnife

    2:   manifest




