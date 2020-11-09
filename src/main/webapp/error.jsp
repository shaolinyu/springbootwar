<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<head lang="zh-CN">
    <meta charset="UTF-8">
    <title>404 - Not Found</title>
    <link rel="stylesheet" href="${APP_PATH}/static/common/error/css/main.css"/>
    <!-- main stylesheet -->
    <link rel="stylesheet" href="${APP_PATH}/static/common/error/css/tipsy.css"/>
    <!-- Tipsy implementation -->
    <script src="${APP_PATH}/static/common/error/scripts/jquery-1.7.2.min.js"></script>
    <!-- uiToTop implementation -->
    <script src="${APP_PATH}/static/common/error/scripts/custom-scripts.js"></script>
    <script src="${APP_PATH}/static/common/error/scripts/jquery.tipsy.js"></script>
    <!-- Tipsy -->
    <script>
        $(document).ready(function () {
            universalPreloader();
        });
        $(window).load(function () {
            //remove Universal Preloader
            universalPreloaderRemove();
            rotate();
            dogRun();
            dogTalk();
            //Tipsy implementation
            $('.with-tooltip').tipsy({gravity: $.fn.tipsy.autoNS});
        });
    </script>
</head>
<!-- Universal preloader -->
<div id="universal-preloader">
    <div class="preloader">
        <img src="${APP_PATH}/static/common/error/images/universal-preloader.gif" alt="universal-preloader"
             class="universal-preloader-preloader"/>
    </div>
</div>
<!-- Universal preloader -->

<div id="wrapper">
    <!-- 404 graphic -->
    <div class="graphic404"></div>
    <!-- 404 graphic -->
    <!-- Not found text -->
    <div class="not-found-text">
        <h1 class="not-found-text"> 很抱歉，您所访问的页面不存在！</h1>
    </div>
    <!-- Not found text -->

    <!-- top menu -->
    <div class="top-menu">
        <a href="${APP_PATH}/index" class="with-tooltip" title="返回首页">返回首页</a> 
        | <a href="javascript:history.back(-1)"  class="with-tooltip" title="返回上一页">返回上一页</a>
        | <a href="${APP_PATH}/index" class="with-tooltip" title="进入后台管理系统">进入后台管理系统 </a> 
        | <a href="/" class="with-tooltip" title="联系我们">联系我们</a>
    </div>
    <!-- top menu -->

    <div class="dog-wrapper">
        <!-- dog running -->
        <div class="dog"></div>
        <!-- dog running -->

        <!-- dog bubble talking -->
        <div class="dog-bubble">

        </div>
        <!-- The dog bubble rotates these -->
        <div class="bubble-options">
            <p class="dog-bubble">
                Are you lost, bud? No worries, I'm an excellent guide!
            </p>

            <p class="dog-bubble">
                <br/>
                Arf! Arf!
            </p>

            <p class="dog-bubble">
                <br/>
                Don't worry! I'm on it!
            </p>

            <p class="dog-bubble">
                I wish I had a cookie<br/><img style="margin-top:8px"
                                               src="${APP_PATH}/static/common/error/images/cookie.png"
                                               alt="cookie"/>
            </p>

            <p class="dog-bubble">
                <br/>
                Geez! This is pretty tiresome!
            </p>

            <p class="dog-bubble">
                <br/>
                Am I getting close?
            </p>

            <p class="dog-bubble">
                Or am I just going in circles? Nah...
            </p>

            <p class="dog-bubble">
                <br/>
                OK, I'm officially lost now...
            </p>

            <p class="dog-bubble">
                I think I saw a <br/><img style="margin-top:8px"
                                          src="${APP_PATH}/static/common/error/images/cat.png" alt="cat"/>
            </p>

            <p class="dog-bubble">
                What are we supposed to be looking for, anyway? @_@
            </p>
        </div>
        <!-- The dog bubble rotates these -->
        <!-- dog bubble talking -->
    </div>
    <!-- planet at the bottom -->
    <div class="planet"></div>
    <!-- planet at the bottom -->
</div>
</body>
</html>