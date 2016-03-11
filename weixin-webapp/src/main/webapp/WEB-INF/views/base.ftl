<#assign prefix="http://esales.fhcard.cn"/>
<#macro header>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width， initial-scale=1，minimum-scale=1.0， maximum-scale=1.0">
    <meta content="yes" name="apple-mobile-web-app-capable"/>
    <meta content="black" name="apple-mobile-web-app-status-bar-style"/>
    <meta name='keywords' content='XXXX'/>
    <meta name='description' content='XXXX'/>
    <link rel='stylesheet' href='${prefix}/css/base.css'>
    <link rel='stylesheet' href='${prefix}/css/style.css'>
    <script src="${prefix}/js/jquery.1.11.1.js"></script>
    <title>江山缴费</title>
</#macro>
<#macro footer>
<footer class="ft-nav">
	<a href="home.html" class="home"><span></span>首页</a>
	<a href="recharge.html" class="full"><span></span>手机充值</a>
	<a href="member.html" class="my"><span></span>我</a>
</footer>
</#macro>
<#macro pay>
<div class="zhifu">
	<div class="tit-zhifu">选择支付方式</div>
	<ul>
		<li><a href="javascript:void(0);" class="on"><img
				src="${prefix}/images/icon-weixin.png">微信支付<span><i></i></span></a></li>
		<li><a href="javascript:void(0);"><img
				src="${prefix}/images/icon-hanbi.png">余额支付<span><i></i></span></a></li>
		<li><a href="javascript:void(0);"><img
				src="${prefix}/images/icon-hanbi.png">充值卡充值<span><i></i></span></a></li>
	</ul>
</div>
</#macro>