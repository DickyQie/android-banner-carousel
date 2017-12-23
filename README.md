### Android-----------广告图片轮播控件 
<p>&nbsp;Banner广告图片轮播控件，支持无限循环和多种主题，可以灵活设置轮播样式、动画、轮播和切换时间、位置、图片加载框架等！</p> 
<p>很多Android APP中都有广告栏，我也用过很多次了，特来写一篇博文。</p> 
<p>先来看看效果图：</p> 
<p>&nbsp;&nbsp;&nbsp;&nbsp; <img alt="" height="613" src="http://images2017.cnblogs.com/blog/1041439/201712/1041439-20171222163425303-2057946364.gif" width="436"></p> 
<p>&nbsp;</p> 
<p>使用你可以直接引入依赖：</p> 
<pre><code class="language-java">compile 'com.youth.banner:banner:1.4.10'  </code></pre> 
<p>建议不要引入，直接导入library包，因为可以修改里面的相关代码，改成你想要的效果。</p> 
<p><img alt="" src="http://images2017.cnblogs.com/blog/1041439/201712/1041439-20171222164035193-2110398593.png"></p> 
<p>使用方式也很简单：</p> 
<pre><code class="language-html">&lt;com.youth.banner.Banner
        android:id="@+id/banner"
        android:layout_width="match_parent"
        android:layout_height="240dp"/&gt;</code></pre> 
<pre><code class="language-java">banner.setDelayTime(4000);//滚动时间
        //默认是CIRCLE_INDICATOR
        banner.setImages(Util.showListImgUrl())
                .setBannerTitles(Util.showListTitle())
                .setBannerStyle(BannerConfig.NOT_INDICATOR)
                .setImageLoader(new GlideImageLoader())
                .setOnBannerListener(this)
                .start();</code></pre> 
<p>相关设置：</p> 
<pre><code class="language-java">  Banner banner = (Banner) findViewById(R.id.banner);
    //设置banner样式
    banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);
    //设置图片加载器
    banner.setImageLoader(new GlideImageLoader());
    //设置图片集合
    banner.setImages(images);
    //设置banner动画效果
    banner.setBannerAnimation(Transformer.DepthPage);
    //设置标题集合（当banner样式有显示title时）
    banner.setBannerTitles(titles);
    //设置自动轮播，默认为true
    banner.isAutoPlay(true);
    //设置轮播时间
    banner.setDelayTime(1500);
    //设置指示器位置（当banner模式中有指示器时）
    banner.setIndicatorGravity(BannerConfig.CENTER);
    //banner设置方法全部调用完毕时最后调用
    banner.start();</code></pre> 
<p>混淆代码：</p> 
<pre><code class="language-java"># glide 的混淆代码
-keep public class * implements com.bumptech.glide.module.GlideModule
-keep public enum com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$** {
  **[] $VALUES;
  public *;
}
# banner 的混淆代码
-keep class com.youth.banner.** {
    *;
 }</code></pre> 
<p>更多相关属性请看：&nbsp;https://github.com/youth5201314/banner</p> 
<span id="OSC_h3_1"></span>

