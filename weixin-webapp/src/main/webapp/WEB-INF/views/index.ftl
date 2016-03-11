<!DOCTYPE html>
<html lang="en">
<head>
    <@base.header/> 
    <script src="${base.prefix}/js/swiper.min.js"></script>
    <link rel='stylesheet' href='${base.prefix}/css/swiper.min.css'>
</head>
<body>	
    <!--start 幻灯片-->
    <div class="swiper-container">
        <div class="swiper-wrapper">
            <div class="swiper-slide"><img src="${base.prefix}/images/advsimgs/slide1.png"></div>
            <div class="swiper-slide"><img src="${base.prefix}/images/advsimgs/slide2.png"></div>
        </div>
        <!-- Add Pagination -->
        <div class="swiper-pagination"></div>
    </div>
    <!--end 幻灯片-->
    <!--start 业务列表-->
    <section class="list-business">
    	<ul>
        	<li><a href=""><img src="${base.prefix}/images/phone-s.png"><span>手机充值</span></a></li>
            <li><a href=""><img src="${base.prefix}/images/pig-s.png"><span>流量充值</span></a></li>
            <li><a href=""><img src="${base.prefix}/images/curve-s.png"><span>账户充值</span></a></li>
            <li><a href=""><img src="${base.prefix}/images/phone-s.png"><span>手机充值</span></a></li>
            <li><a href=""><img src="${base.prefix}/images/pig-s.png"><span>流量充值</span></a></li>
            <li><a href=""><img src="${base.prefix}/images/curve-s.png"><span>账户充值</span></a></li>
            <li><a href=""><img src="${base.prefix}/images/phone-s.png"><span>手机充值</span></a></li>
            <li><a href=""><img src="${base.prefix}/images/pig-s.png"><span>流量充值</span></a></li>
            <li><a href=""><img src="${base.prefix}/images/ellipsis-s.png" class="ellipsis"></a></li>
        </ul>
    </section>
    <!--end 业务列表-->
    <!--空对象 防止底部遮盖文章内容-->
    <section class="auto-h"></section>
    <!--footer-->
    <@base.footer/>
    <script>
		var swiper = new Swiper('.swiper-container',{
			pagination: '.swiper-pagination',
			paginationClickable: true,
	        spaceBetween: 30,
			autoplay: 2500,
        	autoplayDisableOnInteraction: false
		});
			$(".ft-nav a").removeClass("on");
			$(".ft-nav .home").addClass("on");
		
	</script>
</body>
</html>

