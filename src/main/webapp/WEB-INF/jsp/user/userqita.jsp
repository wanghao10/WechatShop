<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>好吃的校园商城</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="author" content="m.178hui.com" />
<meta name="applicable-device" content="mobile" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<title>查询</title>
<link href="${pageContext.request.contextPath}/css/public.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/baoliao.css"
	rel="stylesheet" type="text/css">

<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
<script>
	$(window).load(function() {
		$("#status").fadeOut();
		$("#preloader").delay(350).fadeOut("slow");
	})
</script>
<script type="text/javascript">
	$(document).ready(function() {
		$(".shaixuan").click(function(event) {
			event.stopPropagation();
			$(".shaixuan_box").show();
			$(".shaixuan_box").animate({
				right : '100%'
			});
			$("body,html").css("overflow", "hidden");
			$(".shaixuan_box").css("overflow", "auto");
			$('body').bind("touchmove", function(e) {
				e.preventDefault();
			});
		});
		$(".shaixuan_mall a").click(function(event) {
			$("body,html").css("overflow", "auto");
			$(".shaixuan_box").animate({
				right : '-100%'
			});
			$(".shaixuan_box").hide(5);
			$("body").unbind("touchmove");
		});
		$('#sousuo').click(function() {
			var val = $('#sousuokuang').val();
			window.location.href = 'search.action?val=' + val;
		})
	});
</script>
</head>

<body>
	<div class="mobile">
		<div class="search w">
			<form action="" method="get">
				<input name="" type="text" class="search_input" placeholder="搜索商品"
					id="sousuokuang"><input name="" type="button"
					class="search_submit" value="搜索" id="sousuo">
			</form>
		</div>

		<div class="baoliao w">
			<div class="ui-tab">
				<ul class="ui-tab-nav">
					<li><a href="usermoregoods.action">全部</a></li>
					<li><a href="userlingshi.action">零食</a></li>
					<li><a href="usershuiguo.action">水果</a></li>
					<li class="current"><a href="userqita.action">其他</a></li>
				</ul>

				<!-- 零食页面 -->

				<div class="ui-tab-content">

					<a href="baoliao_view.html">
						<div class="baoliao_content">
							<div class="bl_img">
								<img
									src="http://baoliao.178hui.com/upload/2015/0710/12332059693.jpg" />
							</div>
							<div class="bl_right">
								<div class="bl_title">韩国现代（HYUNDAI) BD-YS2003 多功能养生壶
									煎药壶2.0L</div>
								<div class="bl_note">手机端：99元包邮</div>
								<div class="bl_tag">
									<div class="bl_price">￥99.00</div>
									<div class="bl_oprice">￥138.00</div>
									<div class="bl_time">07-10 12:33</div>
									<div class="bl_mall">京东商城</div>
								</div>
							</div>
						</div>
					</a>
				</div>
				<div class="bl_more">
					<a href="#">加载更多</a>
				</div>
			</div>
		</div>
		<div class="footer w">h</div>
		<footer>
			<a href="index.action">
				<div class="mune">
					<img src="${pageContext.request.contextPath}/images/sy2.png">
					<p>首页</p>
				</div>
			</a> <a href="usermoregoods.action">
				<div class="mune">
					<img src="${pageContext.request.contextPath}/images/sp1.png">
					<p class="red">更多商品</p>
				</div>
			</a> <a href="usergwc.action">
				<div class="mune">
					<img src="${pageContext.request.contextPath}/images/gwc2.png">
					<p>购物车</p>
				</div>
			</a> <a href="usermain.action">
				<div class="mune">
					<img src="${pageContext.request.contextPath}/images/gr2.png">
					<p>个人中心</p>
				</div>
			</a>
		</footer>

		<script>
			(function(doc, win) {
				var docEl = doc.documentElement, resizeEvt = 'orientationchange' in window ? 'orientationchange'
						: 'resize', recalc = function() {
					var clientWidth = docEl.clientWidth;
					if (!clientWidth)
						return;
					docEl.style.fontSize = 100 * (clientWidth / 750) + 'px';
				};

				if (!doc.addEventListener)
					return;
				win.addEventListener(resizeEvt, recalc, false);
				doc.addEventListener('DOMContentLoaded', recalc, false);
			})(document, window);
		</script>
		<script type="text/javascript">
			$('.check-on').click(function() {
				$(this).toggleClass('check-off');
			})
		</script>
	</div>
</body>