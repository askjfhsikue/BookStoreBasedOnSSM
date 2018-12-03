<%--
  Created by IntelliJ IDEA.
  User: danchun
  Date: 2018/12/1
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="description" content="">
  <meta name="keywords" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <title>BLOG index with sidebar & slider  | Amaze UI Examples</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp"/>
  <link rel="icon" type="image/png" href="<%=basePath%>/views/assets/i/favicon.png">
  <meta name="mobile-web-app-capable" content="yes">

  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="apple-mobile-web-app-status-bar-style" content="black">
  <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
  <link rel="apple-touch-icon-precomposed" href="<%=basePath%>/views/assets/i/app-icon72x72@2x.png">
  <meta name="msapplication-TileImage" content="<%=basePath%>views/assets/i/app-icon72x72@2x.png">
  <meta name="msapplication-TileColor" content="#0e90d2">

  <link rel="icon" type="image/png" href="<%=basePath%>views/assets/i/book.png">
  <link rel="stylesheet" href="<%=basePath%>views/assets/css/amazeui.min.css">
  <%--<link rel="stylesheet" href="<%=basePath%>views/assets/css/admin.css">--%>
  <link rel="stylesheet" href="<%=basePath%>views/assets/css/app.css">

  <script src="<%=basePath%>views/assets/js/jquery.min.js"></script>
  <script src="<%=basePath%>views/assets/js/amazeui.min.js"></script>
</head>

<body id="blog">

<header class="am-g am-g-fixed blog-fixed blog-text-center blog-header">
    <div class="am-u-sm-8 am-u-sm-centered">
        <!-- <img width="200" src="http://s.amazeui.org/media/i/brand/amazeui-b.png" alt="Amaze UI Logo"/> -->
        <img width="50" src="<%=basePath%>views/assets/i/favicon.png" alt="UI Logo"/>
        <img width="200" src="<%=basePath%>views/assets/i/wordLogo.png" alt="UI Logo"/>

        <h2 class="am-hide-sm-only">君子曰：学不可以已。 --《劝学》 荀子</h2>
    </div>
</header>
<hr>
<!-- nav start -->
<nav class="am-g am-g-fixed blog-fixed blog-nav">

  <div class="am-collapse am-topbar-collapse" id="blog-collapse">
    <ul class="am-nav am-nav-pills am-topbar-nav">
      <li class="am-active"><a href="/user/">首页</a></li>
      <li class="am-dropdown" data-am-dropdown>
        <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
          图书种类 <span class="am-icon-caret-down"></span>
        </a>
        <ul class="am-dropdown-content">
          <li><a href="/user/">1. 体育</a></li>
          <li><a href="/user/">2. 文学</a></li>
          <li><a href="编程.html">3. 编程</a></li>
          <li><a href="教材.html">4. 教材</a></li>
        </ul>
      </li>
    </ul>
	<ul class="am-nav  am-topbar-right am-nav am-nav-pills">
	<li><a class="am-btn am-btn-warning" href="#">
      <i class="am-icon-shopping-cart"></i>&nbsp;购物车</a>
	</li>
	<li><a href="#"><i class="am-icon-user"></i>&nbsp;${username}</a></li>
	</ul>
  </div>
</nav>
<hr>
<!-- nav end -->

<style>
   .gallery-list li {
  padding: 10px;
}

.gallery-list a {
  color: #666;
}

.gallery-list a:hover {
  color: #3bb4f2;
}
.book-btn button{
    width: 49%;
}
</style>

<!-- content srart -->
<div class="am-g am-g-fixed blog-fixed">
    <ul class="am-avg-sm-2 am-avg-md-4 am-avg-lg-4 am-margin gallery-list">
        <li>
          <a href="#">
            <img class="am-img-thumbnail am-img-bdrs" src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543502432082&di=2fad112ce5f202f27bbf829289deed56&imgtype=0&src=http%3A%2F%2Fbmzx.zslib.com.cn%2Fgivebook%2Fbookimage%2F2009%2F20117219331.jpg" alt=""/>
            <div class="gallery-title">远方 有一个地方 那里种有我们的梦想</div>
            <div class="gallery-desc">2375-09-26</div>
          </a>
          <div class="book-btn">
            <button class="am-btn am-btn-sm am-btn-success" href="#"><i class="am-icon-shopping-cart"></i>  加入购物车</button>
            <button class="am-btn am-btn-sm am-btn-secondary" href="#"><i class="am-icon-check"></i>  直接购买</button>
          </div>
        </li>

      <li>
        <a href="#">
          <img class="am-img-thumbnail am-img-bdrs" src="${book.image}" alt=""/>
          <div class="gallery-title">${book.bookName}</div>
          <div class="gallery-desc">2375-09-26</div>
        </a>
        <div class="book-btn">
          <button class="am-btn am-btn-sm am-btn-success" href="#"><i class="am-icon-shopping-cart"></i>  加入购物车</button>
          <button class="am-btn am-btn-sm am-btn-secondary" href="#"><i class="am-icon-check"></i>  直接购买</button>
        </div>
      </li>
      <li>
        <a href="#">
          <img class="am-img-thumbnail am-img-bdrs" src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543502432082&di=2fad112ce5f202f27bbf829289deed56&imgtype=0&src=http%3A%2F%2Fbmzx.zslib.com.cn%2Fgivebook%2Fbookimage%2F2009%2F20117219331.jpg" alt=""/>
          <div class="gallery-title">远方 有一个地方 那里种有我们的梦想</div>
          <div class="gallery-desc">2375-09-26</div>
        </a>
        <div class="book-btn">
          <button class="am-btn am-btn-sm am-btn-success" href="#"><i class="am-icon-shopping-cart"></i>  加入购物车</button>
          <button class="am-btn am-btn-sm am-btn-secondary" href="#"><i class="am-icon-check"></i>  直接购买</button>
        </div>
      </li>
      <li>
        <a href="#">
          <img class="am-img-thumbnail am-img-bdrs" src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543502432082&di=2fad112ce5f202f27bbf829289deed56&imgtype=0&src=http%3A%2F%2Fbmzx.zslib.com.cn%2Fgivebook%2Fbookimage%2F2009%2F20117219331.jpg" alt=""/>
          <div class="gallery-title">远方 有一个地方 那里种有我们的梦想</div>
          <div class="gallery-desc">2375-09-26</div>
        </a>
        <div class="book-btn">
          <button class="am-btn am-btn-sm am-btn-success" href="#"><i class="am-icon-shopping-cart"></i>  加入购物车</button>
          <button class="am-btn am-btn-sm am-btn-secondary" href="#"><i class="am-icon-check"></i>  直接购买</button>
        </div>
      </li>
      <li>
        <a href="#">
          <img class="am-img-thumbnail am-img-bdrs" src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543502432082&di=2fad112ce5f202f27bbf829289deed56&imgtype=0&src=http%3A%2F%2Fbmzx.zslib.com.cn%2Fgivebook%2Fbookimage%2F2009%2F20117219331.jpg" alt=""/>
          <div class="gallery-title">远方 有一个地方 那里种有我们的梦想</div>
          <div class="gallery-desc">2375-09-26</div>
        </a>
        <div class="book-btn">
          <button class="am-btn am-btn-sm am-btn-success" href="#"><i class="am-icon-shopping-cart"></i>  加入购物车</button>
          <button class="am-btn am-btn-sm am-btn-secondary" href="#"><i class="am-icon-check"></i>  直接购买</button>
        </div>
      </li>
      <li>
        <a href="#">
          <img class="am-img-thumbnail am-img-bdrs" src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543502432082&di=2fad112ce5f202f27bbf829289deed56&imgtype=0&src=http%3A%2F%2Fbmzx.zslib.com.cn%2Fgivebook%2Fbookimage%2F2009%2F20117219331.jpg" alt=""/>
          <div class="gallery-title">远方 有一个地方 那里种有我们的梦想</div>
          <div class="gallery-desc">2375-09-26</div>
        </a>
        <div class="book-btn">
          <button class="am-btn am-btn-sm am-btn-success" href="#"><i class="am-icon-shopping-cart"></i>  加入购物车</button>
          <button class="am-btn am-btn-sm am-btn-secondary" href="#"><i class="am-icon-check"></i>  直接购买</button>
        </div>
      </li>




    </ul>
</div>
<!-- content end -->

<footer class="blog-footer">
  <div class="blog-text-center">by 计算机161班<br>肖枢贤 简斌兵 陈俊卿 石立军 黄宁</div>
</footer>


</body>
</html>