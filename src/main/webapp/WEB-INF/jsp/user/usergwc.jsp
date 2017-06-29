<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<title>好吃的校园商城</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/gwcstyle.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/gwcgoodscar.css" />

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.2.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/js.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/goodscar.js"></script>
</head>

<body>
	<!--头部信息 start-->
	<div class="head_info">
		<a onclick="window.history.go(-1)" class="head_info_return"><img
			src="${pageContext.request.contextPath}/images/head_returnIcon.png" /></a> <span>购物车</span> <a href="#"
			class="head_info_other">完成</a>
	</div>
	<!--头部信息 end-->

	<!--无商品页面 与 有商品模块切换，后台调用购物车list数据，如果购物车无数据，如果有数据则显示该注释下方代码-->
	<!--内容信息 start-->
	<div class="main_con">
		<div class="main_con_allchoose">
			<span class="circle"></span>全选 <a href="javascript:del_goods()"><img
				src="${pageContext.request.contextPath}/images/goods_del.png" /></a>
		</div>
		<div class="main_con_goods">
			<ul>
				<li><span class="circle"></span> <img
					src="${pageContext.request.contextPath}/images/goodscar_pic1.png" />
					<div>
						<p class="title">
							<a href=""><font>产品名称</font>描述描述描述描述描述描述描述描述描述描述描述描描述...</a>
						</p>
						<p class="money">
							<font>25.60￥</font><b>库存100件</b> <input class="add" type="button"
								value="+" /> <input class="num" type="text" value="1" /> <input
								class="del" type="button" value="-" />
						</p>
					</div></li>
				
			</ul>

		</div>
	</div>
	<!--内容信息 end-->

	<!--结算信息 start-->
	<div class="settlement">
		<div class="settlement_left">
			<font class="zongji">总计：</font><font class="money">￥0</font><br />
			（共0件，不包含运费）
		</div>
		<div class="settlement_right">
			<a href="dd.html"><input type="button" value="去结算" /></a>
		</div>
	</div>
	<!--结算信息 end-->

	<!--删除弹窗 start-->
	<div class="del_tc">
		<div class="del_tc_box">
			<div class="del_tc_box_title">确认删除此商品？</div>
			<div class="del_tc_box_content">
				<input class="cancel" type="button" value="取消"
					onclick="del_goods_cancel()" /> <input class="ok" type="button"
					value="确认" />
			</div>
		</div>
	</div>
	<!--删除弹窗 end-->

	<!--无商品页面 与 有商品模块切换，后台调用购物车list数据，如果购物车无数据，则显示该注释下方代码-->
	<!--goodscar.css 修改样式 .no_goods{display: block}-->

	<!--无商品页面 start-->
	<div class="no_goods">
		<img src="images/no_goods_ico.png" />
		<p>
			购物车里没有东西哦~<br />快去商城逛逛吧！
		</p>
		<a href="">即刻添置</a>
	</div>
</body>

</html>