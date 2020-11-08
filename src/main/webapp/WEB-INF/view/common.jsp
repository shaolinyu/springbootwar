<!-- /WEB-INF/views/jsp/common.jsp -->
<%@page import="java.util.*"%>
<%
 	response.setHeader("Cache-Control","no-store"); //HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader("Expires", 0); //prevents caching at the proxy server
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() + path;
	String imgPath = basePath + "/images";
	String cssPath = basePath + "/css";
	String jsPath = basePath + "/js";  
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:set var="ctx" value="<%=basePath %>" />
<c:set var="static_resources_path" value="${ctx}/static" />
<c:set var="img_path" value="${static_resources_path}/img" />
<c:set var="css_path" value="${static_resources_path}/css" />
<c:set var="js_path" value="${static_resources_path}/js" />

