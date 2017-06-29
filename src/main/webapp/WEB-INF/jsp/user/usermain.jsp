<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>好吃的校园商城</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="shortcut icon" type="image/x-icon"
	href="javascript:void(0)http://s1.tthunbohui.cn/static/favicon.ico">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/jiehun.m.min.1f8f2b3d.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/hh.css">


<script async=""
	src="${pageContext.request.contextPath}/js/tracker-min.js"></script>
<script>
	_hjc = window['_hjc'] || [];
	_hjc.push(
		['csrf.enabled', false],
		['id', 1996909000],
		['image.lazyload', true], 
		['user.monitor', true], 
		['city.mark', 'bj'],
		['debug',false],
		['site.analytics', 'http://tracker.hunbasha.cn/tracker-min.js']
	);
</script>
<script
	src="${pageContext.request.contextPath}/js/hapj.m.min.e664ec32.js"></script>
<script src="${pageContext.request.contextPath}/js/m.1328748e.js"></script>

<script>
		// 家芭莎and婴芭莎
		if(location.hostname.indexOf('jiabasha')>=0){
			(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
					(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
				m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
			})(window,document,'script','https://www.google-analytics.com/analytics.js','ga');
			ga('create', 'UA-31519562-4', 'auto');
			ga('send', 'pageview');
		}else if(location.hostname.indexOf('yingbasha')>=0){
			(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
					(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
				m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
			})(window,document,'script','https://www.google-analytics.com/analytics.js','ga');
			ga('create', 'UA-31519562-4', 'auto');
			ga('send', 'pageview');
		}else {
					}
	</script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/my.6bf9ede3.css">
</head>
<body>


	<!--社区和问答的主页面用下面的头部样式-->
	<header class="new_hd">
		<a class="back" href="javascript:void(0)javascript:history.go(-1)">返回</a>
		<div>个人中心</div>
		<a class="hd_search" style="right: 15px;" href="">&nbsp;</a>
	</header>

	<article id="bd">
		<div class="center">
			<div class="userme">
				<span class="img"><a href=""><img
						src=""></a></span>
				<dl class="ctn">
					<dt>名称</dt>
					<dd>账号</dd>
				</dl>
			</div>
			<div class="myfunc">
				<ul class="row" data-columns="3">
					<li><em>0</em>积分</li>
					<li>
						<!-- <div id="" class="qdfunc">今日签到</div> -->
					</li>
				</ul>
			</div>
			<div class="enter">
				<ul>
					<li><a href="#"><b class="yuyue"><img height="33px"
								src="${pageContext.request.contextPath}/images/dz.png" alt=""></b><br>
							<span>待支付</span></a></li>
					<li><a href="#"><b class="dingdan"><img height="33px"
								src="${pageContext.request.contextPath}/images/df.png" alt=""></b><br>
							<span>待发货</span></a></li>
					<li><a href="#"><b class="huiyuanjie"><img
								height="33px"
								src="${pageContext.request.contextPath}/images/ds.png" alt=""></b><br>
							<span>待收货</span></a></li>
					<li><a href="#"><b class="shuo"><img height="33px"
								src="${pageContext.request.contextPath}/images/dp.png" alt=""></b><br>
							<span>待评价</span></a></li>
					<li><a href="#"><b class="gifts"><img height="33px"
								src="${pageContext.request.contextPath}/images/st.png" alt="">
								<!-- <em>NEW</em> --></b><br> <span>退款/售后</span></a></li>
				</ul>
				<div class="funcBox">
					<h3>我的代金券</h3>
					<ul class="row" data-columns="3">
						<!--<li><a href="javascript:void(0)/m/my/bonus/"><b class="hongbao"></b><br/><span>红包</span></a></li>-->
						<li><a href=""><b class="cash"><img height="33px"
									src="${pageContext.request.contextPath}/images/dj.png" alt=""></b><br>
								<span>代金券(<span style="color: red">0</span>)
							</span></a></li>
					</ul>
				</div>
			</div>

			<div class="center_main">
				<ul>
					<li><a href="#"><i class="arrow"><em></em><span></span></i><b
							class="icon phone"></b>修改手机</a></li>

					<li><a href="#"><i class="arrow"><em></em><span></span></i><b
							class="icon tongzhi"></b>我的消息</a></li>
					<li><a href="#"><i class="arrow"><em></em><span></span></i><b
							class="icon shoucang"></b>我的收藏</a></li>
					<li><a href=""><i class="arrow"><em></em><span></span></i><b
							class="icon shezhi"></b>个人信息设置</a></li>
					<li><a href="#"><button
								style="width: 100%; background-color: #fff; color: red;">安全退出</button></a></li>
				</ul>
			</div>
		</div>
	</article>
	<div
		style="width: 100%; height: : 40px; border-top: 10px; border-bottom: 100px solid #FFF;">
	</div>
	<script>
	hapj(function(H){				
		var screenH=$(window).height();  //642
		var bdH=$('#bd').outerHeight();   //172
		var footerH=$('footer').outerHeight();//110
		if(bdH<screenH-footerH){
			bdH=screenH-footerH-42;
			$('#bd').css('minHeight',bdH);
		};
	})
</script>


	<script src="${pageContext.request.contextPath}/js/cm.js"
		type="text/javascript"></script>

	

	<footer id="fk">
		<a href="index.action">
			<div id="fkk">
				<img src="${pageContext.request.contextPath}/images/sy2.png">
				<p>首页</p>
			</div>
		</a> <a href="usermoregoods.action">
			<div id="fkk">
				<img src="${pageContext.request.contextPath}/images/sp2.png">
				<p>更多商品</p>
			</div>
		</a> <a href="usergwc.action">
			<div id="fkk">
				<img src="${pageContext.request.contextPath}/images/gwc2.png">
				<p>购物车</p>
			</div>
		</a> <a href="usermain.action">
			<div id="fkk">
				<img src="${pageContext.request.contextPath}/images/gr1.png">
				<p class="red">个人中心</p>
			</div>
		</a>
	</footer>



</body>
</html>