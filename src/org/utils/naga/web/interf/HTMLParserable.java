package org.utils.naga.web.interf;

import java.io.IOException;

import org.jsoup.nodes.Document;
import org.utils.naga.interf.UtilsInterface;

/**
 * <p>
 * HTML解析的公共接口
 * </p>
 * Create Date: 2015年12月15日
 * Last Modify: 2016年5月26日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.1
 */
public interface HTMLParserable extends UtilsInterface {

    /**
     * 请求网页返回信息
     * 
     * @param urlPath
     *      请求的URL地址
     * @return
     *      返回网页页面信息
     * @throws IOException
     *      网页解析出错
     */
    public Document requestHTML(String urlPath) throws IOException;
    
    /**
     * 请求网页返回信息
     * 
     * @param url
     *      请求的URL地址
     * @return
     *      网页页面信息
     * @throws IOException
     *      网页解析出错
     */
    public String requestHTMLToString(String url) throws IOException;
    
    /**
     * 请求网页返回可见信息
     * (即是网页上可显示上的信息)
     * 
     * @param url
     *      请求的URL地址
     * @return
     *      返回网页页面信息
     * @throws IOException
     *      网页解析出错
     */
    public String requestHTMLText(String url) throws IOException;
    
    /**
     * 下载HTML网页
     * 
     * @param url
     *      URL地址
     * @param savePath
     *      保存的路径
     * @throws IOException
     *      读写异常
     */
    public void downloadHTML(String url, String savePath) throws IOException;
    
    /**
     * 请求网页返回信息
     * 
     * @param url
     *      请求的URL地址
     * @param delay
     *      延时
     * @return
     *      返回网页页面信息
     * @throws IOException
     *      网页解析异常
     */
    public Document requestHTML(String url, int delay) throws IOException;
    
    /**
     * 请求网页返回信息
     * 
     * @param url
     *      请求的URL地址
     * @param delay
     *      延时
     * @return
     *      网页页面信息
     * @throws IOException
     *      网页解析出错
     */
    public String requestHTMLToString(String url, int delay) throws IOException;
    
    /**
     * 请求网页返回可见信息
     * (即是网页上可显示上的信息)
     * 
     * @param url
     *      请求的URL地址
     * @param delay
     *      延时
     * @return
     *      返回网页页面信息
     * @throws IOException
     *      网页解析出错
     */
    public String requestHTMLText(String url, int delay) throws IOException;
    
    /**
     * 下载HTML网页
     * 
     * @param url
     *      URL地址
     * @param savePath
     *      保存的路径
     * @param delay
     *      延时
     * @throws IOException
     *      读写异常
     */
    public void downloadHTML(String url, String savePath, int delay) throws IOException;
    
    /**
     * 请求网页返回信息
     * 
     * @param url
     *      请求的URL地址
     * @param delay
     *      延时
     * @param redirect
     *      是否重定位
     * @return
     *      网页页面信息
     * @throws IOException
     *      网页解析异常
     */
    public Document requestHTML(String url, int delay, boolean redirect) throws IOException;
    
    /**
     * 请求网页返回信息
     * 
     * @param url
     *      请求的URL地址
     * @param delay
     *      延时
     * @param redirect
     *      是否重定位
     * @return
     *      网页页面信息
     * @throws IOException
     *      网页解析出错
     */
    public String requestHTMLToString(String url, int delay, boolean redirect) throws IOException;
    
    /**
     * 请求网页返回可见信息
     * (即是网页上可显示上的信息)
     * 
     * @param url
     *      请求的URL地址
     * @param delay
     *      延时
     * @param redirect
     *      是否重定位
     * @return
     *      网页页面信息
     * @throws IOException
     *      网页解析出错
     */
    public  String requestHTMLText(String url, int delay, boolean redirect) throws IOException;
}
