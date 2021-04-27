<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2021/4/27
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <input type="hidden" name="bId" value="${qBook.BId}"/>
        书籍名称：<input type="text" name="bName" value="${qBook.BName}"/>
        书籍数量：<input type="text" name="bCount" value="${qBook.BCount}"/>
        书籍详情：<input type="text" name="bDeatil" value="${qBook.BDeatil}"/>
        <input type="submit" value="提交"/>
    </form>

</div>