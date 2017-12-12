<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="pmp" tagdir="/src/main/webapp/WEB-INF/tags" %>
<%@ include file="/src/main/webapp/WEB-INF/views/common/include/taglib.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>



    <title>登录 - 辛普项目管理平台</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <meta http-equiv="Cache-Control" content="no-store"/>
    <meta http-equiv="Pragma" content="no-cache"/>
    <meta http-equiv="Expires" content="0"/>
    <!--[if lt IE 9]
        <meta http-equiv="refresh" content="0;ie.html" />>
    <![endif]-->
    ${bootstrap_css}
    ${font_awesome_css}
    ${animate_css}
    ${stylemin862f_css}
    ${jquery_js}
    ${bootstrap_js}
    ${validate_css}
    ${validate_js}
    <style type="text/css">
        .uname {background: #fff url(${ctx}/static/pmp/image/user.png) no-repeat 95% center;color: #333}
        .pword {background: #fff url(${ctx}/static/pmp/image/locked.png) no-repeat 95% center; color: #333}
        .logo-name {  color: #e6e6e6;  font-size: 120px;  font-weight: 400;  letter-spacing: -6px;  margin: 0;  }
        .header {
            /*height: 80px;*/
            padding-top:10px;
        }
        .hider {display: none;}
        .msg {position: relative;  width: 300px;  margin: 0 auto;  padding: 5px;}
        label.error {background: none;  width: 200px;  font-weight: normal;  color: inherit;  margin: 0;  padding-bottom: 0;  vertical-align: middle;}
    </style>
    <script type="text/javascript">
        if (window.top !== window.self) {
            window.top.location = window.location;
        }
        $(document).ready(function () {
            $("#loginForm").validate({
                rules: {
                    username: {required: true},
                    password: {required: true},
                    captcha: {required: true, remote: "${ctx}/captcha.ajax"}
                },
                messages: {
                    username: {required: "请填写用户名."},
                    password: {required: "请填写密码."},
                    captcha: {remote: "验证码不正确.", required: "请填写验证码."}
                },
                errorLabelContainer: "#messageBox",
                errorPlacement: function (error, element) {
                    debugger;
                    error.appendTo($("#loginError").parent());
                }
            });
            
            $("#username").focus();
        });
    </script>
</head>
<body class="gray-bg">
<!--[if lte IE 9]><br/>
<div class='alert alert-block' style="text-align:center;padding-bottom:10px;"><a class="close" data-dismiss="alert">x</a><h4>温馨提示：</h4>
    <p>你使用的浏览器版本过低。为了获得更好的浏览体验，我们强烈建议您 <a href="http://browsehappy.com" target="_blank">升级</a> 到最新版本的IE浏览器，或者使用较新版本的 Chrome、Firefox、Safari 等。</p></div><![endif]-->
<div class="text-center animated fadeInDown" style="padding-top: 30px ">
    <h1 class="logo-name">SPMP</h1>
</div>
<div class="header">
    <div id="messageBox" class="msg alert-danger ${empty message ? 'hider' : ''}">
        <button data-dismiss="alert" class="close">×</button>
        <label id="loginError" class="error">${message}</label>
    </div>
</div>
<div class="middle-box text-center loginscreen  animated fadeInDown" style="padding-top: 0;margin-top: -20px">
    <div>
        <h2>欢迎使用 辛普项目管理平台</h2>
        <form class="m-t" role="form" id="loginForm" action="${ctx}/login.html" method="post">
            <div class="form-group text-left">
                <input type="text" id="username" name="username" class="form-control uname " placeholder="用户名"/>
            </div>
            <div class="form-group text-left">
                <input type="password" name="password" class="form-control pword" placeholder="密码"/>
            </div>
            <c:if test="${isValidateCodeLogin}">
                <div class="form-group form-inline text-left">
                    <pmp:captcha name="captcha"/>
                </div>
            </c:if>
            <button type="submit" class="btn btn-primary block full-width m-b">登 录</button>
            <p class="text-muted text-center">
                <label for="rememberMe" title="下次不需要再登录"><input type="checkbox" id="rememberMe" name="rememberMe" ${rememberMe ? 'checked' : ''}/> 记住我（公共场所慎用）</label>
            </p>
        </form>
    </div>
</div>
</body>
</html>
