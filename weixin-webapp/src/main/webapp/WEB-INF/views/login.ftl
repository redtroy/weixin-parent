<!DOCTYPE html>
<html lang="en">
<head>
<@base.header/>

</head>
<body>	
  	<form action="home.html" name="loginfrm" method="post" class="login-frm">
    	<div class="form-control">
        	<label>账号：</label>
            <input type="text" placeholder="请输入手机号/用户名">
        </div>
        <div class="form-control">
        	<label>密码：</label>
            <input type="password">
        </div>
        <div class="form-control">
        	<label>验证码：</label>
            <input type="text">
            <span class="codeimg"><img src="${base.prefix}/images/yzm.png"></span>
        </div>
        <div class="form-control">
        	<div class="form-control-oper">
	        	<a href="javascript:void(0);"><span><i></i></span>记住密码</a>
                <a href="javascript:void(0);"><span><i></i></span>自动登陆</a>
                <a href="javascript:void(0);">忘记密码?</a>
            </div>
        </div>
        <div class="form-control">        	
            <input type="button" value="登录" id="submit-btn">
        </div>
    </form>
    <script>
	$(document).ready(function() {
        $(".form-control-oper a").click(function(){
			$(this).children("span").children("i").toggle();
		});
        $("#submit-btn").click(function(){
        	$(".login-frm").submit();
        });
    });
	</script>
</body>
</html>

