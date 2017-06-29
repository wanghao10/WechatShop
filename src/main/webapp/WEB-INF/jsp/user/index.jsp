<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<meta name="format-detection" content="telephone=no">
<title>好吃的校园商城</title>

<link href="${pageContext.request.contextPath}/css/owl.carousel.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/public.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/index.css"
	rel="stylesheet" type="text/css" />
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
<script src="${pageContext.request.contextPath}/js/owl.carousel.min.js"></script>
<script src="${pageContext.request.contextPath}/layer/layer.js"></script>

<script type="text/javascript">
	$(document)
			.ready(
					function() {
						$(".mall_list a")
								.click(
										function() {
											var index = layer
													.open({
														type : 1,
														title : false,
														closeBtn : false,
														shadeClose : false,
														offset : '25%',
														content : "<div class='no_login_show'><h1>亲！您还没登录好吃的哦！</h1><a href='login.html'>马上登录</a><a href='register.html'>免费注册</a><a href='javascript:layer.closeAll();'>取消</a></div>"
													})
										});
						$("#msg_bijia").click(function() {
							layer.tips('请耐心等待一下，我们正在拼命开发中···', '#msg_bijia');
						});

						$('#refresh').click(function() {
							location.reload();
						})

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
		<div class="top w">
			<div class="m_banner" id="owl">
				<a href="#" class="item"><img
					src="${pageContext.request.contextPath}/images/10250290397.png"></a>
				<a href="" class="item"><img
					src="${pageContext.request.contextPath}/images/10225357963.jpg"></a>
			</div>
			<div class="m_nav">
				<a href="#/mall/index.html"><img
					src="${pageContext.request.contextPath}/images/m-index_10.png"><span>商城返利</span></a>
				<a href="#/baoliao/index.html"><img
					src="${pageContext.request.contextPath}/images/m-index_12.png"><span>优惠爆料</span></a>
				<a href="#/taobao/index.html"><img
					src="${pageContext.request.contextPath}/images/m-index_14.png"><span>收藏</span></a>
				<a href="#/article/index.html"><img
					src="${pageContext.request.contextPath}/images/m-index_16.png"><span>购物资讯</span></a>

			</div>
		</div>
		<div class="m_baoliao w">
			<div class="baoliao_title">
				<span>商品信息</span><em><a href="#" id="refresh"><img
						src="${pageContext.request.contextPath}/images/iconfont-shuaxin.png"></a></em>
			</div>
			<div class="baoliao_list">
				<c:forEach var="ware" items="${wares}">
					<!-- 商品详情页面 -->
					<a href="xiangxixinxi.action?id=${ware.wareId}">
						<div class="baoliao_content">
							<div class="bl_img">
								<!-- 商品图片 -->
								<img src="${ware.imageUrl}" />
							</div>
							<div class="bl_right">
								<div class="bl_title">
									<!-- 商品名 -->${ware.name}</div>
								<div class="bl_note">
									<!-- 促销广告 -->${ware.describe}</div>
								<div class="bl_tag">
									<div class="bl_price">
										<!-- 商品价格 -->
										￥${ware.price}
									</div>
									<div class="bl_oprice">
										<!-- 商品原价 -->
										原价:${ware.yuanjia}
									</div>
									<div class="bl_time">
										<!-- 商品上传时间 -->
										${ware.date}
									</div>
									<div class="bl_mall">
										<!-- 上传楼长楼号 -->
										${ware.managerid}
									</div>
								</div>
							</div>
						</div>
					</a>
				</c:forEach>

				<a href="baoliao_view.html">
					<div class="baoliao_content">
						<div class="bl_img">
							<img src="#/upload/2015/0710/12332059693.jpg" />
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


			<!-- 加载更多 -->
			<div class="bl_more">
				<a href="usermoregoods.action">更多</a>
			</div>

		</div>
		<div class="footer w">h</div>
	</div>
	<div class="gotop backtop" style="display: none;"></div>
	<footer>
		<a href="index.action">
			<div class="mune">
				<img src="${pageContext.request.contextPath}/images/sy1.png">
				<p class="red">首页</p>
			</div>
		</a> <a href="usermoregoods.action">
			<div class="mune">
				<img src="${pageContext.request.contextPath}/images/sp2.png">
				<p>更多商品</p>
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
</body>
</html>
<script type="text/javascript">
	//返回顶部
	$(document)
			.ready(
					function() {
						$(window)
								.scroll(
										function() {
											var scrollHeight = $(document)
													.height();
											var scrollTop = $(window)
													.scrollTop();
											var $windowHeight = $(window)
													.innerHeight();
											scrollTop > 75 ? $(".gotop")
													.fadeIn(200).css("display",
															"block")
													: $(".gotop")
															.fadeOut(200)
															.css(
																	{
																		"background-image" : "url(${pageContext.request.contextPath}/images/iconfont-fanhuidingbu.png)"
																	});
										});
						$('.backtop')
								.click(
										function(e) {
											$(".gotop")
													.css(
															{
																"background-image" : "url(${pageContext.request.contextPath}/${pageContext.request.contextPath}/images/iconfont-fanhuidingbu_up.png)"
															});
											e.preventDefault();
											$('html,body').animate({
												scrollTop : 0
											});
										});
					});
</script>