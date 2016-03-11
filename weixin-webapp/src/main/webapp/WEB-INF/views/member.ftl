<!DOCTYPE html>
<html lang="en">
<head>
    <@base.header/>
</head>
<body>	
  	<!--header-->
    <header class="ucenter-hd">
    	<img src="${base.prefix}/images/headimg.jpg">
    </header>
    <!--nav-->
    <nav class="ucenter-nav">
    	<span>
        	<strong>0</strong>
            流量余额
        </span>
        <span>
        	<strong>0.00</strong>
            累计利息
        </span>
        <span>
        	<strong>0</strong>
            账户余额
        </span>
    </nav>
    <!--oper-list-u-->
    <section class="oper-list-u">
    	<div class="items-u trade">
        	<a href="">
            	<img src="${base.prefix}/images/wallet-s.png">
                <span>交易详情</span>
                <i class="arrow-r"></i>
            </a>
        </div>
    </section>
    <section class="oper-list-u info-list-u">
    	<div class="items-u">
        	<a href="">
            	<img src="${base.prefix}/images/ticket-s.png">
                <span>我的券</span>
                <i class="arrow-r"></i>
            </a>
        </div>
        <div class="items-u">
        	<a href="">
            	<img src="${base.prefix}/images/card-s.png">
                <span>个人信息</span>
                <i class="arrow-r"></i>
            </a>
        </div>
        <div class="items-u">
        	<a href="">
            	<img src="${base.prefix}/images/ticket-s.png">
                <span>我的券</span>
                <i class="arrow-r"></i>
            </a>
        </div>
        <div class="items-u">
        	<a href="">
            	<img src="${base.prefix}/images/card-s.png">
                <span>个人信息</span>
                <i class="arrow-r"></i>
            </a>
        </div>
    </section>
    <!--空对象 防止底部遮盖文章内容-->
    <section class="auto-h"></section>
    <!--footer-->
    <@base.footer/>
</body>
</html>

