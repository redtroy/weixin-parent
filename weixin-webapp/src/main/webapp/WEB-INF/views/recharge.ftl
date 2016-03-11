<!DOCTYPE html>
<html lang="en">
<head>
	<@base.header/>
    <script src="${base.prefix}/js/TouchSlide.1.1.js"></script>  
</head>
<body>	
    <div class="tabBox" id="tabBox1">    	     
    	<!--tab-->
        <div class="hd zftc_tab">
        	<ul>
                <li class="on"><a href="javascript:void(0)" class="jyjy">流量充值</a></li>
                <li><a href="javascript:void(0)" class="kxkx">话费充值</a></li>
            </ul>
        </div>        
        <div id="tabBox1-bd" class="bd">        	
            <!--流量充值-->   
            <section class="con-tab">
            	<form action="" method="post" class="chongzhi-frm" name="czfrm">
                    <!--充值-->
                    <div class="chongzhi">
                      <div class="jiaofei-numb">181 0811 8098</div> 
                      <p>江苏电信<span>支持2G/3G/4G</span></p> 	
                      <ul class="chongzhi-xz">
                        <li class="hover"><a href="javascript:void(0);">5M<span>售价0.95元</span></a><i class="closed"></i></li>
                        <li><a href="javascript:void(0);">10M<span>售价0.95元</span></a><i class="closed"></i></li>
                        <li><a href="javascript:void(0);">30M<span>售价0.95元</span></a><i class="closed"></i></li>
                        <li><a href="javascript:void(0);">50M<span>售价0.95元</span></a><i class="closed"></i></li>
                        <li><a href="javascript:void(0);">100M<span>售价0.95元</span></a><i class="closed"></i></li>
                        <li><a href="javascript:void(0);">200M<span>售价0.95元</span></a><i class="closed"></i></li>
                        <li><a href="javascript:void(0);">500M<span>售价0.95元</span></a><i class="closed"></i></li>
                        <li><a href="javascript:void(0);">1G<span>售价0.95元</span></a><i class="closed"></i></li>
                      </ul>              
                    </div>    
                    <!--选择支付方式-->
                    <@base.pay/>
                    <!--立即充值-->
                    <input type="submit" class="btn-recharge" value="立即充值">
                </form>
                <!--充值提醒-->
                <div class="chongzhi-tip">
                	<h3>江苏电信流量充值提醒</h3>
                    <p>到账时间：<span>5分钟内</span></p>
                    <p>生效时间时间：<span>充值成功即时生效</span></p>
                    <p>到账时间：<span>5分钟内</span></p>
                    <p>生效时间时间：<span>充值成功即时生效</span></p>
                    <p>发送短信指令‘108’至10001，即可查询流量</p>
                </div>
            </section>          
            <!--话费充值-->  
            <section class="con-tab">
            	<form action="" method="post" class="chongzhi-frm" name="czfrm">
                    <!--充值-->
                    <div class="chongzhi">
                      <div class="jiaofei-numb">181 0811 8098</div> 
                      <p>江苏电信<span>支持2G/3G/4G</span></p> 	
                      <ul class="chongzhi-xz">
                        <li class="hover"><a href="javascript:void(0);">30元<span>售价29.99元</span></a><i class="closed"></i></li>
                        <li><a href="javascript:void(0);">50元<span>售价49.95元</span></a><i class="closed"></i></li>
                        <li><a href="javascript:void(0);">100元<span>售价98.95元</span></a><i class="closed"></i></li>
                        <li><a href="javascript:void(0);">150元<span>售价147.95元</span></a><i class="closed"></i></li>
                      </ul>              
                    </div>    
                    <!--选择支付方式-->
                     <@base.pay/>
                    <!--立即充值-->
                    <input type="submit" class="btn-recharge" value="立即充值">
                </form>
                <!--充值提醒-->
                <div class="chongzhi-tip">
                	<h3>江苏电信流量充值提醒</h3>
                    <p>到账时间：<span>5分钟内</span></p>
                    <p>生效时间时间：<span>充值成功即时生效</span></p>
                    <p>到账时间：<span>5分钟内</span></p>
                    <p>生效时间时间：<span>充值成功即时生效</span></p>
                    <p>发送短信指令‘108’至10001，即可查询流量</p>
                </div>
            </section>
        </div>
    </div>
  	<!--空对象 防止底部遮盖文章内容-->
    <section class="auto-h"></section>
    <!--footer-->
    <@base.footer/>
    <script>
	 TouchSlide({
        slideCell: "#tabBox1",
        endFun: function (i) { //高度自适应
            var bd = document.getElementById("tabBox1-bd");
          bd.parentNode.style.height = bd.children[i].children[0].offsetHeight+bd.children[i].children[1].offsetHeight + "px";
            if (i > 0)bd.parentNode.style.transition = "200ms";//添加动画效果
        }
    });
	//选择金额
	$(".chongzhi-xz li").click(function(){
		$(this).addClass("hover");
		$(this).siblings().removeClass("hover");
	});
	
	//支付方式
	$(".zhifu li").click(function(){
		$(this).children("a").addClass("on");
		$(this).siblings().children("a").removeClass("on");
	});
	</script>
</body>
</html>

