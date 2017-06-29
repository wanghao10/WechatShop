<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="author" content="m.178hui.com" />
<meta name="applicable-device" content="mobile" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<title>好吃的校园商城</title>

<link href="${pageContext.request.contextPath}/frozenui/css/frozen.css"
	rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/css/baoliao.css"
	rel="stylesheet" type="text/css">

<link href="${pageContext.request.contextPath}/css/owl.carousel.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/public.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/index.css"
	rel="stylesheet" type="text/css" />

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/gwcgoodscar.css">
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
<script src="${pageContext.request.contextPath}/js/owl.carousel.min.js"></script>
<script src="${pageContext.request.contextPath}/layer/layer.js"></script>
<script>
$(window).load(function() {
	$("#status").fadeOut();
	$("#preloader").delay(350).fadeOut("slow");
})
</script>
<script type="text/javascript">
$(document).ready(function(){
	$(".shaixuan").click(function(event){
		event.stopPropagation(); 
		$(".shaixuan_box").show();
		$(".shaixuan_box").animate({right:'100%'});
		$("html,body").css("overflow","hidden");
	});
	$(document).click(function(event){
		$(".shaixuan_box").animate({right:'-100%'});
		$(".shaixuan_box").hide(5);
		$("html,body").css("overflow","");
	});    
});
</script>
</head>

<body>

	<div class="settlement">
		<button style="width: 25%; float: left; line-height: 40px;">联系客服</button>
		<button
			style="width: 20%; float: right; background-color: #ff3300; line-height: 40px;">立即购买</button>
		<button
			style="width: 25%; float: right; line-height: 40px; background-color: #ffc500;">加入购物车</button>
		<!-- <div class="settlement_left">
        <font class="zongji">总计：</font><font class="money">￥0</font><br />
        （共0件，不包含运费）
      </div>
        <a href="dd.html"><input type="button" value="加入购物车" /></a>
      <div class="settlement_right">
        <a href="dd.html"><input type="button" value="立即购买" /></a>
      </div> -->
	</div>
	<div class="mobile">
		<!--页面加载 开始-->
		<div id="preloader">
			<div id="status">
				<p class="center-text">
					<span>拼命加载中···</span>
				</p>
			</div>
		</div>
		<!--页面加载 结束-->
		<!--header 开始-->
		<header>
			<div class="header">
				<a class="new-a-back" onclick="window.history.go(-1);"> <span><img
						src="${pageContext.request.contextPath}/images/iconfont-fanhui.png"></span>
				</a>
				<h2>商品详细信息</h2>
				<!-- <div class="head_right" style="top:13px;"><a href="baoliao.html" style="color:#FFFFFF; font-size:14px;">返回列表</a></div> -->
			</div>
		</header>
		<!--header 结束-->
		<div class="search w"></div>
		<div class="m_banner" id="owl">
			<a href="#" class="item"><img
				src="${pageContext.request.contextPath}/images/10250290397.png"></a>
			<a href="http://www.178hui.com" class="item"><img
				src="${pageContext.request.contextPath}/images/10225357963.jpg"></a>
		</div>
		<div class="view w">

			<div class="bl_view_title">
				${ware.name}
			</div>
			<div class="bl_view_note">${ware.describe}</div>
			<div class="bl_view_tag">
				<div class="bl_view_price">${ware.price}</div>
				<div class="bl_view_oprice">${ware.yuanjia}</div>
				<div class="bl_view_mall">商城：好吃的校园商城</div>
			</div>
			<div class="bl_view_tag">
				<div class="bl_view_user">所在楼号：${ware.managerid}</div>
				<div class="bl_view_time">时间：${ware.date}</div>
			</div>
		</div>
	</div>
</body>
</html>