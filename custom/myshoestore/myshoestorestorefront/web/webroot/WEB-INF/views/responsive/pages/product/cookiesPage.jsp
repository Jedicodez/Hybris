
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.lang.*" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/responsive/formElement" %>
<div class="row">
        <div class="col-sm-6 col-sm-push-6">
            <div class="accountActions">
                <form:form action="updateCookies" method="get">
            	    <button type="submit" class="btn btn-primary btn-block">
                        <spring:theme code="UpdateCookies" text="Update Cookies"/>
                    </button>
                </form:form>
            </div>
        </div>
        <div class="col-sm-6 col-sm-pull-6">
            <div class="accountActions">
                <form:form action="createCookies" method="get">
            	    <button type="submit" class="btn btn-primary btn-block">
                        <spring:theme code="createCookies" text="create Cookies"/>
                    </button>
                </form:form>
            </div>
        </div>
    </div>

<br>

 <template:page pageTitle="${pageTitle}">
<c:if test="${not empty  cookiesData}">
<table>
   <tr>
    <th><spring:theme code="myshoestore.Cookies.pkgId"/></th>
    <th><spring:theme code="myshoestore.Cookies.name"/></th>
   <th><spring:theme code="myshoestore.Cookies.MRP"/></th>
   <th><spring:theme code="myshoestore.Cookies.mfgBy"/></th>

           </tr>
<c:forEach items="${cookiesData}" var="cookiesData">
<tr>
<td>${cookiesData.pkgId}</td>
<td>${cookiesData.name}</td>
<td>${cookiesData.MRP}</td>
<td>${cookiesData.mfgBy}</td>
<td>
<form:form action="deleteCookies/${cookiesData.pkgId}" method="post">
		        <button type="submit" class="btn btn-danger btn-block">
                    <spring:theme code="Delete" text="Delete"/>
                </button>
            </form:form>
  </td>
</tr>
</c:forEach>
</table>
</c:if>
</template:page>