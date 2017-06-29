<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
<title>好吃的-用户主页</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/normalize.css" />

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/flickity-docs.css"
	media="screen" />

<style type="text/css">
body {
	padding: 0;
	margin: 0
}

.form-control {
	height: 2rem;
	display: block;
	width: 93%;
	padding: 2px 6px;
	font-size: 14px;
	line-height: 1.42857143;
	color: #555;
	background-color: #fff;
	background-image: none;
	border: 1px solid #ccc;
	border-radius: 4px;
	-webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
	-webkit-transition: border-color ease-in-out .15s, -webkit-box-shadow
		ease-in-out .15s;
	-o-transition: border-color ease-in-out .15s, box-shadow ease-in-out
		.15s;
	transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s;
	display: block;
}

.btn {
	display: inline-block;
	padding: 6px 12px;
	margin-bottom: 0;
	font-size: 14px;
	font-weight: 400;
	line-height: 1.42857143;
	text-align: center;
	white-space: nowrap;
	vertical-align: middle;
	-ms-touch-action: manipulation;
	touch-action: manipulation;
	cursor: pointer;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
	background-image: none;
	border: 1px solid transparent;
	border-radius: 4px;
	height: 2.2rem
}

.btn-warning {
	color: #fff;
	background-color: #f0ad4e;
	border-color: #eea236
}

.product {
	-webkit-box-shadow: 0 0 10px rgba(0, 204, 204, .5);
	-moz-box-shadow: 0 0 10px rgba(0, 204, 204, .5);
	box-shadow: 0 0 10px rgba(0, 204, 204, .5);
}
</style>
</head>
<body>

	<!-- 
	
	<div style="width:100%;height:2.7rem;background-color: black;text-align: center;position: fixed;top:0">
		<span style="color:white;font-color:white;text-align:center;line-height: 2.7rem">
			好吃的主页
		</span>
	</div>
	
	
	<div style="clear:both;height:2.7rem"></div>
	 -->

	<!-- 页面头  地区和搜索框 -->
	<div style="width: 100%">
		<table style="width: 100%; height: 3rem; text-align: center"
			border="0">
			<tr>
				<td style="width: 20%">地区</td>
				<td style="width: 55%" style="padding:5px"><input type="text"
					class="form-control" placeholder="请输入商品名称关键字" style="height: 2rem" /></td>
				<td style="width: 25%">
					<button class="btn btn-warning">搜索</button>
				</td>
			</tr>
		</table>
	</div>
	<!-- 页面体  轮播图 -->
	<div
		style="text-align: center; width: 100%; min-height: 10rem;margin-top: -1rem">

		<div class="container">

			<div class="hero-gallery js-flickity">
				<div class="hero-gallery__cell hero-gallery__cell--1">
					<div class="content-wrap">
						<img style="width: 100%"
							src="${pageContext.request.contextPath}/image/sample-01.jpg" class="lunbo">
					</div>
				</div>
				<div class="hero-gallery__cell hero-gallery__cell--2">
					<div class="content-wrap">
						<img style="width: 100%"
							src="${pageContext.request.contextPath}/image/sample-02.jpg" class="lunbo">
					</div>
				</div>
				<div class="hero-gallery__cell hero-gallery__cell--3">
					<div class="content-wrap">
						<img style="width: 100%"
							src="${pageContext.request.contextPath}/image/sample-03.jpg" class="lunbo">
					</div>
				</div>
				<div class="hero-gallery__cell hero-gallery__cell--4">
					<div class="content-wrap">
						<img style="width: 100%"
							src="${pageContext.request.contextPath}/image/sample-04.jpg" class="lunbo">
					</div>
				</div>
			</div>

		</div>

	</div>

	<div style="background-color: white; width: 100%; height: 0.5rem;margin-top: -8rem"></div>
	<br>
	<!-- 商品展示 -->
	<div style="width: 90%; margin-left: 5%">

		<table style="width: 100%">
			<tr>
				<td style="width: 49%">
					<div style="position: relative;" class="product">
						<img
							src="${pageContext.request.contextPath}/image/producttest.jpg"
							style="width: 100%" />

						<div
							style="width: 100%; height: 2rem; line-height: 2rem; text-align: center; border: solid 1px #DEDEDF; color: red">
							商品名</div>

					</div>
				</td>
				<td style="width: 2%"></td>
				<td style="width: 49%">
					<div style="position: relative;" class="product">
						<img
							src="${pageContext.request.contextPath}/image/producttest.jpg"
							style="width: 100%" />

						<div
							style="width: 100%; height: 2rem; line-height: 2rem; text-align: left; border: solid 1px #DEDEDF; color: red">
							商品价格</div>

					</div>
				</td>
			</tr>
		</table>

		<div style="width: 100%; height: 5rem; border-bottom: solid 1px gray"></div>

		<div style="width: 100%; height: 5rem"></div>

	</div>

	<!-- 页面尾 -->
	<div
		style="background-image: url(${pageContext.request.contextPath}/image/bottombg.png);width:100%;height:3rem;position:fixed;bottom:0">
		<table style="width: 100%; text-align: center">
			<tr>
				<td style="width: 33.3%"><img
					src="${pageContext.request.contextPath}/image/home.png"
					style="width: 35%" /></td>
				<td style="width: 33.3%"><img
					src="${pageContext.request.contextPath}/image/cart.png"
					style="width: 35%" /></td>
				<td style="width: 33.3%"><img
					src="${pageContext.request.contextPath}/image/person.png"
					style="width: 35%" /></td>
			</tr>
		</table>
	</div>

	<script
		src="${pageContext.request.contextPath}/js/flickity-docs.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<script>
	$(function(){
		$('.hero-gallery__cell').height($('.lunbo').height());
		$('.flickity-page-dots').hidden();
	}); 
	
	</script>

</body>
</html>