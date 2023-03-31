<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>

<link href="/_ui/responsive/common/css/landingLayout2Page.css" rel="stylesheet" type="text/css"/>
<div class="customBannersComponent">
<h2 style="color: rgba(25, 38, 38, 0.607); text-align: center; font-family: cursive;"  class="customBannersComponent_headrer_text"> &nbsp;  &nbsp;  &nbsp;" <u>${headrerText}</u> "</h2></br>
<img style="width:1262px;height:1080px; border-style: dotted; border:6px solid #0d2c2e; align-self: center;" alt="" src="${bannerImage.url}" class="banners_image">
<ul class="banners_list"></br>
<c:forEach items="${offerImageLink}" var="bannerImageLink">
<ol style=" text-align: center; font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif; font-size: larger;" class="banners_list_element"><a href="${bannerImageLink.url}"> <u>${bannerImageLink.name}</u></a></ol>
</c:forEach>
</ul>
<h1 style="color: rgb(5, 44, 93); text-align: center; font-family: fantasy;" class="customBannersComponent_footer_text"> " <u>${footerText}</u> "</h1>
</div>