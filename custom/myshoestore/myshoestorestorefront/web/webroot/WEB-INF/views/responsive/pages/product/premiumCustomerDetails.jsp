
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.lang.*" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

 <template:page pageTitle="${pageTitle}">
<c:if test="${not empty  premiumCustomerData}">
<table>
   <tr>
    <th><spring:theme code="myshoestore.PremiumCustomer.royaltyPoints"/></th>
    <th><spring:theme code="myshoestore.PremiumCustomer.specialDiscount"/></th>
   <th><spring:theme code="myshoestore.PremiumCustomer.freeDelivery"/></th>
   <th><spring:theme code="myshoestore.PremiumCustomer.freeGifts"/></th>
    <th><spring:theme code="myshoestore.PremiumCustomer.buyOnEMI"/></th>
    <th><spring:theme code="myshoestore.PremiumCustomer.totalEMI"/></th>

           </tr>
<c:forEach items="${premiumCustomerData}" var="premiumCustomerData">
<tr>
<td>${premiumCustomerData.royaltyPoints}</td>
<td>${premiumCustomerData.specialDiscount}</td>
<td>${premiumCustomerData.freeDelivery}</td>
<td>${premiumCustomerData.freeGifts}</td>
<td>${premiumCustomerData.buyOnEMI}</td>
<td>${premiumCustomerData.totalEMI}</td>
</tr>
</c:forEach>
</table>
</c:if>
</template:page>